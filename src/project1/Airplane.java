package project1;
import javax.swing.JOptionPane;

/**
 * <p>Title: Project # 1 Part 2 Airplane Class</p>
 * 
 * <p>Description: The Airplane class contains seats that will provide methods
 * that allow the application class to request/cancel a reservation or to
 * display the seating chart.</p>
 * 
 * @author Gaurav Nain
 *
 */

public class Airplane{
	
	private int seat, cancel;
	private String type, terminate, assign;
	private Seat[] theSeat = new Seat[10];
	
	/**
	 * default constructor - instantiates all the
	 * instance variables and seat objects.
	 */
	public Airplane()
	{
		seat = 0;
		cancel = 0;
		terminate = "";
		type = "";
		assign = "";
		for(int i = 0; i<10; i++)
			if(i < 4)
				theSeat[i] = new Seat(i+1,"First");
			else
				theSeat[i] = new Seat(i+1,"Coach");
	}
	
	/**
	 * assignSeat method -- determines which seat number
	 * the user wants and the class of seat(First or Coach).
	 * If the seat is full, there is an error message.
	 * If the reservation is completed, there is a dialog box.
	 */
	public void assignSeat()
	{
		assign = JOptionPane.showInputDialog
				("Please pick a seat that you would like:" +
				"\nSeat Number 1-4 are First Class and " +
				"\nSeat Number 5-10 are Coach Class.");
		
		if(assign != null)
		{
			seat = Integer.parseInt(assign);
			
			type = theSeat[seat-1].getTypeOfSeat();
			
			if(seat < 1 || seat > 10)
				JOptionPane.showMessageDialog(null, 
				"Please enter a valid Seat Number!");
			
			else
			{
				JOptionPane.showMessageDialog(null, 
					"Your Reservation for Seat Number " + 
					seat + " has been completed!");
				theSeat[seat-1] = new Seat(seat,type);
				theSeat[seat-1].reserveSeat();
			}
		}
		else
			JOptionPane.showMessageDialog
			(null, "You did not reserve a seat.");
	}
	
	/**
	 * cancelSeat method -- cancels the reservation
	 * for the seat number on the airplane of 10 seats.
	 */
	public void cancelSeat()
	{
		terminate = JOptionPane.showInputDialog
		("Please enter your seat number" +
		"\nAND IT WILL BE TERMINATED!");
		
		if(terminate != null)
		{
			cancel = Integer.parseInt(terminate);
			
			if(cancel < 1 || cancel > 10)
			{
				JOptionPane.showMessageDialog(null, 
				"Please enter a valid Seat Number!");
			}
			else
			{
			theSeat[cancel-1].cancelReservation();
			JOptionPane.showMessageDialog(null, 
				"Your Reservation for Seat Number "
				+ cancel + " has been terminated.");
			}
		}
		else
		{
			JOptionPane.showMessageDialog
			(null, "Your seat has not been terminated.");
		}
				
	}
	
	/**
	 * toString method -- Displays all the seats on the plane.
	 * @return Information about Seat 1 - 10.
	 */
	public String toString()
	{
		String temp = new String();
		
		for(int i = 0; i < theSeat.length; i++)
			temp += theSeat[i].toString() + "\n";
		
		return temp;
	}
}
