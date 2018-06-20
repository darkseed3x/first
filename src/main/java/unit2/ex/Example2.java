package unit2.ex;

import unit2.RandomInt;

public class Example2 {
    @RandomInt(min = 50,max = 5000)
    private int a;
    @RandomInt(min = 45,max = 4562)
    private int b;
    private String s;

    @Override
    public String toString() {
        return "Example2{" +
                "a=" + a +
                ", b=" + b +
                ", s='" + s + '\'' +
                '}';
    }
}
