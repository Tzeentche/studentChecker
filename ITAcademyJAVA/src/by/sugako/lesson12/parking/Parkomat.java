package by.sugako.lesson12.parking;

import java.util.Scanner;

public class Parkomat {

    private Scanner scaner;

    public void helloMessage(String map) {
        System.out.println(map);
        System.out.println("Hello. Please, enter plate number!");
    }

    public String readPlateNumber() {
        while(true) {
            System.out.println("Plate number: ");
            if(scaner == null) {
                scaner = new Scanner(System.in);
            }

            String newPlateNumber = scaner.nextLine();
            if(newPlateNumber != null && !"".equals(newPlateNumber.trim())) {
                return newPlateNumber;
            }
        }
    }

    public void showParkingFull() {
        System.out.println("There are no free places!");
    }

    public void showParkedPlace(int placeNumber) {
        System.out.println("Successfully parked on place " + placeNumber);
    }

    public void showGoodBye(String plateNumber) {
        System.out.println("Good bye, car " + plateNumber);
    }
}
