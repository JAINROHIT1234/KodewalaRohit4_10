package Day_27_Encapsulation;

public class MainFundTransfer {

	public static void main(String[] args) {
		FundTransfer ft = new FundTransfer("Rohit jain", 8596124,8000);
		FundTransfer ft2 = new FundTransfer("Arjav", 859647 , 5000);
		
		ft.doCredit(1000);
		double creditView = ft.getBalance();
		System.out.println(creditView);
		
		ft2.doDebit(1000);
		double debitView = ft2.getBalance();
		System.out.println(debitView);
		
		ft.transferTo(ft2, 2000);

		System.out.println("AccountHolder : " + ft.getAccountHolder() + " " + "AccountNumber : " + ft.accountNumber() + " "  + "CurrentBalance : " + ft.getBalance() );
		System.out.println("AccountHolder : " + ft2.getAccountHolder() + " " + "AccountNumber : " + ft2.accountNumber() + " " + "CurrentBalance : " + ft2.getBalance());

	}

}
