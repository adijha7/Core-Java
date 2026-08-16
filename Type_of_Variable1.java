// first example of variable types in java

public class Type_of_Variable1 {
    


    static void myMethod() {
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        Type_of_Variable1 obj = new Type_of_Variable1();
        obj.myMethod();
        myMethod();
    }
}
