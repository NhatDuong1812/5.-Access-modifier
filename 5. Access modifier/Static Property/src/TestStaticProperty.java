public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","v8");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("BMW","v12");
        System.out.println(Car.numberOfCars);

    }
}

