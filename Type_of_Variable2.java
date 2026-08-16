public class Type_of_Variable2 {
   
        int instanceVariable = 20; // Instance variable
          

        void myMethod() {
            System.out.println("Instance Variable: " + instanceVariable);
        }
         public static void main (String[] args){
        Type_of_Variable2 obj = new Type_of_Variable2();
        obj.myMethod();
    }

}

