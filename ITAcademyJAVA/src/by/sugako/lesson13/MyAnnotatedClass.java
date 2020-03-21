package by.sugako.lesson13;

public class MyAnnotatedClass {

    private String className;

    @MyFirstAnnotation(version = 2, description = "getter")
    public MyAnnotatedClass(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
