package by.sugako.hairCut;

public class StringBufferExample {

    private StringBuffer stringBuffer;

    public StringBufferExample() {

        stringBuffer = new StringBuffer();
    }

    private void print() {

        System.out.println(stringBuffer);
    }

    public StringBuffer getStringBuffer() {

        return stringBuffer;
    }

    public static void main(String[] args) {

        StringBufferExample example = new StringBufferExample();
        example.getStringBuffer().append("I");
        example.print();
        example.getStringBuffer().append(" love");
        example.print();
        example.getStringBuffer().append(" Java!");
        example.print();
        example.getStringBuffer().insert(0, "Hello, ");
    }
}
