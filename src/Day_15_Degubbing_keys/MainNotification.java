package Day_15_Degubbing_keys;

public class MainNotification {

	public static void main(String[] args) {
		
		NotificationService notifyservice = new NotificationService();
		
	    notifyservice.sendNotification("sms");
	    notifyservice.sendNotification("email");
	    notifyservice.sendNotification("others");
		
		
		}

	}


