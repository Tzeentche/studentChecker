package by.sugako.toEat;

import java.util.Objects;

public class Menu {

    private String description;

    public Menu(String description) {

        this.description = description;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(description, menu.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
