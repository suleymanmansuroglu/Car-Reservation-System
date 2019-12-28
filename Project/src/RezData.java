import java.io.*;
import java.util.Scanner;

public abstract class RezData {
	static Scanner s;
	static String filename = "Reservations.txt";
	static Scanner input = new Scanner(System.in);


	public static void MakeRes() throws Exception {
		String gun;
		String ad;
		String soyad;
		String numara;
		String x;
		System.out.println("Please input your name:");
		ad = input.next();
		System.out.println("Please input your surname:");
		soyad = input.next();
		System.out.println("Please enter your phone number:");
		numara = input.next();
		System.out.println("Please choose your available day: \n Note: Input just number of day");
		calendar.Calendar();
		gun = input.next();
		x = Choosehour(gun);
		FileWriter fwr = new FileWriter(filename, true);
		BufferedWriter bwr = new BufferedWriter(fwr);
		PrintWriter pwr = new PrintWriter(bwr);
		pwr.println(ad + " " + soyad + " " + numara + " " + gun + " " + x);
		pwr.flush();
		pwr.close();


	}


	public static String Choosehour(String day) throws Exception {
		System.out.println("Please choose an hour");
		System.out.println("Note: You can only book per hour.");
		String hour = input.next();
		if (hour.equals("8")) {

			return hour;

		} else if (hour.equals("9")) {

			return hour;
		} else if (hour.equals("10")) {

			return hour;

		} else if (hour.equals("11")) {

			return hour;

		} else if (hour.equals("12")) {

			return hour;

		} else if (hour.equals("13")) {

			return hour;

		} else if (hour.equals("14")) {

			return hour;

		} else if (hour.equals("15")) {

			return hour;

		} else if (hour.equals("16")) {

			return hour;

		} else {
			System.out.println("The time you enter is full or outside office hours.\n");
			return null;
		}

	}


	public static void SendNotification() {
		System.out.println("Notification is sent to company.");
	}

	public static void Search(String number) throws FileNotFoundException {

		boolean fd = false;
		String bir = null;
		String iki = null;
		String uc = null;
		String dort = null;
		String bes = null;


		s = new Scanner(new File(filename));
		s.useDelimiter("[ \n]");
		while (s.hasNext() && !fd) {
			bir = s.next();
			iki = s.next();
			uc = s.next();
			dort = s.next();
			bes = s.next();

			if (uc.equals(number)) {
				fd = true;
			}
		}
		if (fd) {
			System.out.println(bir + " " + iki + " " + uc + " " + dort + " " + bes);
		} else {
			System.out.println("There is no reservation were found for this phone number.");
		}


	}

	public static void CancelReservation(String ad) throws IOException {
		FileReader frdr = new FileReader(filename);
		BufferedReader bfr = new BufferedReader(frdr);
		String line = " ";
		String[] array = new String[10];
		line = bfr.readLine();
		int j = 0;
		while (line != null) {
			if (!line.split(" ")[0].equals(ad)) {
				array[j] = line;
				j++;
			}
			line = bfr.readLine();
		}

		FileWriter fw = new FileWriter(filename, false);
		BufferedWriter bw = new BufferedWriter(fw);

		for (int e = 0; array[e] != null; e++) {

			bw.write(array[e] + " \n");
		}


		bfr.close();
		frdr.close();
		bw.close();
		fw.close();


	}

	public static void ChangeReservation(String ad) throws Exception {
		CancelReservation(ad);
		MakeRes();


	}
}
