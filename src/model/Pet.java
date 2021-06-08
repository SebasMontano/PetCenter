package model;

public class Pet
{
	// Attributes
	private String species;
	private String name;
	private String symptoms;

	// Relationships
	private Owner petOwner;
	private ConsultState currentState;
	private PriorityLevel petPriority;

	// Builder
	public Pet(String species, String name, String symptoms, Owner petOwner, PriorityLevel petPriority)
	{
		this.species = species;
		this.name = name;
		this.symptoms = symptoms;
		this.petOwner = petOwner;
		this.currentState = ConsultState.WAITING;
		this.petPriority = petPriority;
	}

	// Getters & Setters

	public PriorityLevel getPetPrio()
	{
		return petPriority;
	}
}