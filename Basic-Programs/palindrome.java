
import java.util.Scanner;

/**
 *
 * @author Vidhikara
 */
public class palindrome {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = input.nextLine();
           
     String rev="";
     for(int i=s.length()-1;i>=0;--i){
         rev=rev+s.charAt(i);
     }
     System.out.println(rev);
     if(rev.equalsIgnoreCase(s)){
         System.out.println("Palindrome");
     }else{
         System.out.println("Not palindrome");
     }
    input.close();
    }
}
