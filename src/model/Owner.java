package model;

public class Owner
{
	private String idNumber;
	private String name;
	private String phoneNumber;
	private String address;

	// Builders

	public Owner(String idNumber,String name,String phoneNumber,String address)
	{
		this.idNumber = idNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	// Getters & Setters

	public String getIdNumber()
	{
		return idNumber;
	}

	public String getName()
	{
		return name;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public String getAddress()
	{
		return address;
	}

	public void setIdNumber(String idNumber)
	{
		this.idNumber = idNumber;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPhoneNumber()
	{
		this.phoneNumber = phoneNumber;
	}

	public void setAddress()
	{
		this.address = address;
	}
}