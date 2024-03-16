package academy.devdojo.javaoneforall.dataEstructuresAndAlgorithms;

public class StringPalindrome {
    public static void main(String[] args) {
        String word = "madam";
        StringPalindrome stringPalindrome = new StringPalindrome();
        System.out.println(word + " is palindrome? " + stringPalindrome.isPalindrome(word));
        
    }

    public boolean isPalindrome(String word){
        char[] chars = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while(start < end){
            if(chars[start++] != chars[end--]){
                return false;
            }
        }
        return true;
    }
}
