package academy.devdojo.javaoneforall.introduction.content;

public class Class06LoopStatements03 {
    public static void main(String[] args) {
        int totalNumber = 50;
        for (int i = 0; i <= totalNumber; i++) {
            // most smart way
            // if(i > 25){
            //    break;
            //}
            // System.out.println(i)
            if (i <= 25) {
                System.out.println(i);
            }
            else{
                break; // break only works inside the loops Statements block  and switch case structure
            }
            System.out.println("Outside if " + i);
        }
    }
}
