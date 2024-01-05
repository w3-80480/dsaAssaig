package Assignment1;
import java.util.Scanner;

/**
 * palindrom
 */

 

public class Assig1_1 {

// 1) using iterative method;

   /*  public static boolean ispalindrome(String str){
        int left=0;
        int right= str.length()-1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;   
            }
            left++;
            right--;
        }
        return true;
    }  */


// 2) using string Builder;

    public static boolean ispalindrome(String str){

        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
        

    }


    public static void main(String[] args) {
       // System.out.println("hello");

       Scanner sc = new Scanner(System.in);
       System.out.println("enter string to cheaked :");
       String name= sc.nextLine();

       if (ispalindrome(name)) {
            System.out.println(name + "is palindrome");
       }
       else {
            System.out.println(name + " is not palindrome");
       }
       sc.close();


    }
}