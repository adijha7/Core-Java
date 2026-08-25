package operatorexecution;

public class Logical_OR_Execution {
    public static void main(String[] args) {
/*		Properties of simth -> colour1=red colour2=blue */
		
		String colour1="Red";
		String colour2="Blue";
		/*	Testcase 1 Properties t1=Black	 */
		boolean Testcase1=colour1=="Black"|| colour2=="Black";
		System.out.println(Testcase1);
		/*	Testcase 2 Properties t2=Pink	 */
		boolean Testcase2=colour1=="Pink"|| colour2=="Pink";
		System.out.println(Testcase2);
		/*	Testcase 3 Properties t3=Blue	 */
		boolean Testcase3=colour1=="Blue"|| colour2=="Blue";
		System.out.println(Testcase3);
		/*	Testcase 4 Properties t4=Yellow	 */
		boolean Testcase4=colour1=="Yellow"|| colour2=="Yellow";
		System.out.println(Testcase4);
		
		/*	Testcase 5 Properties t5=Red	 */
		boolean Testcase5=colour1=="Red"|| colour2=="Red";
		System.out.println(Testcase5);
	}
    
}
