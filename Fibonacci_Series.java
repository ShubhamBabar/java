import java.util.Scanner;
class Fibonacci_Series {
    public static void main(String[] args) {
        System.out.println("**Fibonacci Series**");
        int term,a=0,b=1,c,i;
        System.out.print("Enter range of series : ");
        Scanner sc=new Scanner(System.in);
        term=sc.nextInt();
        
        for(i=1;i<=term;i++){
            System.out.print(a+" ");
            c=a+b; 
            a=b;
            b=c;
        }
    }
}
