import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //code mission 1
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
            if (floor == -1){
                break;
            }
        }

        //code mission 2
        Dimensions cargoOneDimensions = new Dimensions(15,20,22);
        CargoInformation cargoOne = new CargoInformation(305,
                "city Saint Petersburg, st. ...",
                true,
                "12345",
                true,
                cargoOneDimensions);
        System.out.println(cargoOne);
        System.out.println("---------------------");

        Dimensions cargoTwoDimensions = cargoOneDimensions.setLength(100);
        CargoInformation cargoTwo = cargoOne.setCargoDimensions(cargoTwoDimensions);
        cargoTwo = cargoTwo.setMass(1050);
        cargoTwo = cargoTwo.setRegistrationNumber("54321");
        cargoTwo = cargoTwo.setFragile(false);

        System.out.println(cargoTwo);
        System.out.println("---------------------");

        Dimensions cargoOneDimensionsCopy = cargoOneDimensions.setWidth(20);
        cargoOneDimensionsCopy = cargoOneDimensionsCopy.setHeight(40);
        CargoInformation cargoOneCopy = cargoOne.setCargoDimensions(cargoOneDimensionsCopy);
        cargoOneCopy = cargoOneCopy.setAddress("city Moscow");

        System.out.println(cargoOneCopy);
        System.out.println("---------------------");



    }
}