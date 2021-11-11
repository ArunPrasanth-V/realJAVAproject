package com.SuraraiPotru.FlightTicket.Booking;
import java.util.*;

public  class Chennai_TO_Trichy extends Info_AdminPage 
{
	private static int n;
	private static int month;
	static Scanner scan =new Scanner(System.in);
	Chennai_TO_Trichy()
	{
		System.out.println("\n*******PRESS*******\n "
				          + "\n1.--->PreBooking"
				          + "\n2.--->TodayBookig "
			           	  + "\n3.--->TomorrowBooking");
		int typeOfBooking=scan.nextInt();
		booking(typeOfBooking);
   	}
	
	
	public static void flightTimeChe_Tri()
	{
		System.out.println("The Time are Based Only in IST "
				+ "\nBoading Time  "
				+ "\nNO.1: 6.00 AM  "
				+ "\nNO.2: 10.00 AM"
				+ "\nNo.3: 1.00 PM"
				+ "\nNo.4: 5.00 PM"
				+ "\nNo.5: 9.00 PM");
	}
	public static void timecall()
	{
		 n=scan.nextInt();
		//booking( n);
	}
	
    public static void booking(int n)
    {
    	if(n==1)
    	{
    		System.out.println("Enter the month ");
    		  month=scan.nextInt();
    		{
    			if(month<13)
    			{
    				putpreBook(month);
    			}
    			else
    			{
    			  System.out.println("plz Enter the valid month");	
    			  booking( n);
    			}
    		}
    		
    	}
    	else if(n==2)
    	{
    		
    	}
    	else if(n==3)
    	{
    		
    	}
    	else
    	{
    		System.out.println("Wrong");
    	}
    	
    }
    public static void putpreBook(int no)
    {
    	System.out.println(" Enter The Date ");
    	int date=scan.nextInt();
    	flightTimeChe_Tri();
    	System.out.println("choose the Jurney Time");
    	int timing=scan.nextInt();
    	
    	getpreBook(date,month,timing);
    }
    public static void travelTiming(int timing)
    {
    	if(timing==1)
    	{
    		System.out.print("6.00 AM ");
    	}
    	else if(timing==2)
    	{
    		System.out.print("10.00 AM");
    	}
    	else if(timing==3)
    	{
    	      System.out.print("1.00 PM");	
    	}
    	else if(timing==4)
    	{
    		System.out.print("5.00 PM");
    	}
    	else if(timing==5)
    	{
    		System.out.print("9.00 PM");
    	}
    }
    public static void getpreBook(int date,int month,int timing) {
    	
    	//CommenlyUsedInAllFlights.getPassengerINFO();
    	CommenlyUsedInAllFlights.putPassengerINFO();
    	System.out.println();
    	System.out.println("\n*****PREBOOKING*****");
    	System.out.println("Type of Travel : PRE TRAVEL");
    	System.out.println("Date of travel--"+date+"-"+month);
        System.out.println("Timing of the Travel : ");
        travelTiming(timing);
        		System.out.println("\nTotal Amount TO Travel RS:1"
        				         + "\n                ~by SURARAI POTTRU TAEAM  "
        		+ "\n********THANK YOU********");
        
    }
   
}