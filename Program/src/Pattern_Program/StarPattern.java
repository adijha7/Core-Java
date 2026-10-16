package Pattern_Program;

public class StarPattern {
	
	/*
	 *     * * * *
	 *     * * *  
	 *     * *  
	 *     *
	 * 
	 * *\
	 */

	
	public static void main(String[] args) {
		 for(int i=1 ; i<=4; i++) {
			 for ( int j=1;j<=i;j--) 
			  System.out.print("");
			  
			 for (int k=4;k>=1;k--) 
				 System.out.print("*");
			 
				 System.out.println();
			 
			
			
		 }
	}
}
