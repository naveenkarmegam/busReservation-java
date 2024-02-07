package busReservation;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity; // get and set
	
	public Bus(int busNo, boolean ac, int capacity) {
		this.busNo = busNo;
		this.ac = ac;
		this.capacity= capacity;
	}
	public int getBusNo() {
		return busNo;
	}
	public int getCapacity() { //accessor method
		return capacity;
	}
	
	public void setCapacity(int capacity) { //mutator
		this.capacity = capacity;
	}
	
	public void displayBusInfo(){
		System.out.println("Avaiable buses: "+busNo+" Ac:"+" Capacity: " + capacity);
	}
}
