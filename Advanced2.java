import java.util.Scanner;
public class Advanced2 {
  public static void printsum(int n ) {
  int sum = 0; 
  int i = 1 ;
  for 
  ( i = 1;  i <=n;  i++) {
  if 
  ( i % 2 != 0 ) {
  sum = sum + i ;
  }
}
System.out.println(sum);
}
 public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    int n = SC.nextInt();
    printsum(n);        
  
}
}
