package code;

import static java.lang.Math.abs;

public class Drone {
    public String triangle(int a, int b, int c)
    {
        if ( a < 1 || b < 1 || c < 1 || a+b <= c || abs(a-b) >= c) {
            return  "Not a triangle";
        }

        if( a == b && b ==  c) {
            return "Equilateral triangle";
        }

        if( ( a == b && b != c ) || ( a == c && c != b ) || ( b == c && c != a )) {
            return  "Isosceles triangle";
        }

        return "Scalene triangle";

    }
}
