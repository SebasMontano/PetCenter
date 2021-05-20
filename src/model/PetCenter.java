package model;

public class PetCenter
{
	// Attributes ¿?
	private int MAX_VETS = 7;
	private int MAX_PETS = 120;
	private int vetCount;
	private int petCount;

	// Relationships
	private Veterinarian[] veterinarians;
	private Pet[] pets;

	// Builder
	public PetCenter()
	{
		veterinarians = new Veterinarian[MAX_VETS];
		pets = new Pet[MAX_PETS];
		vetCount = 0;
		petCount = 0;
	}

	// Methods

	public void addVet(String idNumber, String name, String lastName)
	{
		if(idNumber != null && name != null && lastName != null)
		{
			veterinarians[vetCount] = new Veterinarian(idNumber, name, lastName);
			vetCount++;
		}
	}

	public void addPet(String species, String name, String symptoms, Owner petOwner, PriorityLevel petPriority)
	{
		if(petCount >= MAX_PETS)
			System.out.println("Sorry, the system has reached the maximum capacity of pets");
		else
			pets[petCount] = new Pet(species, name, symptoms, petOwner, petPriority);
	}

	public void assignPet()
	{
		
	}

	public boolean hasVets()
	{
		return vetCount < MAX_VETS;
	}
}