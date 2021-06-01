package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy");
		Date date = sdf1.parse(sc.nextLine()); 
		
			
		System.out.println(sdf1.format(date));

		sc.close();
	}
}
