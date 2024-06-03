package academy.devdojo.javaoneforall.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        concatString(30_000);// you can put _ in the int numbers only for better visualization
        long end = System.currentTimeMillis();
        System.out.println("Time taken with String " + (end - begin) + " ms");// time that jvm spend creating 30_000 new
                                                                              // String
        // always take a close look of the performance in your system, because it's much
        // more dangerous if your applications support millions or even billions of the
        // users accessing in the same time, and creating several quantity of Strings at
        // the same time
        // that's because you must use Stringbuilders or StringBuffers
        // the difference between among they is the string buffer methods are
        // Syncronyzed(which only allow one thead at a time use, because of the multi thread concept)

        begin = System.currentTimeMillis();
        concatStringBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder " + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        concatStringBuffer(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuffer " + (end - begin) + " ms");

    }

    private static void concatString(int size) {
        String text = "";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int size) {
        StringBuilder text = new StringBuilder(size);
        // with StringBuilder our performance its much beter than only use  String class as well
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }

    private static void concatStringBuffer(int size) {
        StringBuffer text = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }
}
