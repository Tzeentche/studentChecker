package by.sugako.lesson11.aboutInterfaces;

public interface Movable {

    int DISTANCE = 10_000;

    void move();

    default void movie(int i){

    }
}
