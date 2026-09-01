import java.util.*;
public class Advanced3 {

    

public static int printgreater(int a , int b ) {
    if ( a > b ) {
        return  a;
    } else  {
        return  b;
    }
}
    public static void main ( String [] args) {
    Scanner SC = new Scanner(System.in);
    int a = SC.nextInt();
    int b = SC.nextInt();
    System.out.println(printgreater(a ,b ));

 
}
}
