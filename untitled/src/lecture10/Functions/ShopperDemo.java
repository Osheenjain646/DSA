package lecture10.Functions;

// Made with return type function to return the value of remaining money

public class ShopperDemo {

    public static int Shopping(String item1, String item2, int money){
        int item1_cost=25;
        int item2_cost=68;
        System.out.println("Bringing " + item1 + " and " + item2);
        System.out.println("Total money used = " + (item1_cost+item2_cost));
        return money - item1_cost -item2_cost;
    }

    public static void main(String[] args) {
        int money = 100;
        int remaining_money=Shopping("Aplles" ,"Oranges" , money);
        System.out.println("Remaining money = " + remaining_money);
    }
}
