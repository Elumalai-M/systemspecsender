package com.assetmanagement.specsender.dto;

public class SystemSpecfication {

	private String systemName;
	private String systemSerialNumber;
	private String processorName;
	private String processorGeneration;
	private String processorClockSpeed;
	private String ramCapacity_1;
	private String ramSerialumber_1;
	private String ramManufacturer_1;
	private String ramCapacity_2;
	private String ramSerialNumber_2;
	private String ramManufacturer_2;
	private String storageDevice_HDD;
	private String storageSerialNumber_HDD;
	private String storageSize_HDD;
	private String storageDevice_SSD;
	private String storageSerialNumber_SSD;
	private String storageSize_SSD;
	private String eth3_MAC_Address;
	private String wlan0_MAC_Address;
	private String wlan1_MAC_Address;
	private String wlan2_MAC_Address;
	private String eth5_MAC_Address;
	

	public SystemSpecfication() {
		super();
		
	}


	public String getSystemName() {
		return systemName;
	}


	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}


	public String getProcessorName() {
		return processorName;
	}


	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}


	public String getProcessorGeneration() {
		return processorGeneration;
	}


	public void setProcessorGeneration(String processorGeneration) {
		this.processorGeneration = processorGeneration;
	}


	public String getProcessorClockSpeed() {
		return processorClockSpeed;
	}


	public void setProcessorClockSpeed(String processorClockSpeed) {
		this.processorClockSpeed = processorClockSpeed;
	}


	public String getRamCapacity_1() {
		return ramCapacity_1;
	}


	public void setRamCapacity_1(String ramCapacity_1) {
		this.ramCapacity_1 = ramCapacity_1;
	}


	public String getRamSerialumber_1() {
		return ramSerialumber_1;
	}


	public void setRamSerialumber_1(String ramSerialumber_1) {
		this.ramSerialumber_1 = ramSerialumber_1;
	}


	public String getRamManufacturer_1() {
		return ramManufacturer_1;
	}


	public void setRamManufacturer_1(String ramManufacturer_1) {
		this.ramManufacturer_1 = ramManufacturer_1;
	}


	public String getRamCapacity_2() {
		return ramCapacity_2;
	}


	public void setRamCapacity_2(String ramCapacity_2) {
		this.ramCapacity_2 = ramCapacity_2;
	}


	public String getRamSerialNumber_2() {
		return ramSerialNumber_2;
	}


	public void setRamSerialNumber_2(String ramSerialNumber_2) {
		this.ramSerialNumber_2 = ramSerialNumber_2;
	}


	public String getRamManufacturer_2() {
		return ramManufacturer_2;
	}


	public void setRamManufacturer_2(String ramManufacturer_2) {
		this.ramManufacturer_2 = ramManufacturer_2;
	}


	public String getStorageDevice_HDD() {
		return storageDevice_HDD;
	}


	public void setStorageDevice_HDD(String storageDevice_HDD) {
		this.storageDevice_HDD = storageDevice_HDD;
	}


	public String getStorageSerialNumber_HDD() {
		return storageSerialNumber_HDD;
	}


	public void setStorageSerialNumber_HDD(String storageSerialNumber_HDD) {
		this.storageSerialNumber_HDD = storageSerialNumber_HDD;
	}


	public String getStorageSize_HDD() {
		return storageSize_HDD;
	}


	public void setStorageSize_HDD(String storageSize_HDD) {
		this.storageSize_HDD = storageSize_HDD;
	}


	public String getStorageDevice_SSD() {
		return storageDevice_SSD;
	}


	public void setStorageDevice_SSD(String storageDevice_SSD) {
		this.storageDevice_SSD = storageDevice_SSD;
	}


	public String getStorageSerialNumber_SSD() {
		return storageSerialNumber_SSD;
	}


	public void setStorageSerialNumber_SSD(String storageSerialNumber_SSD) {
		this.storageSerialNumber_SSD = storageSerialNumber_SSD;
	}


	public String getStorageSize_SSD() {
		return storageSize_SSD;
	}


	public void setStorageSize_SSD(String storageSize_SSD) {
		this.storageSize_SSD = storageSize_SSD;
	}


	public String getEth3_MAC_Address() {
		return eth3_MAC_Address;
	}


	public void setEth3_MAC_Address(String eth3_MAC_Address) {
		this.eth3_MAC_Address = eth3_MAC_Address;
	}


	public String getWlan0_MAC_Address() {
		return wlan0_MAC_Address;
	}


	public void setWlan0_MAC_Address(String wlan0_MAC_Address) {
		this.wlan0_MAC_Address = wlan0_MAC_Address;
	}


	public String getWlan1_MAC_Address() {
		return wlan1_MAC_Address;
	}


	public void setWlan1_MAC_Address(String wlan1_MAC_Address) {
		this.wlan1_MAC_Address = wlan1_MAC_Address;
	}


	public String getWlan2_MAC_Address() {
		return wlan2_MAC_Address;
	}


	public void setWlan2_MAC_Address(String wlan2_MAC_Address) {
		this.wlan2_MAC_Address = wlan2_MAC_Address;
	}


	public String getEth5_MAC_Address() {
		return eth5_MAC_Address;
	}


	public void setEth5_MAC_Address(String eth5_MAC_Address) {
		this.eth5_MAC_Address = eth5_MAC_Address;
	}


	public SystemSpecfication(String systemName, String processorName, String processorGeneration,
			String processorClockSpeed, String ramCapacity_1, String ramSerialumber_1, String ramManufacturer_1,
			String ramCapacity_2, String ramSerialNumber_2, String ramManufacturer_2, String storageDevice_HDD,
			String storageSerialNumber_HDD, String storageSize_HDD, String storageDevice_SSD,
			String storageSerialNumber_SSD, String storageSize_SSD, String eth3_MAC_Address, String wlan0_MAC_Address,
			String wlan1_MAC_Address, String wlan2_MAC_Address, String eth5_MAC_Address) {
		super();
		this.systemName = systemName;
		this.processorName = processorName;
		this.processorGeneration = processorGeneration;
		this.processorClockSpeed = processorClockSpeed;
		this.ramCapacity_1 = ramCapacity_1;
		this.ramSerialumber_1 = ramSerialumber_1;
		this.ramManufacturer_1 = ramManufacturer_1;
		this.ramCapacity_2 = ramCapacity_2;
		this.ramSerialNumber_2 = ramSerialNumber_2;
		this.ramManufacturer_2 = ramManufacturer_2;
		this.storageDevice_HDD = storageDevice_HDD;
		this.storageSerialNumber_HDD = storageSerialNumber_HDD;
		this.storageSize_HDD = storageSize_HDD;
		this.storageDevice_SSD = storageDevice_SSD;
		this.storageSerialNumber_SSD = storageSerialNumber_SSD;
		this.storageSize_SSD = storageSize_SSD;
		this.eth3_MAC_Address = eth3_MAC_Address;
		this.wlan0_MAC_Address = wlan0_MAC_Address;
		this.wlan1_MAC_Address = wlan1_MAC_Address;
		this.wlan2_MAC_Address = wlan2_MAC_Address;
		this.eth5_MAC_Address = eth5_MAC_Address;
	}





	public String getSystemSerialNumber() {
		return systemSerialNumber;
	}


	public void setSystemSerialNumber(String systemSerialNumber) {
		this.systemSerialNumber = systemSerialNumber;
	}


	@Override
	public String toString() {
		return "SystemSpecfication [systemName=" + systemName + ", systemSerialNumber=" + systemSerialNumber
				+ ", processorName=" + processorName + ", processorGeneration=" + processorGeneration
				+ ", processorClockSpeed=" + processorClockSpeed + ", ramCapacity_1=" + ramCapacity_1
				+ ", ramSerialumber_1=" + ramSerialumber_1 + ", ramManufacturer_1=" + ramManufacturer_1
				+ ", ramCapacity_2=" + ramCapacity_2 + ", ramSerialNumber_2=" + ramSerialNumber_2
				+ ", ramManufacturer_2=" + ramManufacturer_2 + ", storageDevice_HDD=" + storageDevice_HDD
				+ ", storageSerialNumber_HDD=" + storageSerialNumber_HDD + ", storageSize_HDD=" + storageSize_HDD
				+ ", storageDevice_SSD=" + storageDevice_SSD + ", storageSerialNumber_SSD=" + storageSerialNumber_SSD
				+ ", storageSize_SSD=" + storageSize_SSD + ", eth3_MAC_Address=" + eth3_MAC_Address
				+ ", wlan0_MAC_Address=" + wlan0_MAC_Address + ", wlan1_MAC_Address=" + wlan1_MAC_Address
				+ ", wlan2_MAC_Address=" + wlan2_MAC_Address + ", eth5_MAC_Address=" + eth5_MAC_Address + "]";
	}
	
	

}
