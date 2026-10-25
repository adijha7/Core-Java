package hasARelationship;
import java.util.Scanner;

public class PersonDriver {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Adhar id : ");
		s.nextLine();
		
		System.out.println("Enter Adhar Card Number : ");
		String adharNo = s.nextLine();
		
	    System.out.print("Enter Person ID: ");
	    int id = s.nextInt();
	    s.nextLine(); 

	    System.out.print("Enter Person Name: ");
	    String name = s.nextLine();

	    System.out.print("Enter Gender: ");
        String gender = s.nextLine();

	    System.out.print("Enter DOB: ");
	    String date = s.nextLine();

	    System.out.print("Enter Adhar ID: ");
        int adharId = s.nextInt();
        s.nextLine();
        
        Person p = new Person(id, name, gender, date);
        Adhar a = new Adhar(adharId, adharNo);

        p.display();
        a.display();

        s.close();
		
		
		
		
	}

}
