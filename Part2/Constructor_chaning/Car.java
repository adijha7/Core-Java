package Constructor_chaning;

public class Car {
    int car_id;
    String car_brand;
    String car_model;
    double car_price;

    Car() {
        System.out.println("Hello this No-Argument ");
    }

    Car(int car_id) {
        this();
        System.out.println("This is 1 Argument");
        this.car_id = car_id;
    }

    Car(int car_id, String car_brand) {
        this(car_id);
        System.out.println("This is 2 Argument");
        this.car_brand = car_brand;
    }

    Car(int car_id, String car_brand, String car_model) {
        this(car_id, car_brand);
        System.out.println("This is 3 Argument");
        this.car_model = car_model;
    }

    Car(int car_id, String car_brand, String car_model, double car_price) {
        this(car_id, car_brand, car_model);
        System.out.println("This is 4 Argument");
        this.car_price = car_price;
    } 

    public static void main(String[] args) {
        Car c = new Car(101, "BMW", "M4", 25000);

        System.out.println();
        System.out.println("------------------Car Details -----------------------------");
        System.out.println("The Car id is :" + c.car_id);
        System.out.println("The Car brand is :" + c.car_brand);
        System.out.println("The Car Model is :" + c.car_model);
        System.out.println("The Car Price is :" + c.car_price);
    }
}

