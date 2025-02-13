
import java.sql.SQLOutput;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        boolean hasEnoughMoney = false;
        boolean isBroke = true;
        int money = 0;
        System.out.println("How much your car costs?");
        int carCost = sca.nextInt();

        while (!hasEnoughMoney) {
            System.out.println("Enter your earnings:");
            int earnings = sca.nextInt();
            System.out.println("You have earned: $" + earnings);
            money = money + earnings;
            System.out.println("You have: $" + money);

            if (money >= 10000) {
                hasEnoughMoney = true;
                System.out.println("Congrats on your new CAR!!");
            }
        }

    }
}
