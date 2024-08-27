package content;

public class Class05ConditionalStatements02 {
    // this is Class level Scope
    public static void main(String[] args) {
        // This is Method level Scope
        // When we initialazy variable in method level scope(local variables), these variable must be initialized before you try to use them
        // age < 15 category junior
        // age >= 15 && age < 18 category senior
        // age >= 18 category masters
        int age = 12;
        String category;
        if (age < 15) {
            category = "This category is junior";
        }
        else if (age > 15 && age < 18) {
            category = "This category is senior";
        } 
        else{
            category = "This category is masters";
        }
        // Never do this , because it's more than complicated for readability
        category = age < 15 ? "This category is junior" : age > 15 && age < 18 ? "This category is senior" : "This category is masters";
        System.out.println(category);
    }

}
