import java.util.*;
public class Advanced7 {
    public static void main(String[] args) {
        int positive = 0 , negative = 0 , zero= 0 ;
        Scanner SC = new Scanner(System.in); 
        int number;
        do {
        System.out.println(" plz enter a number 1 to start and 0 to stop");
         number = SC.nextInt();
            if 
            (number > 0) {
                positive++;
            }
            else if 
            ( number < 0) {
                negative++;
            }
            else 
               {zero++; }
         } while (number !=0);
         System.out.println(" Positive number :" + positive);
     System.out.println(" negative number :" + negative ); 
   System.out.println(" zero " + zero);
}

    
}