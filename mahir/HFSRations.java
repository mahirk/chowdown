

// Rohan Yelsangikar
// 10/15/2013
// HFSRations.java
// This is a small project of mine that indicates how much I use my Husky account, and how much I can use before hitting maximum use
// per week. It will also take into calculations of how much you will have in surplus on a weekly basis as well as a quarterly basis.
// This particular version works quite nicely, that being said, you can also go ahead and add in
// an ArrayList to ask the user for all their favorite dishes and the cost, and then try to figure out how that can be accomodated in the meal plan.
// I also need to compensate for the formatting, round to 2 decimal places.
// "If I spent $XXXX per day, what would I have in surplus per week, and quarter?"
//  need a public class FoodItem, make ArrrayList of it with doublee and String parameters.
// Also need to compensate for impulse purchases for things like cinnamon rolls, soda, candy, poptarts, etc
// change duration to days instead of weeks, and calculate a daily average as well as a weekly average



import java.util.*;
import java.lang.*;

public class HFSRations
{
    
	private double current, initial;
	private double goal, consume;
	private int duration;
	private double surplus, average;
    private ArrayList<FoodItem> foods;
    private Scanner bornstellar;
    private double totalDuration;
	
	public HFSRations ( )
	{
		current = 622.30;
		initial = 827.00;
		goal = consume = 0.0;
		duration = 3;
		surplus = 0.0;
		average = 0.0;
        bornstellar = new Scanner(System.in);
        totalDuration = 78.0;
	}
	
	public static void main (String [] args)
	{
		HFSRations feed = new HFSRations();
		feed.stomach();
	}
    
    
	public void stomach()
	{
        double extra = 0.0;
        System.out.print("Did you have a surplus last quarter? (Y or N) --> ");
        char answer = bornstellar.nextLine().charAt(0);
        if(answer == 'Y' || answer == 'y')
        {
            System.out.print("\nHow much was it? --> ");
            extra = bornstellar.nextDouble();
        }
		System.out.print("\n\n\nYou had this many dining dollars at the beginning of the quarter:  $");
        initial = bornstellar.nextDouble();
        System.out.print("\n\nHow much money do you have right now?:  $");
        current = bornstellar.nextDouble();
		System.out.print("\n\nYou have spent this many dining dollars so far:  $" + (initial + extra - current) );
        System.out.print("\n\nHow much time has elapsed since beginning of quarter? (in days) -->  ");
        duration = bornstellar.nextInt();
        System.out.print("\n\nHow much time do you have in any given semester? (in days) -->");
        totalDuration = bornstellar.nextInt();
        average = (initial + extra - current) / ((double)(duration));
        double myAverage = ((initial+extra) / (totalDuration));
        surplus = myAverage - average;
		System.out.println("\nAssuming a quarter period, your consumption of dining dollars per day at this rate is:  $" + average);
        System.out.println("\nAssuming a quarter period, your consumption of dining dollars per day should be:  $" + myAverage);
        System.out.println("\nThis is your tentative surplus (or deficit): " + (surplus * totalDuration));
        System.out.println("\nThis is your surplus as of the current moment: " + surplus * (double)(duration));
	}
    
}