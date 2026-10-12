package NonStaticVariables;

public class Book {
//	To Declare  the variable 
	String title;
	String author;
	int price;
	
	public static void main(String[] args) {
//		 initialize non static member we need to create a object
		
		Book b1=new Book(); // here Book() means book Constructor and b1 is Reference variable which store address 
		
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.price);
		
		b1.title="Harry Poter";
		b1.author="JK Rowling";
		b1.price=150;
		System.out.println("----------------------------------------------------");
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.price);
		
		System.out.println("---------------------- for b2 ------------------------------");
		Book b2=new Book();
		
		System.out.println(b2.title);
		System.out.println(b2.author);
		System.out.println(b2.price);
		
		b2.title="Why Not Me";
		b2.author="Arubhav Agarwal";
		b2.price=320;
		System.out.println("----------------------------------------------------");
		System.out.println(b2.title);
		System.out.println(b2.author);
		System.out.println(b2.price);
		
		System.out.println("---------------------- for b3 ------------------------------");
		
        Book b3=new Book();
		
		System.out.println(b3.title);
		System.out.println(b3.author);
		System.out.println(b3.price);
		
		b3.title="Rich Dad Poor Dad";
		b3.author="Robert ";
		b3.price=200;
		System.out.println("----------------------------------------------------");
		System.out.println(b3.title);
		System.out.println(b3.author);
		System.out.println(b3.price);
	
	}

}
