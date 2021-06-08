package model;

public class Veterinarian
{
	// Attributes
	private String idNumber;
	private String name;
	private String lastNames;
	private int veterinarianRegister;

	// Relationships
	private Pet currentlyAttending;

	// Builder

	public Veterinarian(String idNumber, String name, String lastNames)
	{
		this.idNumber = idNumber;
		this.name = name;
		this.lastNames = lastNames;
		this.veterinarianRegister = 0;
	}

	// Getters & Setters

	public void setAttendingPet(Pet petToAttend)
	{
		currentlyAttending = petToAttend;
	}

	// Methods

	public String toString()
	{
		return "The ID number of the Veterinarian is: " + idNumber + name + lastNames;
	}
}