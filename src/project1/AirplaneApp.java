package project1;
import javax.swing.*;

/**
 * <p>Title: Project # 1 Part 2 Airplane Application</p>
 * 
 * <p>Description: The Application class tests the 
 * seat and airplane class for information.</p>
 * 
 * @author Gaurav Nain
 *
 */

public class AirplaneApp {
	
	public static void main(String[] args)
	{
		// Creates and instantiates a reference to a new Airplane object.
		Airplane theAirplane = new Airplane();
		
		// Creates an array of strings
		String[] choices = 
		{"Reserve a Seat", "Cancel a Seat Reservation", 
				"View Seating Chart", "Quit"};
		
		// Shows the Main Menu
		int choice = JOptionPane.showOptionDialog(
				null, "Airplane Automatic Check-In or Cancel Reservation",
				"Main Menu", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null,
				choices, choices[0]);
		
		while (choice != 3 && choice != -1)
		{
			switch (choice)
			{
				case 0: theAirplane.assignSeat();
						break;
						
				case 1:	theAirplane.cancelSeat();
						break;
						
				case 2:	JTextArea text = new JTextArea(20,30);
						JScrollPane scroll = new JScrollPane(text);
						text.setText(theAirplane.toString());
						JOptionPane.showMessageDialog(
						null, scroll, "Seating Chart",
						JOptionPane.DEFAULT_OPTION);
						break;
			}
			
		choice = JOptionPane.showOptionDialog(
				null, "Airplane Automatic Check-In or Cancel Reservation", 
				"Main Menu", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null,
				choices, choices[0]);
		}
		
		if (choice == -1) 
			JOptionPane.showMessageDialog
			(null, "Program terminating . . .");
		
		JTextArea text = new JTextArea(20,30);
		JScrollPane scroll = new JScrollPane(text);
		text.setText(theAirplane.toString()); 
		JOptionPane.showMessageDialog(null, scroll,
				"Final Seating Chart Before Airplane Departure!", 
				JOptionPane.DEFAULT_OPTION);
	}
}
