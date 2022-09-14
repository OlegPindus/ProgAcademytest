import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is Bitcoin price today?");
        double price = sc.nextInt();
        System.out.println("How much $ do you have?");
        double $ = sc.nextInt();
        double bit = $ / price;
        System.out.println("You can buy " +(bit) );
    }
}
