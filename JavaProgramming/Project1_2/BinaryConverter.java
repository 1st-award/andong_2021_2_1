import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
    	Scanner stdin = new Scanner(System.in);
        int num, a=0;
        
        System.out.print("Á¤¼ö: ");
        num= stdin.nextInt();
        System.out.print(num+": ");
        
        if(num/ 512>= 1) {
            System.out.print(1);
            num%= 512;
            a = 1;
        }
        if(num/ 256>= 1) {
            System.out.print(1);
            num%= 256;
            a = 1;
        }
        else{
            if(a==1) {
                System.out.print(0);
            }
        }
        
        if(num/ 128>= 1) {
            System.out.print(1);
            num%= 128;
            a = 1;
        }
        else{
            if(a==1) {
                System.out.print(0);
            }
        }
        
        if(num/ 64>= 1) {
            System.out.print(1);
            num%= 64;
            a = 1;
        }
        else{
            if(a==1) {
                System.out.print(0);
            }
        }
        if(num/ 32>= 1) {
            System.out.print(1);
            num%= 32;
            a = 1;
        }
        else{
            if(a==1) {
                System.out.print(0);
            }
        }
        if(num/ 16>= 1) {
            System.out.print(1);
            num%= 16;
            a = 1;
        }
        else{
            if(a==1) {
                System.out.print(0);
            }
        }
        if(num/ 8>= 1) {
            System.out.print(1);
            num%= 8;
            a = 1;
        }
        else{
            if(a==1) {
                System.out.print(0);
            }
        }
        if(num/ 4>= 1) {
            System.out.print(1);
            num%= 4;
            a = 1;
        }
        else{
            if(a==1) {
                System.out.print(0);
            }
        }
        if(num/ 2>= 1) {
            System.out.print(1);
            num%= 2;
            a = 1;
        }
        else{
            if(a==1) {
                System.out.print(0);
            }
        }
        if(num>= 1) {
            System.out.print(1);
            num%= 1;
        }
        else{
            System.out.print(0);
        }
        
    }
}