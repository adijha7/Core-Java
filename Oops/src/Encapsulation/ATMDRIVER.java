package Encapsulation;

public class ATMDRIVER {
	public static void main(String[] args) {
		ATM A = new  ATM();
		A.setpin(1203);
		System.out.println(A.getpin());
	}

}
