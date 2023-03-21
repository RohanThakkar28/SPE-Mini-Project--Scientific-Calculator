import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Functions {
    public static final Logger logger = LogManager.getLogger(Functions.class);
    public static  int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static double power(double base, double exp) {
        double result = Math.pow(base, exp);
        return result;
    }

    public static double loge(double x) {
        if (x<=0) throw new IllegalArgumentException("log cannot take 0 or negative values");
        double result = Math.log(x);
        return result;
    }

    public static double sqroot(double x) {
        if (x<0) throw new IllegalArgumentException("sqroot cannot take negative values");
        double result = Math.sqrt(x);
        return result;
    }

    public static void main(String[] args) {
        while(true){
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice){
                case 0:
                    System.out.println("terminating application...");
                    return;
                case 1:
                    System.out.println("Enter an integer");
                    int n = sc.nextInt();
                    logger.info("[FACTORIAL] - " + n);
                    try {
                        int fact = Functions.factorial(n);
                        logger.info("[RESULT - FACTORIAL] - " + fact);
                        System.out.println(fact);
                    }
                    catch (Exception factException) {
                        System.out.println(factException.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter base and exponent");
                    double b = sc.nextDouble();
                    double e = sc.nextDouble();
                    logger.info("[POWER - " + b + " RAISED TO] " + e);
                    try {
                        double power = Functions.power(b, e);
                        logger.info("[RESULT - POWER] - " + power);
                        System.out.println(power);
                    }
                    catch (Exception powException) {
                        System.out.println(powException.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Enter a positive value");
                    double l = sc.nextDouble();
                    logger.info("[NATURAL LOG] - " + l);
                    try {
                        double logval = Functions.loge(l);
                        logger.info("[RESULT - NATURAL LOG] - " + logval);
                        System.out.println(logval);
                    }
                    catch (Exception logException) {
                        System.out.println(logException.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Enter a positive value");
                    double s = sc.nextDouble();
                    logger.info("[SQ ROOT] - " + s);
                    try {
                        double rootval = Functions.sqroot(s);
                        logger.info("[RESULT - SQ ROOT] - " + rootval);
                        System.out.println(rootval);
                    }
                    catch (Exception rootException) {
                        System.out.println(rootException.getMessage());
                    }
                    break;
                default:
                    System.out.println("Enter a valid choice");


            }

        }

    }
}
