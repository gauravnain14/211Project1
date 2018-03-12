package project1;

/**
 * <p>Title: Project # 1 Part 1 Seat Class</p>
 * 
 * <p>Description:  The seat class stores the type of seat, the seat number
 * and the class of the seat(first or coach). This class also lets the
 * program reserve a seat, cancel the reserved seat or check whether
 * the seat is taken or free.</p>
 * 
 * @author Gaurav Nain
 *
 */

public class Seat
{
	private String classOfSeat;
	private boolean occupied;
	private int seatNumber;
	
	/**
	 * parameterized constructor -- initializes the variables.
	 * @param an integer for the seat number
	 * @param a seat class of "first" or "coach"
	 */
	public Seat(int num, String type)
	{
		occupied = false;
		seatNumber = num;
		classOfSeat = type;
	}
	
	/**
	 * getSeatNumber method -- should return an integer between 1 and 10
	 * because there are only 10 seats on the airplane.
	 * @return a seat number
	 */
	public int getSeatNumber()
	{
		return seatNumber;
	}
	
	/**
	 * getTypeOfSeat method -- returns the type of seat (First or Coach)
	 * @return the type of this seat.
	 */
	public String getTypeOfSeat()
	{
		return classOfSeat;
	}
	
	/**
	 * reserveSeat method -- reserves a seat on the airplane.
	 */
	public void reserveSeat()
	{
		occupied = true;
	}
	
	/**
	 * cancelReservation method -- cancels the reservation made on the airplane.
	 */
	public void cancelReservation()
	{
		occupied = false;
	}
	
	/**
	 * checkSeat method -- checks whether the seat on the plane is empty or full.
	 * @return true if the seat is empty and false if it is full. 
	 */
	public boolean checkSeat()
	{
		return !occupied;
	}
	
	/**
	 * toString method -- displays the information about the seat.
	 * @return the seat number, class of seat and says whether the seat is empty or occupied
	 */
	public String toString()
	{
		return "\nSeat Number: " + seatNumber + 
		"\nClass of Seat: " + classOfSeat + 
		"\nSeat Occupied: " + occupied;
	}
	
	
	
	
}
