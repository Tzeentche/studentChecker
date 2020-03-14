package by.sugako.parking;

public class Parking {

    private static final Place<Car>[] places = new Place[5];

    public Parking() {
        for(int i = 0; i < places.length; i++) {
            places[i] = new Place();
        }
    }

    public int driveIn(Car car) {
        for (int i = 0; i < places.length; i++) {
            if(places[i].isEmpty()) {
                places[i].setCar(car);
                return i;
            }
        }
        return -1;
    }

    public Car driveOut(String plateNumber) {
        for(int i = 0; i < places.length; i++) {

            if (!places[i].isEmpty()) {
                boolean b = places[i].getCar().getPlateNumber().equals(plateNumber);
                if (b) {
                    Car car = places[i].getCar();
                    places[i].setCar(null);
                    return car;
                }
            }
        }
        return null;
    }

    public String printParkingMap() {
        StringBuilder map = new StringBuilder();
        for(int i = 0; i < places.length; i++) {
            map.append("[");
            map.append(i);
            map.append(": ");
            if(places[i].isEmpty()) {
                map.append("Empty");
            }else {
                map.append(places[i].getCar().getPlateNumber());
            }
            map.append("] ");
        }
        return map.toString();
    }
}
