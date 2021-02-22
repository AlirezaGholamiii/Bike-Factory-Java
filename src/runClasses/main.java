package runClasses;

import java.util.Scanner;

import baseClasses.Bicycle;
import baseClasses.MountainBike;
import baseClasses.MotorBike;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner main = new Scanner(System.in);
		
		
		//Add Two Normal Bicycle with parameters and default constractor
		Bicycle b1 = new Bicycle();
		Bicycle b2 = new Bicycle(40, 20, 3, "DISC", "Pink");
		
		
		//Add One Mountain Bike with parameters 
		MountainBike mb1 = new MountainBike(40, 20, 3, "DISC", "Pink", "Normal", 27);
		
		
		//Printing two Bicycles and Mountain Bike
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(mb1);
		
		//Changing Bike's color using setter
		b1.setColor("Blue");
		//Changing Bicycle's features using public methodes
		b2.speedUp(10);
		b2.speedDown(5);
		b2.setGear(5);
		b2.setBrake("ABS");
		
		//Changing Mountain Bike's features using setter
		mb1.setGear(7);
		mb1.setBrake("ABS");
		mb1.setColor("Red");
		System.out.println();
		mb1.setTierSize(5);
		mb1.setTierSize(30);
		
		
		//Checking Mountain Bike's Tier Size using setter
		System.out.println("Enter a Tier Size For Mountain Bike: ");
		int size = main.nextInt();
		mb1.setTierSize(size);
		while (size < 0) {
			System.out.println("Enter a Tier Size For Mountain Bike: ");
			size = main.nextInt();
		}
		mb1.setTierSize(size);
		
		System.out.println();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(mb1);
		
		//Add Motor Bike and display it by default constractor
		MotorBike Mb1 = new MotorBike();
		System.out.println(Mb1);
		
		
		
		
		main.close();
	}
}
