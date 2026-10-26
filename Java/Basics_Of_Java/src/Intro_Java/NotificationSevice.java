package Intro_Java;

public class NotificationSevice {
public void sendNotification(String _type) {
	System.out.println("NotificationService.sendNotification()");
	if(_type.equalsIgnoreCase("sms")) {
		sendSMS();
	}else if (_type.equalsIgnoreCase("email"))
	{
		sendEmail();
	}else
	{
		sendWhatApps();
	}	
}

private void sendSMS() {
	System.out.println("NotificationService.sendSMS() START");
	
	System.out.println("NotificationService.sendSMS() END");
	
}

private void sendEmail() {
	
	System.out.println("NotificationService.sendEmail() START");
	
	System.out.println("NotificationService.sendEmail() END");
}

private void sendWhatApps() {
	
System.out.println("NotificationService.sendWhatApp() START");
	
	System.out.println("NotificationService.sendWhatApp() END");
	
	
}


}
