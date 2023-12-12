package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements02 {
    // print all even numbers from 0 to 1000000
    public static void main(String[] args) {
        for (int i = 1; i <= 1000000; i++) { // shortcurt -> write 'fori' and press enter
            if (i % 2 == 0) {
                System.out.println("Until 1 milion: " + i);
            }
        }
    }
}
