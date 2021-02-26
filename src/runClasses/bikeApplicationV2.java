package runClasses;

import java.util.Scanner;
import baseClasses.Bicycle;
import baseClasses.MountainBike;
import baseClasses.MotorBike;
import baseClasses.DataCollection;

public class bikeApplicationV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Applicatopn Using DataCollection
		
		
		
				//Normal Bike
				Bicycle bike1 = new Bicycle("6672",12,65,4,"Normal","Dark");
				
				//Montain Bike
				MountainBike montainb1 = new MountainBike("1122",40, 20, 3, "DISC", "Pink", "Normal", 27);
				MountainBike montainb2 = new MountainBike("2012",40, 20, 3, "DISC", "Pink", "Normal", 27);
				//Motor Bike
				MotorBike motorb1 = new MotorBike("1296",16,120,6,"ABS","Black","Normal",17,"Sport",5,65,205,"Noisy"); 
				MotorBike motorb2 = new MotorBike("1370",20,305,7,"ABS","Green","Pro",22,"SupperSport",8,100,400,"SupperNoisy"); 
				
			
				
				
				//Adding Data in Data Collection
				DataCollection.add(bike1);  DataCollection.add(montainb1);  DataCollection.add(montainb2);   
				DataCollection.add(motorb1); DataCollection.add(motorb2);
				
				System.out.println("\nList of Bikes :\n");
				DataCollection.print();
				
				//Get just Motor Bike from data Colection
				System.out.println("\n\nList of Motor Bikes :\n");		
				System.out.println(DataCollection.getMotorBike() )  ;
				
				//Get just Mountain Bike from colection
				System.out.println("\n\nList of Montain Bike :\n");		
				System.out.println(DataCollection.getMountainBike() )  ;
				
				
	}

}
