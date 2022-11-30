package example;

import example.context.Context;
import example.strategies.ChristmasDiscount;
import example.strategies.EasterDiscount;
import example.strategies.NewYearDiscount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //Instantiating context and strategies
    static Context context = new Context();

    static EasterDiscount easterDiscount = new EasterDiscount();
    static NewYearDiscount newYearDiscount = new NewYearDiscount();
    static ChristmasDiscount christmasDiscount = new ChristmasDiscount();

    public static void main(String[] args) throws IOException {

        double amount = 1;
        int strategyId;

        do {
            System.out.println("Select a strategy:");
            System.out.println("(1) - EasterDiscount; 20%");
            System.out.println("(2) - NewYearDiscount; 40%");
            System.out.println("(3) - ChristmasDiscount; 60%");

            strategyId = Integer.parseInt(reader.readLine());

            if(strategyId == 1){
                context.setDiscounter(easterDiscount);
            }
            else if(strategyId == 2){
                context.setDiscounter(newYearDiscount);
            }
            else if(strategyId == 3){
                context.setDiscounter(christmasDiscount);
            }
            else{
                System.out.println("Please enter a valid strategy");
                continue;
            }

            System.out.println("Enter the price of an article");

            amount = Double.parseDouble(reader.readLine());

            System.out.println("Final price is: " + context.getDiscounter().applyDiscount(amount));

        } while(amount != 0 && strategyId != 0);
    }
}