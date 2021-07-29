package com.caseStudy;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class TicketApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		System.out.println("Enter train number : ");
	    Scanner scan = new Scanner(System.in);
		int trainNo = scan.nextInt();
		TrainDAO trainDAO = new TrainDAO();
		Train train = trainDAO.findTrain(trainNo);
		if(train == null) {
			return;
		}
		
		scan.nextLine();
		System.out.println("Enter travel date:");
		String[] arr = scan.nextLine().split("/");
		LocalDate traveldate = LocalDate.of(Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
		System.out.println("Enter Number of Passengers:");
		TrainTicket ticket = new TrainTicket(traveldate,train);
		int num = Integer.parseInt(scan.nextLine());
		
		
		while(num-- > 0) {
			System.out.println("Enter Passenger Name:");
			String name = scan.nextLine();
			System.out.println("Enter Age:");
			int age = Integer.parseInt(scan.nextLine());
			System.out.println("Enter Gender(M/F):");
			char gender = scan.nextLine().charAt(0);
			ticket.addPassenger(name,age,gender);
		}
		ticket.writeTicket();
		System.out.println("Ticket booked with PNR: " + ticket.getPnr());
		
		

	}

}

