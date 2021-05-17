package model;

public class Veterinarian
{
	// Attributes
	private String idNumber;
	private String name;
	private String lastNames;
	private String veterinarianRegister;

	// Relationships
	private Pet currentlyAttending;

	// Builder

	public Veterinarian(String idNumber, String name, String lastNames, String veterinarianRegister)
	{
		this.idNumber = idNumber;
		this.name = name;
		this.lastNames = lastNames;
		this.veterinarianRegister = veterinarianRegister;
	}
}