package by.sugako.lesson10.beans;

import java.util.Objects;

public class Car1 {

    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car1 car1 = (Car1) o;
        return year == car1.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year);
    }

    @Override
    public String toString() {
        return "Car1{" +
                "year=" + year +
                '}';
    }
}
