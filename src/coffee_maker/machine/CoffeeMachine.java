package coffee_maker.machine;

import coffee_maker.drinks.Drink;
import coffee_maker.drinks.Espresso;
import coffee_maker.drinks.Cappuccino;
import coffee_maker.drinks.Latte;
import coffee_maker.menu.CoffeeMenu;

public class CoffeeMachine {
    private Drink drink;

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void makeDrink() {
        drink.make();
    }

    public void chooseDrink() {
        int choice = CoffeeMenu.showMenuAndGetChoice();
        switch (choice) {
            case 1 -> setDrink(new Espresso());
            case 2 -> setDrink(new Cappuccino());
            case 3 -> setDrink(new Latte());
        }
    }
}
