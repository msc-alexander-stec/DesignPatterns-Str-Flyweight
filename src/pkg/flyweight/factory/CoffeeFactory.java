package pkg.flyweight.factory;

import java.util.HashMap;

import pkg.flyweight.concr.CoffeeFlavor;

public class CoffeeFactory {

	// Store <Key = Name, Value = CoffeeImpl Object>
	private HashMap<String, CoffeeFlavor> flavors = new HashMap<String, CoffeeFlavor>();

	//
    public CoffeeFlavor getCoffeeFlavor(String flavorName) {
        CoffeeFlavor flavor = flavors.get(flavorName);
        if (flavor == null) {
            flavor = new CoffeeFlavor(flavorName);
            flavors.put(flavorName, flavor);
        }
        return flavor;
    }
 
    public int getTotalCoffeeFlavorsMade() {
        return flavors.size();
    }
}
