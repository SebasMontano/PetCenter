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
	}

	public void addVet()
	{
		if(pc.hasVets())
		{
			String idNumber, name, lastName;

			System.out.println("Please register the ID number of the new veterinarian:");
			idNumber = sc.nextLine();
			sc.nextLine();

			System.out.println("Please enter the name of the new veterinarian:");
			name = sc.nextLine();
			sc.nextLine();

			System.out.println("Please enter the last name of the new veterinarian:");
		}
	}
}