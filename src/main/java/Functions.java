import java.util.Scanner;

public class Functions {
    public int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Functions functions=new Functions();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int x=functions.factorial(n);
        System.out.println(x);

    }
}
