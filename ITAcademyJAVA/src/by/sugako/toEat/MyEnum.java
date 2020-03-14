package by.sugako.toEat;

public enum MyEnum {

    BREAFAST(new Menu("всянка, яйца жаренные, кофе, фрукты"));
//    LUNCH(new Menu()),
//    DINNER(new Menu()),
//    LATE_DINNER(new Menu());

    private Menu menu;

    MyEnum(Menu menu) {

        this.menu = menu;
    }
}
