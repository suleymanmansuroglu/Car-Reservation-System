import java.util.Scanner;
import java.io.File;


public class Menu extends RezData {
	static Scanner s;
	static String filename = "Reservations.txt";
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws Exception {


		String ad;
		File file = new File(filename);
		int sayi = 0;

		while (sayi != 5) {
			System.out.println(" ");
			System.out.println("---------MENU-----------");
			System.out.println("-1-Make Reservation-----");
			System.out.println("-2-Cancel Reservation---");
			System.out.println("-3-Search Reservation---");
			System.out.println("-4-Change Reservation---");
			System.out.println("-5-Close----------------");

			System.out.print("Plaase make a choise: ");
			sayi = input.nextInt();


			switch (sayi) {
				case 1:
					System.out.println("Add Record");
					MakeRes();
					SendNotification();
					System.out.println("Reservation added.");
					break;
				case 2:
					System.out.println("Remove Reservation");
					System.out.println("What is your name?:");
					ad = input.next();
					CancelReservation(ad);
					System.out.println("Reservation is canceled.");
					SendNotification();
					break;
				case 3:
					System.out.println("Search Record");
					System.out.println("What is your phone number");
					String sr = input.next();
					Search(sr);
					break;
				case 4:
					System.out.println("Please enter your name:");
					ad = input.next();
					ChangeReservation(ad);
					break;
				case 5:
					System.out.println("Close");
					System.out.println("System is closing...");
					break;

			}

		}
	}

}













