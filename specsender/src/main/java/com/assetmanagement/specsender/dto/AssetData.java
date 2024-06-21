package com.assetmanagement.specsender.dto;

public class AssetData {
	
    private Asset asset;
    private FixedAsset fixedasset;
	private ITAssetData itasset;
	
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public FixedAsset getFixedasset() {
		return fixedasset;
	}
	public void setFixedasset(FixedAsset fixedasset) {
		this.fixedasset = fixedasset;
	}
	public ITAssetData getItasset() {
		return itasset;
	}
	public void setItasset(ITAssetData itasset) {
		this.itasset = itasset;
	}
	@Override
	public String toString() {
		return "AssetData [asset=" + asset + ", fixedasset=" + fixedasset + ", itasset=" + itasset + "]";
	}

}
