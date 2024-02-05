package academy.devdojo.javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest03 {
    private String name = "William";

    static class Inner {// one example of the Static Inner class is the interface Entry inside Map
        public void printOuterClassAttribute() {
            // inside Static inner Class you wont'be abble to use attributes that isn't
            // static
            System.out.println(new OuterClassesTest03().name);// you can create one object from the Outer class for
                                                              // access atributes that not are static
        }
    }

    public static void main(String[] args) {
        // since this is Static class you don't have to worry in create one object from
        // the outer Class
        Inner inner = new Inner();
        inner.printOuterClassAttribute();
    }
}
