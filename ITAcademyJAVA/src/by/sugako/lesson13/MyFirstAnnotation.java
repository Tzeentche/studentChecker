package by.sugako.lesson13;

import java.lang.annotation.*;

//@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)

public @interface MyFirstAnnotation {

    int version = 0;

    int version();

    String description() default "";
}
