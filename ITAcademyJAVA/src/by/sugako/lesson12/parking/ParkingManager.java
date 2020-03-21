package by.sugako.lesson12.parking;

public class ParkingManager {

    private Parkomat parkomat = new Parkomat();

    private Parking parking = new Parking();

    public void startParking() {
        while(true) {
            String map = parking.printParkingMap();
            parkomat.helloMessage(map);
            String newPlateNumber = parkomat.readPlateNumber();
            Car car = parking.driveOut(newPlateNumber);
            if(car != null) {
                parkomat.showGoodBye(newPlateNumber);
                continue;
            }

            int result = parking.driveIn(new Car(newPlateNumber));

            if(result != -1) {
                parkomat.showParkedPlace(result);
            } else {
                parkomat.showParkingFull();
            }
        }
    }
}
