package exercises;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        System.out.println("The distance between this points is " + distance(12, 10, 12, 3));
        
    }

    public static double distance(double pointA1, double pointB1, double pointA2, double pointB2){
        // d=√((x_2-x_1)²+(y_2-y_1)²)
        return Math.sqrt(Math.pow(pointA2 - pointA1, pointA2 - pointA1) + Math.pow(pointB2 - pointB1, pointB2 - pointB1));
    }
}
