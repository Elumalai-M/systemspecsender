package com.assetmanagement.specsender.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assetmanagement.specsender.dto.SystemSpecfication;
import com.assetmanagement.specsender.service.SystemIntfoService;

import oshi.SystemInfo;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.NetworkIF;
import oshi.hardware.PhysicalMemory;
import oshi.software.os.OperatingSystem;

@Service
public class SystemInfoServiceImpl implements SystemIntfoService {

	private final RestTemplate restTemplate;

	public static String fetchassetUrl = "http://localhost:8080/asset/getAssetBySerialNumber/";

	private static final String BASE_URL = "http://localhost:8080/asset";

	private SystemInfo systemInfo;
	private HardwareAbstractionLayer hardware;
	private OperatingSystem os;

	public SystemInfoServiceImpl(RestTemplateBuilder builder) {

		this.restTemplate = builder.build();
		systemInfo = new SystemInfo();
		hardware = systemInfo.getHardware();
		os = systemInfo.getOperatingSystem();
	}

	@Override
	/* @Scheduled(fixedRate = 300000) */
	public SystemSpecfication getSystemDetails() {

		SystemSpecfication systemSpecfication = new SystemSpecfication();

		systemSpecfication.setSystemName(os.toString());
		systemSpecfication.setSystemSerialNumber(hardware.getComputerSystem().getSerialNumber());
		systemSpecfication.setProcessorName(hardware.getProcessor().getProcessorIdentifier().getName());
		systemSpecfication
				.setProcessorGeneration(hardware.getProcessor().getProcessorIdentifier().getMicroarchitecture());
		systemSpecfication
				.setProcessorClockSpeed(String.valueOf(hardware.getProcessor().getMaxFreq() / 1_000_000_000.0));

		PhysicalMemory physicalMemory_1 = hardware.getMemory().getPhysicalMemory().get(0);
		systemSpecfication.setRamCapacity_1(physicalMemory_1.getCapacity() / (1024 * 1024 * 1024) + " GB");
		systemSpecfication.setRamSerialumber_1(physicalMemory_1.getSerialNumber());
		systemSpecfication.setRamManufacturer_1(physicalMemory_1.getSerialNumber());

		if (hardware.getMemory().getPhysicalMemory().size() > 1) {
			PhysicalMemory physicalMemory_2 = hardware.getMemory().getPhysicalMemory().get(1);

			systemSpecfication.setRamCapacity_2(physicalMemory_2.getCapacity() / (1024 * 1024 * 1024) + " GB");
			systemSpecfication.setRamSerialNumber_2(physicalMemory_2.getSerialNumber());
			systemSpecfication.setRamManufacturer_2(physicalMemory_2.getManufacturer());
		}

		List<HWDiskStore> diskStores = hardware.getDiskStores();

		for (HWDiskStore disk : diskStores) {
			if (disk.getModel().toLowerCase().contains("ssd")) {
				systemSpecfication.setStorageDevice_SSD("SSD");
				systemSpecfication.setStorageSerialNumber_SSD(disk.getSerial());
				systemSpecfication.setStorageSize_SSD(disk.getSize() / (1024 * 1024 * 1024) + " GB");
			} else {
				systemSpecfication.setStorageDevice_HDD("HDD");
				systemSpecfication.setStorageSerialNumber_HDD(disk.getSerial());
				systemSpecfication.setStorageSize_HDD(disk.getSize() / (1024 * 1024 * 1024) + " GB");
			}
		}

		List<NetworkIF> networkIFs = hardware.getNetworkIFs();
		for (NetworkIF net : networkIFs) {

			if (net.getName().equalsIgnoreCase("eth3")) {
				systemSpecfication.setEth3_MAC_Address(net.getMacaddr());

			} else if (net.getName().equalsIgnoreCase("wlan0")) {
				systemSpecfication.setWlan0_MAC_Address(net.getMacaddr());
			} else if (net.getName().equalsIgnoreCase("wlan1")) {
				systemSpecfication.setWlan1_MAC_Address(net.getMacaddr());
			} else if (net.getName().equalsIgnoreCase("wlan2")) {
				systemSpecfication.setWlan2_MAC_Address(net.getMacaddr());
			} else if (net.getName().equalsIgnoreCase("eth5")) {
				systemSpecfication.setEth5_MAC_Address(net.getMacaddr());
			}

		}

		System.out.println(systemSpecfication.toString());
		return systemSpecfication;
	}

