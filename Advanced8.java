import java.util.*;
public class Advanced8 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println(" enter a value of X  : ");
        int x = SC.nextInt();
        System.out.println("enter the value of n : ");
        int n = SC.nextInt();
        int result = 1;
        int i = 0; 
        for ( i = 0; i < n; i++)
        { result = result * x;

        }
        { System.out.println(" the  value of x to the power of n is : " + result);}



    }
}
