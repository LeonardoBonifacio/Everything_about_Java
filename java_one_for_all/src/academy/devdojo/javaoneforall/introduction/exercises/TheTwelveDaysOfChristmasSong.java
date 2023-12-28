package academy.devdojo.javaoneforall.introduction.exercises;

public class TheTwelveDaysOfChristmasSong {
    public static void main(String[] args) {
        String[] days = { "First", "Second", "Third", "Fourt", "Fift", "Sixty", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve" };
        for (int day = 1; day < 12; day++) {
            System.out.println();
            System.out.println("On the " + days[day - 1] + " day of Christmas My tru love sent to me");
            switch (day) {
                case 1:
                    System.out.println("A partridge in a pear tree");
                    break;
                case 2:
                    System.out.println("Two turtle doves,\r\n" +
                            " And a partridge in a pear tree.");
                    break;
                case 3:
                    System.out.println("Three French hens,\r\n" +
                            " Two turtle doves,\r\n" +
                            " And a partridge in a pear tree.");
                    break;
                case 4:
                    System.out.println("Three French hens,\r\n" +
                            " Two turtle doves,\r\n" +
                            " And a partridge in a pear tree,\r\n" +
                            " And five golden rings");
                    break;
                case 5:
                    System.out.println("Three French hens,\r\n" +
                            " Two turtle doves,\r\n" +
                            " And a partridge in a pear tree,\r\n" +
                            " And five golden rings\r\n" +
                            "And six geese a-laying");
                    break;
                case 6:
                    System.out.println("Three French hens,\r\n" +
                            " Two turtle doves,\r\n" +
                            " And a partridge in a pear tree,\r\n" +
                            " And five golden rings\r\n" +
                            "And six geese a-laying\r\n" +
                            "And seven swans a-swimming");
                case 7:
                    System.out.println("Three French hens,\r\n" +
                            " Two turtle doves,\r\n" +
                            " And a partridge in a pear tree,\r\n" +
                            " And five golden rings\r\n" +
                            "And six geese a-laying\r\n" +
                            "And seven swans a-swimming");
                case 8:
                    System.out.println("Three French hens,\r\n" +
                            " Two turtle doves,\r\n" +
                            " And a partridge in a pear tree,\r\n" +
                            " And five golden rings\r\n" +
                            "And six geese a-laying\r\n" +
                            "And seven swans a-swimming" +
                            " And eight maids a-milking");

                case 9:
                    System.out.println("Three French hens,\r\n" +
                            " Two turtle doves,\r\n" +
                            " And a partridge in a pear tree,\r\n" +
                            " And five golden rings\r\n" +
                            "And six geese a-laying\r\n" +
                            "And seven swans a-swimming" +
                            " And eight maids a-milking\r\n" +
                            "And nine ladies dancing");
                case 10:
                    System.out.println("Three French hens,\r\n" +
                            " Two turtle doves,\r\n" +
                            " And a partridge in a pear tree,\r\n" +
                            " And five golden rings\r\n" +
                            "And six geese a-laying\r\n" +
                            "And seven swans a-swimming" +
                            " And eight maids a-milking\r\n" +
                            "And nine ladies dancing\r\n" +
                            " And ten lords a-leaping");
                case 11:
                    System.out.println("Three French hens,\r\n" +
                            " Two turtle doves,\r\n" +
                            " And a partridge in a pear tree,\r\n" +
                            " And five golden rings\r\n" +
                            "And six geese a-laying\r\n" +
                            "And seven swans a-swimming" +
                            " And eight maids a-milking\r\n" +
                            "And nine ladies dancing\r\n" +
                            " And ten lords a-leaping");
                case 12:
                    System.out.println("Three French hens,\r\n" +
                            " Two turtle doves,\r\n" +
                            " And a partridge in a pear tree,\r\n" +
                            " And five golden rings\r\n" +
                            "And six geese a-laying\r\n" +
                            "And seven swans a-swimming" +
                            " And eight maids a-milking\r\n" +
                            "And nine ladies dancing\r\n" +
                            " And ten lords a-leaping\r\n" +
                            " And  eleven pipers piping\r\n" +
                            " And twelve drummers drumming");

            }
        }
    }
}