	/*
	 * OSVersionInfo versionInfo = os.getVersionInfo(); StringBuilder sb = new
	 * StringBuilder();
	 * sb.append("OS: ").append(os).append(" ").append(versionInfo).append("\n");
	 * sb.append("CPU: ").append(hardware.getProcessor()).append("\n");
	 * sb.append("Memory: ").append(FormatUtil.formatBytes(hardware.getMemory().
	 * getTotal())).append("\n");
	 * 
	 * System.out.println(sb.toString());
	 * 
	 * getInstalledApplications();
	 * 
	 * System.out.println("brand " + " -" +
	 * hardware.getComputerSystem().getManufacturer()); // brand
	 * System.out.println("modelNumber " + " -" +
	 * hardware.getComputerSystem().getModel()); // model
	 * System.out.println("SerialNumber" + " -" +
	 * hardware.getComputerSystem().getSerialNumber()); //serialnumber
	 * System.out.println("Baseboard" + " -" +
	 * hardware.getComputerSystem().getBaseboard()); System.out.println("Frimware" +
	 * " -" + hardware.getComputerSystem().getFirmware());
	 * 
	 * GlobalMemory memory = hardware.getMemory();
	 * 
	 * 
	 * // get processor cpu load
	 * 
	 * hardware.getProcessor().getProcessorCpuLoad(0);
	 */

	// get battery health we want to discuss

	// chargerType
	// displaySize
	// batteryHealth
	// lanMacAddress
	// wifiMacAddress
	// os
	// osVersion
	// processor
	// generation
	// clockSpeed
	// ram
	// storageType
	// storageCapacity

	/*
	 * List<PowerSource> powerSources = hardware.getPowerSources();
	 * System.out.println("getsize of powerSources :" +
	 * powerSources.get(0).getPowerUsageRate());
	 * 
	 * String systemName = os.toString(); System.out.println("System Name: " +
	 * systemName);
	 * 
	 * // Processor details CentralProcessor processor = hardware.getProcessor();
	 * String processorName = processor.getProcessorIdentifier().getName(); String
	 * processorGeneration =
	 * processor.getProcessorIdentifier().getMicroarchitecture(); double
	 * processorClockSpeed = processor.getMaxFreq() / 1_000_000_000.0; // Convert Hz
	 * to GHz System.out.println("Processor Name: " + processorName);
	 * System.out.println("Processor Generation: " + processorGeneration);
	 * System.out.println("Processor Clock Speed: " + processorClockSpeed + " GHz");
	 */

	// RAM details
	/*
	 * List<PhysicalMemory> memoryList = hardware.getMemory().getPhysicalMemory();
	 * for (PhysicalMemory memory : memoryList) {
	 * System.out.println("RAM Capacity: " + memory.getCapacity() / (1024 * 1024 *
	 * 1024) + " GB"); System.out.println("RAM Serial Number: " +
	 * memory.getSerialNumber()); System.out.println("RAM Manufacturer: " +
	 * memory.getManufacturer()); }
	 * 
	 * // Storage device details List<HWDiskStore> diskStores =
	 * hardware.getDiskStores(); for (HWDiskStore disk : diskStores) {
	 * System.out.println("Storage Device: " +
	 * (disk.getModel().toLowerCase().contains("ssd") ? "SSD" : "HDD"));
	 * System.out.println("Storage Serial Number: " + disk.getSerial());
	 * System.out.println("Storage Size: " + disk.getSize() / (1024 * 1024 * 1024) +
	 * " GB"); }
	 * 
	 * // MAC ID of LAN & WiFi List<NetworkIF> networkIFs =
	 * hardware.getNetworkIFs(); for (NetworkIF net : networkIFs) { String
	 * macAddress = net.getMacaddr(); String name = net.getName();
	 * System.out.println(name + " MAC Address: " + macAddress); }
	 */

	/*
	 * fetchassetUrl = fetchassetUrl +
	 * hardware.getComputerSystem().getSerialNumber();
	 * System.out.println(fetchassetUrl);
	 * 
	 * HttpHeaders headers = new HttpHeaders(); headers.set("Accept",
	 * "application/json");
	 * 
	 * HttpEntity<String> entity = new HttpEntity<>(headers);
	 * 
	 * ResponseEntity<AssetData> response = restTemplate.exchange(fetchassetUrl,
	 * HttpMethod.GET, entity, AssetData.class);
	 * 
	 * System.out.println(response.getBody().toString());
	 */

	public void getInstalledApplications() {
		// Use Runtime to execute wmic command and gather installed applications
		StringBuilder sb = new StringBuilder();
		try {
			Process process = Runtime.getRuntime().exec("wmic product get name,version");
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(sb.toString());
		// return
	}

	@Override
	@Scheduled(fixedRate = 300000)
	public void sendSpecification() {

		String url = BASE_URL + "/addspecification";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		SystemSpecfication systemDetails = getSystemDetails();
		HttpEntity<SystemSpecfication> requestEntity = new HttpEntity<>(systemDetails, headers);

		restTemplate.postForObject(url, requestEntity, Void.class);

	}

}
