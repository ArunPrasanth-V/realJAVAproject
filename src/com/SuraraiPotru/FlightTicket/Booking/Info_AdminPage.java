package com.SuraraiPotru.FlightTicket.Booking;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;


public class Info_AdminPage 
{
	static Scanner scan=new Scanner(System.in);
  public static void main(String args[])throws Exception
  {
	  System.out.println("******WELCOME TO DECK_AIR FLIGHT SERVICE*****\n"
	  	
			+ "\nCarco Flights<<<>>>Surarai pottru.Ptv.Lt.,\n"
	  		+ "\nEnter Your Journey Distination\n"
	  		+ "Press\n1.    for Chennai TO Salem\n "
	  		+ "\n2.    for  Salem TO Chennai \n"
	  		+"\n3.    for Trichy To Chennai \n"
	  		+"\n4.    for Chennai TO Trichy\n");
	  
	  BufferedReader choice=new BufferedReader(new InputStreamReader(System.in));
	  int n= Integer.parseInt(choice.readLine());
	  switch(n)
	  {
		  case 1:
		  {
			  //Chennai TO Salem 
			  break;
		  }
		  case 2:
		  {
			//  Salem TO Chennai
		      break;
		  }
		  case 3:
		  {
			  //Trichy To Chennai
			  break;
		  }
		  case 4:
		  {
			  //Chennai TO Trichy
			  CommenlyUsedInAllFlights cal=new CommenlyUsedInAllFlights();
			  cal.getPassengerINFO();
			  Chennai_TO_Trichy call=new Chennai_TO_Trichy();
			 
			  
			  call.timecall();
			 break;
			 
		  }
		 default :
		 {
			System.out.println("Wrong Distination");
			
		 }
	  }
	  
	  
  }
 
  
}
