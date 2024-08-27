package exercises;
public class SumAndPrint {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            sum += count;
            System.out.println(sum);
            count++;
        }

        int c = 0;
        int product = 3;

        while (c <= 5) {
            ++c;
            product *= c;
        }
        System.out.println(product);
    }
}
