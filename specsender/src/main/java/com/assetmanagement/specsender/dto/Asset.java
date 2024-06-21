package com.assetmanagement.specsender.dto;

public class Asset {

	private Long id;
	private String category;
	private String assetId;
	private String assetName;
	private String brand;
	private String modelNumber;
	private String serialNumber;
	private String poNumber;
	private String dcNumber;
	private double cost;
	private String remark;
	private String assetType;
	private String asset;
	private String vendor;
	private double rent;
	private String serviceTag;
	private String status;
	private String operationalStatus;
	
	
	

	public Asset() {
		super();
		
	}



	public Asset(Long id, String category, String assetId, String assetName, String brand, String modelNumber,
			String serialNumber, String poNumber, String dcNumber, double cost, String remark, String assetType,
			String asset, String vendor, double rent, String serviceTag, String status, String operationalStatus) {
		super();
		this.id = id;
		this.category = category;
		this.assetId = assetId;
		this.assetName = assetName;
		this.brand = brand;
		this.modelNumber = modelNumber;
		this.serialNumber = serialNumber;
		this.poNumber = poNumber;
		this.dcNumber = dcNumber;
		this.cost = cost;
		this.remark = remark;
		this.assetType = assetType;
		this.asset = asset;
		this.vendor = vendor;
		this.rent = rent;
		this.serviceTag = serviceTag;
		this.status = status;
		this.operationalStatus = operationalStatus;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getDcNumber() {
		return dcNumber;
	}

	public void setDcNumber(String dcNumber) {
		this.dcNumber = dcNumber;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public String getServiceTag() {
		return serviceTag;
	}

	public void setServiceTag(String serviceTag) {
		this.serviceTag = serviceTag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOperationalStatus() {
		return operationalStatus;
	}

	public void setOperationalStatus(String operationalStatus) {
		this.operationalStatus = operationalStatus;
	}



	@Override
	public String toString() {
		return "Asset [id=" + id + ", category=" + category + ", assetId=" + assetId + ", assetName=" + assetName
				+ ", brand=" + brand + ", modelNumber=" + modelNumber + ", serialNumber=" + serialNumber + ", poNumber="
				+ poNumber + ", dcNumber=" + dcNumber + ", cost=" + cost + ", remark=" + remark + ", assetType="
				+ assetType + ", asset=" + asset + ", vendor=" + vendor + ", rent=" + rent + ", serviceTag="
				+ serviceTag + ", status=" + status + ", operationalStatus=" + operationalStatus + "]";
	}

}
