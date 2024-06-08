package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    private Map<Sku, Integer> basket;
    private int totalCost;

    public Basket() {
        basket = new HashMap<Sku, Integer>();
        totalCost = 0;
    }

    public Map<Sku, Integer> getBasket() {
        return basket;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public int calculateTotalCost() {
        return -1;
    }

    


}
