package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy");

		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/mm/yy): ");
		Date checkIn = sdf1.parse(sc.next());
		System.out.print("Check-out date (dd/mm/yy): ");
		Date checkOut = sdf1.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after Check-in date!");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("\nReservation: " + reservation);

			System.out.println();
			System.out.print("Enter date to update reservation (dd/mm/yy): ");
			System.out.print("Check-in date (dd/mm/yy): ");
			checkIn = sdf1.parse(sc.next());
			System.out.print("Check-out date (dd/mm/yy): ");
			checkOut = sdf1.parse(sc.next());

			String error = reservation.updateDates(checkIn, checkOut);
			if (error != null) {
				System.out.println("Error in reservation: " + error);
			}
			else {
				System.out.println("Reservation: " + reservation);
			}
			reservation.updateDates(checkIn, checkOut);
			System.out.println("\nReservation: " + reservation);

		}

		sc.close();
	}
}
