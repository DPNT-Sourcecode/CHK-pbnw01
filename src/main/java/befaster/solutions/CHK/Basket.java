package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    private Map<Sku, Integer> basket;

    public Basket() {
        basket = new HashMap<Sku, Integer>();
    }

    public Map<Sku, Integer> getBasket() {
        return basket;
    }

}
