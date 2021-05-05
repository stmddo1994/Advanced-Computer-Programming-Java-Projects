/*File: GuestMain.java
Project: CSIS3101 Assignment 11
Author:  Mathew Doty 
History: Version 3.1 March 28, 2021*/

//Import ArrayList method
import java.util.ArrayList;

public class GuestMain {

    public static void main(String[] args) {         
       ArrayList<Guest> guestList = new ArrayList<Guest>();        
         // Register new guests    
       guestList.add(GuestFactory.getGuestInstance("Mary", "English"));         
       guestList.add(GuestFactory.getGuestInstance("Jaap", "Spanish"));         
       guestList.add(GuestFactory.getGuestInstance("Heidi", "German"));         
       guestList.add(GuestFactory.getGuestInstance("Jean Claude", "French"));        
     // Bed time sequence         
   System.out.println("Time to turn out the lights.");         
    for (int i = 0; i < guestList.size(); i++) 
    {             
            Guest visitor = guestList.get(i);             
         System.out.println("  " + visitor.greetNight());         
   }        
   // Breakfast sequence         
   System.out.println("Time for breakfast!");         
   for (Guest visitor : guestList) 
   {             
           System.out.println("  " + visitor.greetMorning());         
  }  
} 
}