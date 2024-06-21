package com.assetmanagement.specsender.dto;


public class FixedAsset  {

    private String color;
    private String graphicsCard;
	private String ram;
    private String rom;
    private String material;
    private String os;
    private String osVersion;
    private String battery;
    private String chargerType;
    private String wireless;
    private String weight;
    private String dimension;
    private String ipAddress;
    private String connectorType;
    private String bluetoothVersion;
    private String chargingTime;

 
    // Getters and setters for all fields
    
    public FixedAsset() {
 		super();
 		// TODO Auto-generated constructor stub
 	}
    
    

    public FixedAsset(String color, String graphicsCard, String ram, String rom, String material, String os,
			String osVersion, String battery, String chargerType, String wireless, String weight, String dimension,
			String ipAddress, String connectorType, String bluetoothVersion, String chargingTime) {
		super();
		this.color = color;
		this.graphicsCard = graphicsCard;
		this.ram = ram;
		this.rom = rom;
		this.material = material;
		this.os = os;
		this.osVersion = osVersion;
		this.battery = battery;
		this.chargerType = chargerType;
		this.wireless = wireless;
		this.weight = weight;
		this.dimension = dimension;
		this.ipAddress = ipAddress;
		this.connectorType = connectorType;
		this.bluetoothVersion = bluetoothVersion;
		this.chargingTime = chargingTime;
	}



	public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getChargerType() {
        return chargerType;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    public String getWireless() {
        return wireless;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getConnectorType() {
        return connectorType;
    }

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    public String getBluetoothVersion() {
        return bluetoothVersion;
    }

    public void setBluetoothVersion(String bluetoothVersion) {
        this.bluetoothVersion = bluetoothVersion;
    }

    public String getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(String chargingTime) {
        this.chargingTime = chargingTime;
    }
}
