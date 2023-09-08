/*
Write a Java program to calculate the total fare for a cab ride. 
The fare depends on two factors: 
the number of hours the cab has been used (hr) and the distance traveled in kilometers (km). 
If the cab has been used for 8 hours or less and the distance is greater than 250 kilometers, an additional charge is applied based on the extra kilometers. 
If the cab has been used for more than 8 hours but the distance is 250 kilometers or less, an extra charge is applied based on the extra hours. 
Calculate and display the total fare for the cab ride based on these conditions.
 */

public class IBM_14 {
    public static void main(String[] args) {
        int hr = 8;
        int km = 250;
        int charge = 2000;
        int extra = 0;

        if((hr <= 8 && km > 250) || (hr > 8 && km > 250)){
            charge += (20*(km-250)); 
        }
        else if(hr > 8 && km <= 250){
            charge += (100*(hr - 8)); 
        }

        System.out.println(charge);
    }
}
