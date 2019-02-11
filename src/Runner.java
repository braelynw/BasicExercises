public class Runner {

    public static void main(String[] args) {

        Car bCar = new Car (2000, "Mazda", 1000, "X");
        bCar.setMiles(3000);
        bCar.toString();


        Rectangle newRect = new Rectangle(10, 10);


        System.out.println(newRect.getArea());
        System.out.println(newRect.getDiagonal());
        System.out.println(newRect.isSquare());
    }


}
