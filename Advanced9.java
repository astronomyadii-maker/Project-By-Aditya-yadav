import java.lang.classfile.instruction.StackInstruction;
import java.util.*; 
public class Advanced9 {
    public static int gcd (int a , int b) {
    while ( b != 0) {
        int temp = b;
    b = a % b;
    a = temp;
    }
    return a;  }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
     System.out.println("plz enter the first no.");
    int nub1 = SC.nextInt();
     System.out.println("Plz enter the second no.");
    
    int nub2 = SC.nextInt();
    int result =  gcd(nub1, nub2);

 System.out.println(" gcd of num1 :" + nub1 + " and " + nub2 + " is" + result );
    
}
}