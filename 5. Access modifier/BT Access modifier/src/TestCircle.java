public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.ra  dius = 2;
        circle1.color = "black";
        System.out.println("Hình tròn thứ nhất có bán kính là: " + circle1.getRadius() + ", diện tích là: " + circle1.getArea());

        Circle circle2 = new Circle(3);
        System.out.println("Hình tròn thứ hai có bán kính là: " + circle2.getRadius() + ", diện tích là: " + circle2.getArea());
    }
}
