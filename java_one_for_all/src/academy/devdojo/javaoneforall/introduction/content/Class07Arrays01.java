package content;

public class Class07Arrays01 {
    public static void main(String[] args) {
        //int[] ages = null; when we initialize one array with 'null' this is the same as say "hey this is a variable that it's not doing anything"
        // it's not pointing or reference any placing memory especificaly, but basically just hanging there and none of the primitive
        // types can actually do this
        //String name = null; String also can be initialize with null, because he is a reference type
        int[] ages =  new int[3]; // a reference variable also can point at the objetc, and an array is always an object
        // we always must initialize arrays with the size of them(inside of the second [])
        // the only place which you see the 'new' keyword together with a primitive type is when you are creating arrays
        ages[0] = 10;
        ages[1] = 11;
        ages[2] = 12;
        System.out.println(ages);
        for (int i : ages) {
            System.out.println(i);
        }
    }
}
