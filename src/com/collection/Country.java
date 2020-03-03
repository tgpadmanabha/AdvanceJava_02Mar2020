package com.collection;

import java.util.Properties;

public class Country
{
	private String name;
	private String continent;
	private Properties stateCapitals;
	public Country(String name, String continent, Properties stateCapitals)
	{
		super();
		this.name = name;
		this.continent = continent;
		this.stateCapitals = stateCapitals;
	}
	public Country()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getContinent()
	{
		return continent;
	}
	public void setContinent(String continent)
	{
		this.continent = continent;
	}
	public Properties getStateCapitals()
	{
		return stateCapitals;
	}
	public void setStateCapitals(Properties stateCapitals)
	{
		this.stateCapitals = stateCapitals;
	}
	@Override
	public String toString()
	{
		return "Country [name=" + name + ", continent=" + continent + ", stateCapitals=" + stateCapitals + "]";
	}
	public void printCapitals() {
		for(String state:stateCapitals.stringPropertyNames()) {System.out.println(state+":\t"+stateCapitals.getProperty(state));}
		stateCapitals.stringPropertyNames().forEach((state)->System.out.println(state+":\t"+stateCapitals.getProperty(state)));
	}
}
