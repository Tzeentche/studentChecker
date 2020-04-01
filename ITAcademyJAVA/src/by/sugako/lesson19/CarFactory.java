package by.sugako.lesson19;

public class CarFactory {

    public static Car buildCar(CarType model) {
        if(model == null) return null;

        switch (model) {
            case SEDAN: {
                return new SedanCar();
            }

            case SMALL: {
                return new SmallCar();
            }

            case LUXURY: {
                return new LuxuryCar();
            }

            default: {
                return null;
            }
        }
    }
}
