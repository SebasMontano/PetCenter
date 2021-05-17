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
}