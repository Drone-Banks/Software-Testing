package code;

import org.junit.Test;

import static org.junit.Assert.*;

public class DroneTest {

    @Test
    public void Test() {
        Drone one = new Drone();

        int a = 3, b = 2, c = 1;
        String ans = one.triangle(a, b, c);
        System.out.println(ans);
        assertEquals("Not a triangle", ans);

        a = 3; b = 3; c = 3;
        ans = one.triangle(a, b, c);
        assertEquals("Equilateral triangle", ans);

//        a = 3; b = 2; c = 2;
//        ans = one.triangle(a, b, c);
//        assertEquals("Isosceles triangle", ans);

        a = 3; b = 4; c = 5;
        ans = one.triangle(a, b, c);
        assertEquals("Scalene triangle", ans);
    }
}