import java.util.Scanner;

public class Assignment1A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Notes twenties=new Notes(20);
        Notes tens=new Notes(10);
        Notes fives=new Notes(5);
        Notes ones=new Notes(1);

        Coins quarters=new Coins(0.25f,0.2f);
        Coins dimes=new Coins(0.10f,0.08f);
        Coins nickels=new Coins(0.05f,0.176f);
        Coins pennies=new Coins(0.01f,0.088f);

        dimes.increaseQuantity(41);
        nickels.increaseQuantity(17);
        pennies.increaseQuantity(132);
        ones.increaseQuantity(33);
        fives.increaseQuantity(12);
        tens.increaseQuantity(2);
        twenties.increaseQuantity(5);

        System.out.println(twenties);
        System.out.println(tens);
        System.out.println(fives);
        System.out.println(ones);

        System.out.println(quarters);
        System.out.println(dimes);
        System.out.println(nickels);
        System.out.println(pennies);

        float coinTotalValue = dimes.getTotalValue() + quarters.getTotalValue() + nickels.getTotalValue() + pennies.getTotalValue();
        float notesTotalValue = twenties.getTotalValue() + tens.getTotalValue() + fives.getTotalValue() + ones.getTotalValue();

        double coinWeight = dimes.getTotalWeight() + quarters.getTotalWeight() + nickels.getTotalWeight() + pennies.getTotalWeight();

        System.out.println("Total money is " + (coinTotalValue + notesTotalValue) + " total weight is " + coinWeight  + "oz");

        System.out.println("How much do you need?");
        float needed = sc.nextFloat();
        sc.nextLine();


        while(needed >= 20 && twenties.getQuantityOnHand() > 0){
            if(twenties.getQuantityOnHand() > 0){
                needed = needed - 20;
                twenties.decreaseQuantity(1);
                System.out.println("Give them a 20 dollar bill");
            }
        }
        while(needed >= 10 && tens.getQuantityOnHand() > 0){
            if(tens.getQuantityOnHand() > 0){
                needed = needed - 10;
                tens.decreaseQuantity(1);
                System.out.println("Give them a 10 dollar bill");;
            }
        }
        while(needed >= 5 && fives.getQuantityOnHand() > 0){
            if(fives.getQuantityOnHand() > 0){
                needed = needed - 5;
                fives.decreaseQuantity(1);
                System.out.println("Give them a 5 dollar bill");;
            }
        }
        while(needed >= 1 && ones.getQuantityOnHand() > 0){
            if(ones.getQuantityOnHand() > 0){
                needed = needed - 1;
                ones.decreaseQuantity(1);
                System.out.println("Give them a 1 dollar bill");;
            }
        }

        while(needed >= 0.25 && quarters.getQuantityOnHand() > 0){
            if(quarters.getQuantityOnHand() > 0) {
                needed = needed - .25f;
                quarters.decreaseQuantity(1);
                System.out.println("Give them a quarter");
            }
        }
        while(needed >= .10 && dimes.getQuantityOnHand() > 0){
            if(dimes.getQuantityOnHand() > 0){
                needed = needed - .10f;
                dimes.decreaseQuantity(1);
                System.out.println("Give them a dime");
            }
        }
        while(needed >= .05 && nickels.getQuantityOnHand() > 0){
            if(nickels.getQuantityOnHand() > 0){
                needed = needed - .05f;
                nickels.decreaseQuantity(1);
                System.out.println("Give them a nickel");
            }
        }
        while(needed >= .01 && pennies.getQuantityOnHand() > 0){
            if(pennies.getQuantityOnHand() > 0){
                needed = needed - .01f;
                pennies.decreaseQuantity(1);
                System.out.println("Give them a penny");
            }
        }

        if(needed >= .01){
            System.out.println("I don't have enough money, I still owe you " + needed);
        }

        coinTotalValue = dimes.getTotalValue() + quarters.getTotalValue() + nickels.getTotalValue() + pennies.getTotalValue();
        notesTotalValue = twenties.getTotalValue() + tens.getTotalValue() + fives.getTotalValue() + ones.getTotalValue();

        coinWeight = dimes.getTotalWeight() + quarters.getTotalWeight() + nickels.getTotalWeight() + pennies.getTotalWeight();

        System.out.println("Total money is " + (coinTotalValue + notesTotalValue) + " total weight is " + coinWeight  + "oz");
    }
}
