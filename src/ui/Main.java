package ui;

import java.util.Scanner;

import model.PetCenter;

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

		ppal.addVet();
		ppal.vetsToString();
	}

	public void addVet()
	{
		if(pc.hasVets())
		{
			String idNumber, name, lastName;

			System.out.println("Please register the ID number of the new veterinarian:");
			idNumber = sc.nextLine();

			System.out.println("Please enter the name of the new veterinarian:");
			name = sc.nextLine();

			System.out.println("Please enter the last name of the new veterinarian:");
			lastName = sc.nextLine();

			if(name != null && lastName != null && idNumber != null)
			{
				pc.addVet(idNumber, name, lastName);
				System.out.println("veterinarian added successfully");
			}
		}
	}

	public void vetsToString()
	{
		System.out.println(pc.vetToString());
	}
}