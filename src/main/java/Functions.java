import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Functions {
    public static final Logger logger = LogManager.getLogger(Functions.class);
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
        logger.info("[FACTORIAL] - " + n);
        int x=functions.factorial(n);
        logger.info("[RESULT - FACTORIAL] - " + x);
        System.out.println(x);

    }
}
