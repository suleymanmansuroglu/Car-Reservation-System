import java.util.Calendar;

public class calendar {
	public static void Calendar() {

		Calendar now = Calendar.getInstance();
		System.out.println("Here is the available Dates:");
		System.out.println("Month" + " -  " + "Date" + "   -  " + "Year");

		System.out.println((now.get(Calendar.MONTH) + 1) + "    -   "
				+ (now.get(Calendar.DATE)) + "    -  " + now.get(Calendar.YEAR));
		System.out.println((now.get(Calendar.MONTH) + 1) + "    -   "
				+ (now.get(Calendar.DATE) + 1) + "    -  " + now.get(Calendar.YEAR));
		System.out.println((now.get(Calendar.MONTH) + 1) + "    -   "
				+ (now.get(Calendar.DATE) + 2) + "    -  " + now.get(Calendar.YEAR));
		System.out.println((now.get(Calendar.MONTH) + 1) + "    -   "
				+ (now.get(Calendar.DATE) + 3) + "    -  " + now.get(Calendar.YEAR));
		System.out.println((now.get(Calendar.MONTH) + 1) + "    -   "
				+ (now.get(Calendar.DATE) + 4) + "    -  " + now.get(Calendar.YEAR));

	}
}
