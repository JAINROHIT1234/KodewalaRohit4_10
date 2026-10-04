package Day_15_Degubbing_keys;

public class NotificationService {

	public void sendNotification(String _type) {
		System.out.println("NotificationService.sendNotification()");

		if (_type.equalsIgnoreCase("sms")) {
			sendSms();
		} else if (_type.equalsIgnoreCase("email")) {
			sendEmail();
		} else {
			sendWhatapp();
		}
	}

	private void sendSms() {
		System.out.println("NotificationService.sendSms() Start");
		
		System.out.println("NotificationService.sendSms()");
		
		System.out.println("NotificationService.sendSms() End");
		
	}

	private void sendEmail() {
		System.out.println("NotificationService.sendEmail() Start");
		
		System.out.println("NotificationService.sendEmail()");
		
		System.out.println("NotificationService.sendEmail() End");
	}

	private void sendWhatapp() {
		
		System.out.println("NotificationService.sendWhatapp() Start");
		
		System.out.println("NotificationService.sendWhatapp()");
		
		System.out.println("NotificationService.sendWhatapp() End");
	}

}
