package ui;

import java.util.Scanner;

import model.PetCenter;
import model.Prioritylevel;

public class Main
{
	private PetCenter pc;
	private Scanner sc;

	public Main()
	{
		pc = new PetCenter();
		sc = new Scanner(System.in);
	}

	public static void main(String[] args)
	{
		Main ppal = new Main();

		System.out.println("Welcome to the pet center system!");

		
	}

	public void addVet()
	{
		if(pc.vetMaxReached())
		{
			String name, lastName, idNumber;

			System.out.println("Please register the ID number of the new veterinarian:");
			idNumber = sc.nextLine();

			System.out.println("Please enter the name of the new veterinarian:");
			name = sc.nextLine();

			System.out.println("Please enter the last name of the new veterinarian:");
			lastName = sc.nextLine();

			if(name != null && lastName != null && idNumber != null)
			{
				pc.addVet(idNumber, name, lastName);
				System.out.println("veterinarian added successfully!\n");
			}
		}
		else
			System.out.println("Maximum number of veterinarians reached\n");
	}

	public void addPet()
	{
		if(pc.petMaxReached())
		{
			String species, name, symptoms, ownerName, idNumber, phoneNumber, address;
			int priorityLevel;

			System.out.println("Please insert the name of the pet's owner:");
			ownerName = sc.nextLine();

			System.out.println]("Please insert the ID number of the pet's owner:");
			idNumber = sc.nextLine();

			System.out.println("Please insert the phone number of the pet's owner:");
			phoneNumber = sc.nextLine();

			System.out.println("Please insert the address of the pet's owner:");
			address = sc.nextLine();



			System.out.println("Please insert the species name of the pet:");
			species = sc.nextLine();

			System.out.println("Please insert the name of the pet:");
			name = sc.nextLine();

			System.out.println("Please insert the symptoms the pet have:");
			symptoms = sc.nextLine();

			System.out.println("Please enter one of the following for the pet's priority level: " +
							   "\n(1) Red" +
							   "\n(2) Orange" +
							   "\n(3) Yellow" +
							   "\n(4) Green" +
							   "\n(5) Blue");

			priorityLevel = sc.nextInt();
			sc.nextLine();

			
		}
		else
			System.out.println("Sorry, the pet center has reached it's maximum capacity of pets");
	}

	public void deleteVet()
	{
		if(!pc.hasPets())
		{
			String idNumber;

			System.out.println("Please enter the ID number of the veterinarian you wish to delete:");
			idNumber = sc.nextLine();

			System.out.println(pc.deleteVet(idNumber));
		}
		else
			System.out.println("Sorry, there are still pets in the pet center");
	}

	public void vetsToString()
	{
		System.out.println(pc.vetsToString());
	}

	public void petsToString()
	{
		System.out.println(pc.petsToString());
	}
}