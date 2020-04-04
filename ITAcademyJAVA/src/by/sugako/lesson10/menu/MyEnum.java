package by.sugako.lesson10.menu;

public enum MyEnum {

    BREAKFAST(new Menu("Овсянка, яйца жареные, кофе, булочка")),
    LUNCH(new Menu("Суп, салат, котлета, рис")),
    DINNER(new Menu("Рыба, овощи, фрукты")),
    LATE_DINNER(new Menu("Йогурт, орехи, сухофрукты"));

    private Menu menu;

    MyEnum(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }
}
