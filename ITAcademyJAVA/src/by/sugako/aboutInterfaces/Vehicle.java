package by.sugako.aboutInterfaces;

public abstract class Vehicle implements Payable, Movable {

    private String licensePlateNumber;

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    abstract void drive();

}
