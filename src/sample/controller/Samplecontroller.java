package sample.controller;

import java.util.Scanner;
import sample.model.PlayDohCircle;
import sample.model.*;

public class Samplecontroller 
{
	public void start()
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle = new PlayDohCircle();
		secondCircle = new PlayDohCircle();
				
		PlayDohCircle thirdCircle= new PlayDohCircle(10);
		
		PlayDohDog firstDog = new PlayDohDog(1);
		PlayDohDog secondDog = new PlayDohDog();
		
		System.out.println("Here is my play doh circle");
		System.out.println(firstCircle);
		System.out.println("Here is my second circle " + secondCircle);
		
		System.out.println("This is a sample prject to show the github");
		System.out.println("eclipse process to develop muscle memory");
	

		testScanner();
	}

		
		
		
	private void testScanner()
	{
		Scanner firstScanner; //Declares a Scanner object
		firstScanner = new Scanner(System.in); // Instanciates a Scanner objcect
		System.out.println("Please type your favorite place");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like the place " + answer);
		System.out.println("How old are you???");
		int ageAnswer = firstScanner.nextInt();
		System.out.println("you said that you are " + ageAnswer +" years old!!!");
	}
}
