public class ClassNObj1 {
    public static void main(String[] args) {
        
        Car BMW = new Car();  // Creating new object of class
        Car Ford = new Car(); // Creating new object of class

        BMW.CarName = "BMW X3";
        BMW.CarPrice = 5;

        Ford.CarName = "Ford Mustang";
        Ford.CarPrice = 6;

        System.out.println(Ford.CarName);
    }
}

// Create a New class

class Car {
    String CarName;
    int CarPrice;
}
