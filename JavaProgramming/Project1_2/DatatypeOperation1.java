import java.util.Scanner;

public class DatatypeOperation1 {
    public static void main(String[] args) {
        Scanner stdin= new Scanner(System.in);
        int a= stdin.nextInt();
        int b= stdin.nextInt();
        
        if((b-45)<0) {
        	a-=1;
        	b+=15;
        	if(a<0) {
        		a= 23;
        	}
        }
        else {
        	b-=45;
        }
        System.out.printf("%d %d\n", a, b);
  }
}