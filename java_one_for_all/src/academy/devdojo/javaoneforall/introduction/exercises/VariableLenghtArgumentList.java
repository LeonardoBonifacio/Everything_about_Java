package academy.devdojo.javaoneforall.introduction.exercises;

public class VariableLenghtArgumentList {
    public static void main(String[] args) {
        System.out.println(product(2,3));
        System.out.println(product(10000, 12312));
        System.out.println(product(2,412));
        System.out.println(product(2,1237));
        System.out.println(product(2,9143));
        System.out.println(product(2,21241));
    }

    private static int product(int... numbers){
        int product = 1;
        for (int i : numbers) {
            product *= i;
        }
        return product;
    }
}
