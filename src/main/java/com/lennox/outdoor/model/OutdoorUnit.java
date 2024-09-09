package com.lennox.outdoor.model;

public class OutdoorUnit {
	private String outdoorUnitName;
	public String getOutdoorUnitName() {
		return outdoorUnitName;
	}
	public void setOutdoorUnitName(String outdoorUnitName) {
		this.outdoorUnitName = outdoorUnitName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTonnage() {
		return tonnage;
	}
	public void setTonnage(Integer tonnage) {
		this.tonnage = tonnage;
	}
	private Integer id;
	private Integer tonnage;

}
