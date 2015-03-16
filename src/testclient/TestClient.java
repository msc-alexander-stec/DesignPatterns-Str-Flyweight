package testclient;

import pkg.flyweight.concr.CoffeeFlavor;
import pkg.flyweight.factory.CoffeeFactory;
import pkg.other.CoffeeContext;

/*
 * http://www.programcreek.com/2013/02/java-design-pattern-flyweight/
 */
public class TestClient {

	// coffee array
	private static CoffeeFlavor[] coffees = new CoffeeFlavor[20];

	// table array
	private static CoffeeContext[] tables = new CoffeeContext[20];
	private static int ordersCount = 0;
	private static CoffeeFactory coffeeFactory;

	public static void takeOrder(String flavorIn, int table) {
		coffees[ordersCount] = coffeeFactory.getCoffeeFlavor(flavorIn);
		tables[ordersCount] = new CoffeeContext(table);
		ordersCount++;
	}

	public static void main(String[] args) {

		System.out.println("Start: Flyweight");

		coffeeFactory = new CoffeeFactory();

		takeOrder("Cappuccino", 2);
		takeOrder("Cappuccino", 2);
		takeOrder("Regular Coffee", 1);
		takeOrder("Regular Coffee", 2);
		takeOrder("Regular Coffee", 3);
		takeOrder("Regular Coffee", 4);
		takeOrder("Cappuccino", 4);
		takeOrder("Cappuccino", 5);
		takeOrder("Regular Coffee", 3);
		takeOrder("Cappuccino", 3);

		for (int i = 0; i < ordersCount; ++i) {
			coffees[i].serveCoffee(tables[i]);
		}

		System.out.println("\nTotal Coffee objects made: "
				+ coffeeFactory.getTotalCoffeeFlavorsMade());

	}

}
