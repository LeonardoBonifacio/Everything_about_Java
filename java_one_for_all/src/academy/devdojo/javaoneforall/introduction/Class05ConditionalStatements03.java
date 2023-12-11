package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements03 {
    public static void main(String[] args) {
        // Ternary Operator(abreviation for condicional statement)
        // Ternary operator always return one value(which means that it might be storaged in somewhere or simply put in print)
        // if salary > 2000 "buy xbox series X" "don't buy xbox series X"
        double salary = 3500D;
        String shouldBuyMessage = "Buy xbox Series X";
        String shouldNotBuyMessage = "Don't buy xbox Series X";
        String displayMessage;
        if (salary > 2000) {
            displayMessage  = shouldBuyMessage;
        }
        else{
            displayMessage = shouldNotBuyMessage;
        }
        System.out.println(displayMessage);

        // We can simplify these if and else statement above, with ternary operator
        // Syntax of ternary operator (condition) ?       <true>     :       <false>
        String newDisplayMessage =  salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;
        // if the condition return true then the newDisplayMessage receive shouldBuyMessage if is not true then she receive shouldNotBuyMessage
        System.out.println(newDisplayMessage);
        // we can put the statement ternary directly in one System.out.println like this 
        System.out.println(salary > 2000 ? "You have more than two thousand dollars" : "you don't have more than two thousando dollars");
        // You need to store the results somewhere or use it somewhere you cannot have just a statement hanging around, for example :
        // salary > 2000 ? "You have more than two thousand dollars" : "you don't have more than two thousando dollars";
    }
}
