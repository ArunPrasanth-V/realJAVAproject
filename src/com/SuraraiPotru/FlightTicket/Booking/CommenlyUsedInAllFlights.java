package com.SuraraiPotru.FlightTicket.Booking;
import java.util.*;
public class CommenlyUsedInAllFlights extends Info_AdminPage
{
  
	private static String name;
	private static String phone;
	private static String ad;
	
	
	
	static Scanner scan =new Scanner(System.in);
	
	public static void  getPassengerINFO()
	
	{
		        System.out.println("Enter Your Name :");
				 name=scan.nextLine();
				System.out.println("Enter the phone NO.");
				 phone=scan.nextLine();
				System.out.println("enter the valid aadar NO.");
				 ad=scan.nextLine();
					
	}
	public static void putPassengerINFO()
	{
		 System.out.println("**************BILL RECEIPT**************"
			  		+ "\n"
			  	          + "\n    ****DECK_AIR FLIGHT SERVICE***"
			        + "\n"
			               + "\n___Carco Flights<<<>>>Surarai pottru.Ptv.Lt.,___"
			        + "\n"
		                   + "\n********###********###********"
		                   + "\nBILL NO. :122"
			               +"\nNAME :"+name
			               +"\nPHONE :"+phone
			               +"\nAD.No :"+ad);
	}
}
