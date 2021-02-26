package baseClasses;
import java.util.ArrayList;

public class DataCollection {
	
	
	 private static  ArrayList<Bicycle>  listOfBicycles = new  ArrayList<Bicycle>();	
	 
	  
     public static void add(Bicycle object)
	 {
    	 listOfBicycles.add( object );		 
	 }	 
	 
     public static void remove(Bicycle object)
	 {
    	 listOfBicycles.remove(object);		 
	 }	 
	
     public static void removeAt(int index)
	 {
    	 listOfBicycles.remove(index);		 
	 }	 
	 
	 public static void print()	 
	 {
		 for(Bicycle element : listOfBicycles)
		 {
			 System.out.println(element);
			 
		 } 		 
	 } 	 
	  	 
	 //-search for a bike by serial number: unique identifier	 
	 public static Bicycle  search(String key)
	 {
			 for( Bicycle element : listOfBicycles)
			 {
				                           	 
				 if(element.getSerialNumber().equals(key))
				 {
					 return element ;				 
				 }
			 }		 
	   return null;	   
	 }
	
	 
	 //             How to get the list of MountainBike and MotorBike?
	
	
	 
	
	 
	 public static  ArrayList<MotorBike>   getMotorBike()
	 {
	   ArrayList<MotorBike>  listOfMotorBike = new ArrayList<MotorBike>();
		 
		   for( Bicycle element : listOfBicycles)
		   {
			  
			  
				   if(element instanceof MotorBike)
				   {			   
					   listOfMotorBike.add(   ( MotorBike )  element   ) ;
					   	   
				   }  
			  
		   }
	   
	    return listOfMotorBike ;
		 
	 }
	 
	 
	 public static  ArrayList<MountainBike>   getMountainBike()
	 {
	   ArrayList<MountainBike>  listOfMountainBike = new ArrayList<MountainBike>();
		 
		   for( Bicycle element : listOfBicycles)
		   {
			   if(element instanceof MountainBike)
			   {			   
				   listOfMountainBike.add(   ( MountainBike )  element   ) ; 		   
			   }  	   
		   }
	   
	    return listOfMountainBike ;
		 
	 }
	 
	 
	 
	 
	}




































