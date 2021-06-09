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
	private Owner[] owners;

	// Builder
	public PetCenter()
	{
		veterinarians = new Veterinarian[MAX_VETS];
		pets = new Pet[MAX_PETS];
		owners = new Owner[MAX_PETS];
		vetCount = 0;
		petCount = 0;
		ownerCount = 0;
	}

	// Getters & Setters

	// Methods

	public void addVet(String idNumber, String name, String lastName)
	{
		veterinarians[vetCount] = new Veterinarian(idNumber, name, lastName);
		vetCount++;
	}

	public String deleteVet(String input)
	{
		String message = "";
		String idNumber = input;
		boolean hasEncounteredVet = false;

		for(int i = 0;i < vetCount && !hasEncounteredVet;i++)
		{
			if(veterinarians[i].getIdNumber().matches(idNumber))
			{
				veterinarians[i] = null;
				hasEncounteredVet = true;
				vetCount--;
				message = "Veterinarian eliminated succesfully!\n";
			}
			else
				message = "Sorry, we couldn't find a veterinarian with that ID number\n";
		}

		return message;
	}

	public String addPet(String species, String name, String symptoms, Owner petOwner, PriorityLevel petPriority)
	{
		String message = "";
		boolean hasEncounteredMatch = false;

		for(int i = 0;i < petCount && !hasEncounteredMatch;i++)
		{
			if(pets[i].getName().matches(name) && pets[i].getPetOwner().getName().matches(petOwner.getName()))
			{
				message = "Sorry, there's already a pet with that name and that owner";
				hasEncounteredMatch = true;
			}
		}

		if(!hasEncounteredMatch)
		{
			pets[petCount] = new Pet(species, name, symptoms, petOwner, petPriority);
			message = "Pet added succesfully!";
		}

		return message;
	}

	public void createOwner(String idNumber, String name, String phoneNumber, String address)
	{
		owners[ownerCount] = new Owner(idNumber, name, phoneNumber, address);
	}

	public void assignPet()
	{
		
	}

	public boolean hasVets()
	{
		return vetCount > 0;
	}

	public boolean vetMaxReached()
	{
		return vetCount < MAX_VETS;
	}

	public boolean hasPets()
	{
		return petCount > 0;
	}

	public boolean petMaxReached()
	{
		return petCount < MAX_PETS;
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

	public String vetsToString()
	{
		String message = "";

		for(int i = 0;i < vetCount;i++)
		{
			message += veterinarians[i].toString();
		}

		return message;
	}

	public String petsToString()
	{
		String message = "";

		for(int i = 0;i < petCount;i++)
		{
			message += pets[i].toString();
		}

		return message;
	}
}