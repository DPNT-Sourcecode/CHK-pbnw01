package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    // Variables
    Map<Sku, Integer> basket;
    int totalCost;

    // Constants
    final char MIN_ITEM_CHAR = 'A';
    final char MAX_ITEM_CHAR = 'E';

    public CheckoutSolution() {
        basket = new HashMap<Sku, Integer>();
        totalCost = 0;
    }

    public Integer checkout(String skus) {
        char[] skusArray = skus.toCharArray();

        if (!addItemsToBasket(skusArray)) {
            // Error - invalid sku in String
            return Integer.valueOf(-1);
        }


        

        // Calculate the totalCost (taking into account special offers)
        int totalCost = 0;

        

        return Integer.valueOf(totalCost);
    }

    // Returns true if all items are valid; false otherwise
    private boolean addItemsToBasket(char[] skusArray) {

        for (int i = 0; i < skusArray.length; i++) {
            if (skusArray[i] < MIN_ITEM_CHAR || skusArray[i] > MAX_ITEM_CHAR) {
                // Error - invalid item
                return false;
            }
            switch (skusArray[i]) {
                case 'A':
                    basket.merge(Sku.A, 1, Integer::sum);
                    break;
                case 'B':
                    basket.merge(Sku.A, 1, Integer::sum);
                    break;
                case 'C':
                    basket.merge(Sku.A, 1, Integer::sum);
                    break;
                case 'D':
                    basket.merge(Sku.A, 1, Integer::sum);
                    break;
                case 'E':
                    basket.merge(Sku.A, 1, Integer::sum);
                    break;
            }
        }
        return true;
    }

}


