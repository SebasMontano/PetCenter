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
		veterinarians[vetCount] = new Veterinarian(idNumber, name, lastName);
		vetCount++;
	}

	public void addPet(String species, String name, String symptoms, Owner petOwner, PriorityLevel petPriority)
	{
		if(petCount < MAX_PETS)
			pets[petCount] = new Pet(species, name, symptoms, petOwner, petPriority);
	}

	public void assignPet()
	{
		
	}

	public boolean hasVets()
	{
		return vetCount < MAX_VETS;
	}

	public Pet highestPrio()
	{
		Pet petWithHighestPrio = null;
		boolean hasEncounteredPet = false;

		for(int i = 0;i < petCount && !hasEncounteredPet;i++)
		{
			if(pets[i].getPetPrio() == PriorityLevel.RED)
				petWithHighestPrio = pets[i];
		}


		for(int i = 0;i < petCount && !hasEncounteredPet;i++)
		{
			if(pets[i].getPetPrio() == PriorityLevel.ORANGE)
				petWithHighestPrio = pets[i];
		}

		for(int i = 0;i < petCount && !hasEncounteredPet;i++)
		{
			if(pets[i].getPetPrio() == PriorityLevel.YELLOW)
				petWithHighestPrio = pets[i];
		}

		for(int i = 0;i < petCount && !hasEncounteredPet;i++)
		{
			if(pets[i].getPetPrio() == PriorityLevel.GREEN)
				petWithHighestPrio = pets[i];
		}

		for(int i = 0;i < petCount && !hasEncounteredPet;i++)
		{
			if(pets[i].getPetPrio() == PriorityLevel.BLUE)
				petWithHighestPrio = pets[i];
		}

		return petWithHighestPrio;
	}

	public String vetToString()
	{
		String message = "";

		for(int i = 0;i < vetCount;i++)
		{
			message += veterinarians[i].toString();
		}

		return message;
	}
}