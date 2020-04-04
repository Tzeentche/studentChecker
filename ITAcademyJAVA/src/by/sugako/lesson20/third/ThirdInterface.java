package by.sugako.lesson20.third;

@FunctionalInterface
public interface ThirdInterface<T extends Integer> {

        void doSomething(T a, T b, T c);
}
