package com.assetmanagement.specsender.dto;

public class ITAssetData {
	private String color;
	private String chargerType;
	private String displaySize;
	private String batteryHealth;
	private String lanMacAddress;
	private String wifiMacAddress;
	private String dcNumber;
	private String os;
	private String osVersion;
	private String processor;
	private String generation;
	private String clockSpeed;
	private String ram;
	private String storageType;
	private String storageCapacity;

	public ITAssetData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ITAssetData(String color, String chargerType, String displaySize, String batteryHealth, String lanMacAddress,
			String wifiMacAddress, String dcNumber, String os, String osVersion, String processor, String generation,
			String clockSpeed, String ram, String storageType, String storageCapacity) {
		super();
		this.color = color;
		this.chargerType = chargerType;
		this.displaySize = displaySize;
		this.batteryHealth = batteryHealth;
		this.lanMacAddress = lanMacAddress;
		this.wifiMacAddress = wifiMacAddress;
		this.dcNumber = dcNumber;
		this.os = os;
		this.osVersion = osVersion;
		this.processor = processor;
		this.generation = generation;
		this.clockSpeed = clockSpeed;
		this.ram = ram;
		this.storageType = storageType;
		this.storageCapacity = storageCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getChargerType() {
		return chargerType;
	}

	public void setChargerType(String chargerType) {
		this.chargerType = chargerType;
	}

	public String getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}

	public String getBatteryHealth() {
		return batteryHealth;
	}

	public void setBatteryHealth(String batteryHealth) {
		this.batteryHealth = batteryHealth;
	}

	public String getLanMacAddress() {
		return lanMacAddress;
	}

	public void setLanMacAddress(String lanMacAddress) {
		this.lanMacAddress = lanMacAddress;
	}

	public String getWifiMacAddress() {
		return wifiMacAddress;
	}

	public void setWifiMacAddress(String wifiMacAddress) {
		this.wifiMacAddress = wifiMacAddress;
	}

	public String getDcNumber() {
		return dcNumber;
	}

	public void setDcNumber(String dcNumber) {
		this.dcNumber = dcNumber;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	public String getClockSpeed() {
		return clockSpeed;
	}

	public void setClockSpeed(String clockSpeed) {
		this.clockSpeed = clockSpeed;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorageType() {
		return storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public String getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(String storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	@Override
	public String toString() {
		return "ITAssetData [color=" + color + ", chargerType=" + chargerType + ", displaySize=" + displaySize
				+ ", batteryHealth=" + batteryHealth + ", lanMacAddress=" + lanMacAddress + ", wifiMacAddress="
				+ wifiMacAddress + ", dcNumber=" + dcNumber + ", os=" + os + ", osVersion=" + osVersion + ", processor="
				+ processor + ", generation=" + generation + ", clockSpeed=" + clockSpeed + ", ram=" + ram
				+ ", storageType=" + storageType + ", storageCapacity=" + storageCapacity + "]";
	}
}
