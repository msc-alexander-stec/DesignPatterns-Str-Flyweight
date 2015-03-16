package pkg.flyweight.concr;

import pkg.flyweight.abstr.CoffeeOrder;
import pkg.other.CoffeeContext;

public class CoffeeFlavor implements CoffeeOrder {

	private final String flavor;
	 
	//
	// Constructor
	//
	
    public CoffeeFlavor(String newFlavor) {
        this.flavor = newFlavor;
        System.out.println("Coffee is created! - " + flavor);
    }
 
    //
    //
    //
    
    public String getFlavor() {
        return this.flavor;
    }
 
    public void serveCoffee(CoffeeContext context) {
        System.out.println("Serving " + flavor + " to table " + context.getTable());
    }

}
