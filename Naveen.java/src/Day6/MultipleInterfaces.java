package Day6;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

interface ReminderTask{
	void remind(String message);
}

interface NotificationMessage
{
	void remind(String message);  // Same Method Name 
}

public class MultipleInterfaces {
	
	public static void main(String[] args) {
		String[] reminderHour = {"08:00","09:00","12:17","20:00"};
		
		String[] displayMessage = {"Time for breakfast",
									   "Time to go to Office", 
									    "Time for Lunch", 
									     "Time for Dinner"};
		
		ReminderTask reminderTask = (msg) -> {
			System.out.println("Reminder: It's " + msg);
		};
		
		NotificationMessage notificationMessage = (msg) -> {
			System.out.println("Notification: " + msg);
		};
		
		
		Timer timer = new Timer();
		
		TimerTask timerTask = new TimerTask() {
			
			@Override
			public void run() {
				
				String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
				
				for(int i=0;i<reminderHour.length;i++)
				{
					if(currentTime.equals(reminderHour[i]))
					{
						reminderTask.remind(displayMessage[i]);
						notificationMessage.remind("Don't miss it!");
					}
				}
				
			}
		};
		
		
		
		timer.schedule(timerTask, 0,60000); // For every minute it will check
		
		System.out.println("Reminder System Started....");
		
	}

}
