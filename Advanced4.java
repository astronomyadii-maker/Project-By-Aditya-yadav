import java.util.*;
public class Advanced4 {
    public static Double Circum(Double r) {
     return  2*3.14*r;
}

public static void main (String args[]) {
Scanner SC = new Scanner(System.in); 
    Double r = SC.nextDouble();
    System.out.println(Circum(r));

}
} 