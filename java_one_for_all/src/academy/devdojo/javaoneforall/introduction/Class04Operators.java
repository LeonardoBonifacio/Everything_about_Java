package academy.devdojo.javaoneforall.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        /* 
        // Math operators -> (+  -  /  * %)
        int number01 = 10;
        int number02 = 20;
        int plus = number02 + number01;
        int minus = number02 - number01;
        int multiplying = number01 * number02;
        int divisionCorrect = number02 / number01;
        int divisonIncorrect = number01 / number02;// division between numbers intereges always show only the part intereger the result
        // if i want a result with decimal point, then one the number should be double or float
        float divisionWithCastingNumber = number01 / (float) number02;
        // if i want change the number before he be used, i can do casting in operation for fix the results between division between two int
        int module = 20 % 2;
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiplying);
        System.out.println(divisionCorrect);
        System.out.println(divisonIncorrect);// in this case should be show 0.5, but that show 0 only
        System.out.println(divisionWithCastingNumber);
        System.out.println(number01 + number02 + "Value " + number01 + number02);
        //String concatenation is done ever(after the first String type put), even though other variables not be a string either
        // (number01 + number02 + "Value " + number01 + number02) here the concatenation are going be done after the string only, before
        // is still stand by the operating should be, in this case plus(or adction)
        System.out.println(module);
        */

        /* 
        // Relational operators -> (  <  >  <=  >=  !=  ==  ) always return a boolean value/type (true or false)
        // one convention when you create a variable boolen it's start with 'is' because the value storaged either true or false
        // You only can compare type that actually are the same type(int with int, float with float, and other)
        // Never compare, for example, if 10 is equal to "10" or 10 is equal to 10.0
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualsThanTwenty = 10 >= 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        boolean isTenEqualsThanTwenty = 10 == 20;
        System.out.println("isTenLowerThanTwenty: " + isTenLowerThanTwenty);
        System.out.println("isTenGreaterThanTwent: " + isTenGreaterThanTwenty);
        System.out.println("isTenLowerOrEqualsThanTwent: " + isTenLowerOrEqualsThanTwenty);
        System.out.println("isTenGreaterOrEqualsThanTwent: " + isTenGreaterOrEqualsThanTwenty);
        System.out.println("isTenDifferentThanTwent: " + isTenDifferentThanTwenty);
        System.out.println("isTenEqualsThanTwent: " + isTenEqualsThanTwenty);
        */


        /*
        // Logical operators -> (&& -> AND    || -> OR    ! -> NOT) Keep in mind the truth table
        int age = 29;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612F; // AND
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381F; // AND
        System.out.println("isLegalOlderThanThirty: " + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty: " + isLegalYoungerThanThirty);

        double currentAccount = 299D;
        double savingsAccount = 3000D;
        float playstationFivePrice = 500F;
        boolean canBeBought = (currentAccount >= playstationFivePrice) || (savingsAccount >= playstationFivePrice); // OR
        System.out.println("PlayStationFive can be bought: " + canBeBought);
        */
        
        /*
        // Assignment operators -> ( =  +=  -=  *=  /=  %= ) Used for avoid some codding and improving readability
        double bonus = 2000D;
        bonus += 1000D; // assign a new value in the space of the memory already occuped this way, not declaring again the type of the variable
        bonus -= 1000D; // bonus = bonus - 1000
        bonus *= 2; // bonus = bonus * 2
        bonus /= 2; // bonus = bonus / 2
        bonus %= 2; // bonus = bonus % 2
        System.out.println("My Bonus is $" + bonus);
        */
        

        /*
        // Unary operator (++ -> same thing += but plus one by one         -- same thing -= but diminishing one by one)
        // ++ is a shortcurt to increase one in one variable
        // -- is a shortcurt to increase one in one variable
        int count = 10;
        count++; // When i put the sinal after the variable i say to Java first do whatever you have to do(complete the expression or whatever) and after increase
        System.out.println(count);// 11
        count--;// When i put the sinal after the variable i say to Java first do whatever you have to do(complete the expression or whatever) and after decrease
        System.out.println(count);// 10
        ++count; // when i put the sinal before the variable i say to Java first increase by one and after do whatever you have to do
        System.out.println(count);// 11
        --count; // when i put the sinal before the variable i say to Java first decrease by one and after do whatever you have to do
        System.out.println(count++);// only after the expression by complete the values is increase, then the value here is 10
        System.out.println(count);// and here he is 11
        System.out.println(count--);// only after the expression by complete the values is increase, then the value here is 11
        System.out.println(count);// and here he is 10
        */
    }
}
