package com.data;

public class Company
{
	private int compId;
	private String compName;
	private Address address;
	public int getCompId()
	{
		return compId;
	}
	public void setCompId(int compId)
	{
		this.compId = compId;
	}
	public String getCompName()
	{
		return compName;
	}
	public void setCompName(String compName)
	{
		this.compName = compName;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address = address;
	}
	@Override
	public String toString()
	{
		return "Company [compId=" + compId + ", compName=" + compName + ", address=" + address + "]";
	}
	public Company(int compId, String compName, Address address)
	{
		super();
		this.compId = compId;
		this.compName = compName;
		this.address = address;
	}
	public Company()
	{
		super();
	}
	
}
