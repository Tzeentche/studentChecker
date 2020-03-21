package by.sugako.lesson11.aboutInterfaces;

public abstract class Vehicle implements Payable, Movable {

    private String licensePlateNumber;

    abstract void drive();

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }
}
