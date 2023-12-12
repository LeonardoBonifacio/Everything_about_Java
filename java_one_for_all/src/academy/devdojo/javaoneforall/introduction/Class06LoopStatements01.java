package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements01 {
    public static void main(String[] args) {
        // LoopStatements -> while, do-while and for
        int counter = 20;
        while (counter < 10) {// <-  everything put here need results in true to keep running this while statement
            System.out.println(++counter);
        }

        counter = 20;
        do {// <- everything put here will go executed at least once, even though the condition inside the while return false
            System.out.println("Inside do while: " + ++counter);
        } while (counter < 10);

        for(int i=0; i < 10; i++){// most used in arrays and  things which i know how big or how little are
            // inside the parenthesis (init; end ;step)
            // variables initializity inside the for statatement are variable locable, which means if we try use outside this for block
            // the compilor raised a error
            System.out.println("Inside the for statement: " + i);
        }
    }
}
