package academy.devdojo.javaoneforall.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        // this classe works with the file messages_en_US.properties
        System.out.println(Locale.getDefault());

        Locale unitedStates = Locale.US;
        ResourceBundle bundle = ResourceBundle.getBundle("messages", unitedStates);
        System.out.println(bundle.containsKey("hello"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("hi"));

        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.containsKey("hello"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("hi"));

        // if i choose one local with one especific language, java will try to search recursivaly
        // until this local(and language) being find out
        // if its'n find out java will try to search for the local and language default of your system
        // if its'n find out java will try to seach for the local and language default available
        // Locale("fr", "CA");
        // messages_fr_CA.properties
        // messages_fr.properties
        // messages_en_US.properties
        // messages_en.properties
        // messages.properties


    }
}
