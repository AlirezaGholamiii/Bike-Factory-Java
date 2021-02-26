package runClasses;

import java.util.Scanner;

import baseClasses.MotorBike;
import baseClasses.MountainBike;
import baseClasses.Bicycle;
import baseClasses.EnumColor;
import baseClasses.EnumType;

public class bikeApplicationV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Application Using EnumColor and EnumType
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		MotorBike cc1 = null;			
		MotorBike cc2 = null;
		MotorBike cc3 = null;

		
		cc1 = new MotorBike("1296",16,120,6,"ABS",EnumColor.Blue.toString(),"Normal",17,EnumType.Sport.toString(),5,65,205,"Noisy"); 
		cc2 = new MotorBike("1370",20,305,7,"ABS",EnumColor.Dark.toString(),"Pro",22,EnumType.SupperSport.toString(),8,100,400,"SupperNoisy"); 	
		
		
		System.out.println("Serial number ? : ");
		String user_serialNumber = scan.nextLine();
		System.out.println("Cadens ? : ");
		int user_cadense = scan.nextInt() ;
		System.out.println("Speed ? : ");
		int user_speed = scan.nextInt() ;
		System.out.println("Gear ? : ");
		int user_gear = scan.nextInt() ;
		System.out.println("Brake ? : ");
		String user_brake = scan.next() ;
		System.out.println("color ? : ");
		EnumColor user_color  = EnumColor.Undefined;
		System.out.println(" \t1-White color\t\n2-Dark\t\nRed\t\nBlue");
			switch(scan.nextInt()) {
				case 1 :
					user_color = EnumColor.White;
					break;
						
				case 2:
					user_color = EnumColor.Dark;
					break;
						
				case 3:
					user_color = EnumColor.Red;
					break;
				case 4:
					user_color = EnumColor.Blue;
					break;
			}
		
		System.out.println("suspension ? : ");
		String user_suspension = scan.next();
		System.out.println("Tire Size ? : ");
		int user_tire = scan.nextInt();
		System.out.println("Type ? : ");
		System.out.println(" \t1-Normal\n\t2-Sport\n3\t-Supper Sport" );
		EnumType user_type = EnumType.Undefined;
				switch(scan.nextInt())
				{
				case 1 :
					user_type = EnumType.Normal;
					break;
					
				case 2:
					user_type = EnumType.Sport;
					break;
					
				case 3:
					user_type = EnumType.SupperSport;
					break;
				
				}
	
		System.out.println("Engine ? : ");
		int user_engine = scan.nextInt();
		System.out.println("Gas Tank ? : ");
		int user_tank = scan.nextInt();
		System.out.println("Hourse Power ? : ");
		int user_Hp = scan.nextInt();
		System.out.println("Exhuse ? : ");
		String user_exhus = scan.next();
		
		
		cc3 = new MotorBike(user_serialNumber, user_cadense, user_speed, user_gear, user_brake, user_color.toString(), user_suspension, user_tire, user_type.toString(), user_engine, user_tank, user_Hp, user_exhus);
		

		System.out.println(cc1);
		System.out.println(cc2);
		System.out.println(cc3);
		


		}
		
		
}


