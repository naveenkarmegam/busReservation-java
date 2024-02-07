package busReservation;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
	public static void main(String args[]) {
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		buses.add(new Bus(1, true, 2));
		buses.add(new Bus(2, true, 50));
		buses.add(new Bus(3, true, 48));
		buses.add(new Bus(4, true, 52));
		
		int userOption = 1;
		Scanner scanner = new Scanner(System.in);
		for(Bus b: buses) {
			b.displayBusInfo();
		}
		while(userOption == 1 || userOption != 2) {
			System.out.println("Enter 1 to Book and 2 to exit");
			userOption = scanner.nextInt();
			if(userOption == 1) {
				System.out.println("Your Booking Started......");
				Booking booking = new Booking();
				if(booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed...");
				} else {
					System.out.println("Sorry! Bus is full. Try another date or bus");
				}
			} else if (userOption == 2) {
				System.out.println("Your Booking closed successfully....");
			} else {
				System.out.println("Invalid booking please enter correct value....");
			}
		}
	}
}
