/*
Given a lighthouse with a height of h meters and a light beam angle of x degrees, 
calculate and print its visibility length. Assume that the light beam forms a circular area on the water surface, 
and you need to find the area of this circle.

Input
h = 10
x = 30

Output
104
 */

import java.util.*;
public class IBM_13 {
    public static void main(String[] args) {
        double h = 10;
        double angle = Math.toRadians(30);
        double angVal = Math.tan(angle);

        int ans = (int) (Math.PI*(Math.pow((h*angVal), 2)));
        System.out.println(ans);

    }
}
