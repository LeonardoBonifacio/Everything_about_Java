package content;

public class Class05ConditionalStatements01 {
    public static void main(String[] args) {
        // Syntax of if Statement
        // if statement only accept comparations which will return true or false
        int age = 10;
        boolean isAllowedToBuyAlcohol = age >= 18;
        
        if (isAllowedToBuyAlcohol) { // only executed if returns True
            System.out.println("Authorized to buy Alcohol");
        } 
        else{
            System.out.println("Sorry , you are not allowed to buy alcohol");
        }

        // if you want check if whatever is false use the unary operator -> ! <- which means basicaly not or negation
        if (!isAllowedToBuyAlcohol) { // the opereator ! basicaly invert the result keep in isAllowedToBuyAlcohol
            // this if means if it's not true then print this message
            System.out.println("Sorry , you are not allowed to buy alcohol");
        }

        
        // JOKE
        // boolean c = true;
        // if(c = false){
        //     System.out.println("Inside weird condition")
        // }
         

    }
}
