package E5_11;

import java.util.Scanner;

public class CompassDirection {
    public static void main(String[] args) {
        System.out.println("Enter the angle in degrees : ");
        Scanner scanner = new Scanner(System.in);
        int angle = scanner.nextInt();
        String[] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
        int[] angles = {0, 45, 90, 135, 180, 225, 270, 315};
        int minDifference = Integer.MAX_VALUE;
        String nearestDirection = "";
        for(int i=0 ;i < angles.length; i++)
        {
            int difference = Math.abs(angle-angles[i]);
            if(difference < minDifference)
            {
                minDifference = difference;
                nearestDirection = directions[i];
            }
        }
        System.out.println("Nearest compass direction : " + nearestDirection);
    }
}
