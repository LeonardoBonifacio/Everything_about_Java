package academy.devdojo.javaoneforall.introduction.exercises;

public class Scope {
    private static int x = 1;

    public static void main(String[] args) {
        int x = 4;

        System.out.println("Local x in main is: " + x);// 4

        useLocalVariable();// 24 25
        useField();// 1 10
        useLocalVariable();// 24 25
        useField();// 10 100

        System.out.println("Local x in main is: " + x);// 4
    }

    public static void useLocalVariable(){
        int x = 24;

        System.out.println("Local x on entering method useLocalVariable is " + x);// 24
        ++x;
        System.out.println("Local x before exiting method useLocalVariable is: " + x);// 25
    }

    public static void useField(){
        System.out.println("Field x on entering method useFIeld is: " + x);// 1 10
        
        x *= 10;

        System.out.println("Field x before exiting method useField is: " + x);// 10 100


    }
}
