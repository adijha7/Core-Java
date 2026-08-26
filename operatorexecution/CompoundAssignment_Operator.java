package operatorexecution;

public class CompoundAssignment_Operator {
	public static void main(String[] args) {
//		Wallet_Balance =500
		int Wallet_Balance=500;
      //	deposit 250	
      // Wallet_Balance =Wallet_Balance+250;
		Wallet_Balance+=250;
        // Withdraw=50	
		// Wallet_Balance =Wallet_Balance-50;
		Wallet_Balance-=50;
		Wallet_Balance+=100;
		Wallet_Balance-=120;
		System.out.println(Wallet_Balance);
		
	}

}