package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays03 {
    public static void main(String[] args) {
        // way number 1 creating an array
        int[] numbers = new int[3];
        // Creating an array already fill(must be fill com data types which match with the data type the array that storaged these data)
        // way number 2 creating an array
        int[] numbers2 = {1, 2, 3, 4, 7};
        // way number 3 creating an array
        int[] numbers3 = new int[]{10, 11, 12, 13, 14};// this way you cannot have the size of the array write inside the [], because you are assigned the values
        // can iterating over the array like this
        for (int i = 0; i < numbers3.length; i++) {// if you the index, use this for
            System.out.println(numbers3[i]);
        }
        // we can also iterating over the array like this(with for each), if you need only iterating over an array use this for
        for (int i : numbers3) {// just like for each number in numbers3
            // in for each we don't have to do the bussines logic, basically the for each will know the size of the array for us an behind the scenes 
            // it will just go over everything
            /* This is what's happening inside this for each
             * int num = numbers3[0];
             * System.out.println(num);
             * num = numbers3[1];
             * System.out.println(num);
             * num = numbers3[2];
             * System.out.println(num)
             */
            System.out.println(i);
        }

        // local variable created inside the for statements, cannot be used in other scopes

        /*
        char[] letters = new char[]{'a', 'b', 'c'};
        for (char c : letters) {
            System.out.println(c);
        }
        */
    }
}
