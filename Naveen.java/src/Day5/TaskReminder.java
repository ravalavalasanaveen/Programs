package Day5;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
// Timer is a built in class that makes the code to run after some time or repeatedly. 
 import java.util.TimerTask;
 
 // Timertask represents the task that needs to be done at a particular time 

interface ReminderTask
{
	void remind(String message);
}

public class TaskReminder {

	public static void main(String[] args) {
		
	String [] reminderHours = {"8:00","9:00","16:25","16:26"};
	
		String[] displayMessage = {"Time for Breakfast", 
							"Time to go to office", 
							"Time for lunch", 
							"Time for Dinner"};
		
		
		ReminderTask reminderTask = (message) ->{
			
			
			System.out.println("Reminder: It's "+ message);
		};
		
		
		Timer timer = new Timer(); 
		
		// Here Timer works as an Clock 
		// TimeTask is an action that should be happen when the time is reached 
		// run() is a method that called automatically when the timer goes off. 
		
		
		
		TimerTask timerTask = new TimerTask() {
			
			@Override
			public void run() {
				
				// To get the current time 
				
		//		int currentHour = LocalTime.now().getHour();   // this will get the current hour 
				
				String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
				
				for(int i=0;i<reminderHours.length;i++)
				{
					
					if(currentTime.equals(reminderHours[i]))
					{
						reminderTask.remind(displayMessage[i]);
					}
					
					
//					if (currentHour == reminderHours[i]) {
//						reminderTask.remind(displayMessage[i]);
//						break;
//						
//					}
				}
		
				
			}
		};
		
	
		
		// schedule is method in java for scheduling a task using Timertask. 
		
		//timerTask -> Represents the action need to be run scheduled time 
		
		// Check every 60 seconds is there  time reaches or not. 
		
		timer.schedule(timerTask, 0 , 60000);
		
		System.out.println("Remainder is started");
		
	}

}
