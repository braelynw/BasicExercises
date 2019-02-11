public class Runner {

    public static void main(String[] args) {

        Car bCar = new Car (2000, "Mazda", 1000, "X");
        bCar.setMiles(3000);
        bCar.toString();

        Rectangle newRect = new Rectangle(10, 10);
        newRect.getArea();
        newRect.getDiagonal();
        newRect.isSquare();
    }


}
