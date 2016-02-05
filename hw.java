import java.time;
public static void main(String args[]) {
	System.out.print("Hello, " + args[0] + "\nThe current time is: ");
	static LocalTime time = LocalTime.now();
	System.out.println(time.toString());
}