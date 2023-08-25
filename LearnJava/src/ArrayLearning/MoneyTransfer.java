package ArrayLearning;

public class MoneyTransfer {
	public Integer MoneyTransfered =10 ;
	public Integer transfertheamount() {
		System.out.println("Hi dude amount transfered "  + MoneyTransfered  + " rupees pls check");
		return MoneyTransfered;
	}



	public static void main(String[] args) {


	MoneyTransfer	 googlePay =new MoneyTransfer();
		Integer amount = googlePay.transfertheamount();
		System.out.println("got the money dude");

	}

}
