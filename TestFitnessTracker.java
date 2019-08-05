/* page 224 #3

	8-1-19
	
	GETTERS AND SETTERS
	a. Includes:*data entry of fitness activity
				*number of minutes spent on activity
				*date
				*method to get each field
				Defaults to running, minutes 0, date Jan 1 2019
*/

public class TestFitnessTracker
{	
	public String activity;
	public int minutes;
	public String date;	
	
	
	public TestFitnessTracker()
	{
	//default constructors
	activity = "Running";
	minutes = 0;
	date = "January 1 2019";
	}
	
	//accessors (GETTERS)
	String getActivity()
	{
		return activity;
	}
	
	int getMinutes()
	{
		return minutes;
	}
	
	String getDate()
	{
		return date;
	}
	
}













































