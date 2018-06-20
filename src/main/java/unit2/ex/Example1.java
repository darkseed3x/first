package unit2.ex;

import unit2.RandomInt;

public class Example1 {
        @RandomInt(min = 3,max = 500)
        private int x;
        @RandomInt(min = 1,max = 700)
        private int y;
        private String str;

    @Override
    public String toString() {
        return "Example1{" +
                "x=" + x +
                ", y=" + y +
                ", str='" + str + '\'' +
                '}';
    }
}
