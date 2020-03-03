package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address
{
	@Value(value = "560001")
	private long pincode;
	@Value(value = "Bengaluru")
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
