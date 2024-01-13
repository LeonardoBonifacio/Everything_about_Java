package academy.devdojo.javaoneforall.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Leonardo Bonifácio";
        name.concat(" é maluco");
        System.out.println(name);
        name = name.substring(0,3);
        System.out.println(name);
        // StringBuilder works with objects and they are different of ordinary Strings(which are imutable)
        StringBuilder sb = new StringBuilder("Leonardo Bonifácio");
        sb.append(" é maluco").append(" ta sabendo né? ");// i cannot use the plus sign(+) for concatenation in StringBuilders
        // the append method reassing the reference, and return one StringBuilder object as well
        // but not all methods will are going to do that
        System.out.println(sb.substring(0, 3));
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb.delete(19, 27));
        // deleting everything in a StringBuilder or Buffer
        sb.setLength(0);// this way
        System.out.println(sb.delete(0, sb.length()));// and this way

    }
}