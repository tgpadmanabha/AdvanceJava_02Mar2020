package com.data;

public class Address
{
	private long pincode;
	private String cityName;
	
	public long getPicode()
	{
		return pincode;
	}
	
	public void setPincode(long pincode)
	{
		this.pincode = pincode;
	}
	
	public String getCityName()
	{
		return cityName;
	}
	
	public Address(long picode, String cityName)
	{
		super();
		this.pincode = pincode;
		this.cityName = cityName;
	}
	public Address()
	{
	}
	
	@Override
	public String toString()
	{
		return "Address [pincode=" + pincode + ", cityName=" + cityName + "]";
	}
	
	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}
}
