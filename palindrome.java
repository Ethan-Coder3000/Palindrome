import java.util.Scanner;

public class palindrome{
    private static boolean isString(String a){
        for (int i=0;i<a.length();i++){
            if(Character.isDigit(a.charAt(i))==true){
                return false;
            }
        }
        return true;
    }
    private static String reverseString(String input){
        String reverse = "";
        for (int i=input.length()-1;i>=0;i--){
            reverse = reverse + input.charAt(i);
        }
        return reverse;
    }
    private void isStringPlaindrome(String userInput, String reverse) {
        if(userInput.equals(reverse)){
            System.out.println(userInput+" is a Palindrome ");
        }else{
            System.out.println(userInput+" is a not Palindrome ");
        }
    }


    public void run(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a string to test if it is a Palindrome :");
        String input = keyboard.next(); 
        if(isString(input)){
            isStringPlaindrome(input,reverseString(input));
        }else{
            System.out.println("You did not enter a valid string!");
        }

    }
    public static void main(String[] args)
    {
        palindrome obj = new palindrome();
        obj.run();
    }
}
