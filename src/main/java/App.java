import models.Events;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ready to party?");
        boolean programRunning = true;
        while(programRunning) {
            try {
                Events party = new Events();

                System.out.println("Let's plan an event together.  Choose 'party' or 'exit' if you are not ready at this time.");
                String navigationChoice = bufferedReader.readLine();

                if (navigationChoice.equals("party")) {

                    System.out.println("How many guests?");
                    int inputGuests = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("For your food, choose: 'no food', 'hor derves', or 'dinner'");
                    String inputFoodChoice = bufferedReader.readLine().toLowerCase();
                    System.out.println("For your beverages, choose: 'water', 'soda', or 'alcohol'");
                    String inputBeverage = bufferedReader.readLine().toLowerCase();
                    System.out.println("For your entertainment, choose: 'clown', 'dj', or 'live band'");
                    String inputFun = bufferedReader.readLine().toLowerCase();

                    int totalCost = party.costOfEvent(inputGuests, inputFoodChoice, inputBeverage, inputFun);

                    System.out.println("Number of guests: " + inputGuests);
                    System.out.println("Food choice: " + inputFoodChoice);
                    System.out.println("Beverage choice: " + inputBeverage);
                    System.out.println("Entertainment choice: " + inputFun);
                    System.out.println("Your total = $" + totalCost);

                    System.out.println("Want a discount?  If you have a group over 150, enter this coupon code: 'DUD2017'.  If not, try us out with this coupon code: 'CHEAP'.");
                    String couponCode = bufferedReader.readLine().toUpperCase();
                    if (couponCode.equals("DUD2017")) {
                        if (party.toApplyCoupon(inputGuests)) {
                            int afterDiscount = party.costAfterCoupon(inputGuests, inputFoodChoice, inputBeverage, inputFun, couponCode);
                            System.out.println("If coupon applies, here is your total after discount: $" + afterDiscount);
                        } else {
                            System.out.println("Sorry you do not meet our minimum number of guest.");
                        }
                    } else if (couponCode.equals("CHEAP")) {
                        int afterDiscount = party.costAfterCoupon(inputGuests, inputFoodChoice, inputBeverage, inputFun, couponCode);
                        System.out.println("If coupon applies, here is your total after discount: S" + afterDiscount);
                    } else {
                        System.out.println("Sorry, maybe next time.");
                    }

                } else if (navigationChoice.equals("exit")) {
                    System.out.println("Thank you for visiting our site");
                    programRunning = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}