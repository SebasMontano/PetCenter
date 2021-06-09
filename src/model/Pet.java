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

	public String getName()
	{
		return name;
	}

	public Owner getPetOwner()
	{
		return petOwner;
	}

	public PriorityLevel getPetPrio()
	{
		return petPriority;
	}

	public void setPetState(ConsultState newState)
	{
		currentState = newState;
	}

	public void setPetPrio(PriorityLevel petPriority)
	{
		this.petPriority = petPriority;
	}

	// Methods

	public String toString()
	{
		return "The name of the pet is: " + name + "\nThe species of the pet is: " + species + "\nThe pet has the following symptoms: " + symptoms + "\nThe owner is: " + petOwner.getName() + "\nThe pet's current state is: " + currentState.toString() + "\nIt's priority level is: " + petPriority.toString();
	}
}