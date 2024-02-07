package busReservation;
import java.util.*;
import java.text.*;
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	public Booking() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the passenger name: ");
		passengerName = scanner.next();
		System.out.println("Enter the bus:");
		busNo = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
		int capacity = 0;
		for (Bus bus : buses) {
			if(bus.getBusNo() == busNo) {
				capacity = bus.getCapacity();
			}
		}
		int booked = 0;
		for (Booking booking : bookings) {
			if(booking.busNo == busNo && booking.date.equals(date)) {
				booked++;
			}
		}
		
		return booked <capacity ?true:false;
	}
}
