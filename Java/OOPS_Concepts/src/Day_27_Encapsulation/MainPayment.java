package Day_27_Encapsulation;

public class MainPayment {

	public static void main(String[] args) {
		Payment payment = new Payment(1000);
		System.out.println(payment.getBalance());

	}

}
