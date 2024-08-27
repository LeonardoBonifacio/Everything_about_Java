package exercises;

public class QualityPoints {
    public static void main(String[] args) {
        int studentAverage = 100;

        System.out.println("Your average is: " + qualityPoints(studentAverage));

    }

    public static int qualityPoints(int average){
        if (average >= 90 && average <= 100) {
            return 4;
        }
        else if (average >= 80 && average <= 89) {
            return 3;
        }
        else if (average >= 70 && average <= 79) {
            return 2;
        }
        else if (average >= 60 && average <= 69) {
            return 1;
        }
        else{
            return 0;
        }
    }
}
