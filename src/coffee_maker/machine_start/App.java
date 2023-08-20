package coffee_maker.machine_start;

import coffee_maker.machine.CoffeeMachine;

public class App {
    public static void main(String[] args) {
        CoffeeMachine customer = new CoffeeMachine();
        customer.chooseDrink();
        customer.makeDrink();
    }
}
