package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy");

		try {
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/mm/yy): ");
		Date checkIn = sdf1.parse(sc.next());
		System.out.print("Check-out date (dd/mm/yy): ");
		Date checkOut = sdf1.parse(sc.next());

		Reservation reservation = new Reservation(number, checkIn, checkOut);
		System.out.println("\nReservation: " + reservation);

		System.out.println();
		System.out.print("Enter date to update reservation (dd/mm/yy): ");
		System.out.print("Check-in date (dd/mm/yy): ");
		checkIn = sdf1.parse(sc.next());
		System.out.print("Check-out date (dd/mm/yy): ");
		checkOut = sdf1.parse(sc.next());

		reservation.updateDates(checkIn, checkOut);
		System.out.println("\nReservation: " + reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format!");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		sc.close();
	}
}
