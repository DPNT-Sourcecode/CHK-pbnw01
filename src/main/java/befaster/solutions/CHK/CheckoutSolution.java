package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    public Integer checkout(String skus) {
        Checkout checkout = new Checkout();
        return checkout.calculateTotalCost(skus);
    }

    public class Checkout {

        // Variables
        Map<Sku, Integer> basket;
        int totalCost;

        // Constants
        final char MIN_ITEM_CHAR = 'A';
        final char MAX_ITEM_CHAR = 'Z';

        public Checkout() {
            basket = new HashMap<Sku, Integer>();
            totalCost = 0;
        }

        public Integer calculateTotalCost(String skus) {
            char[] skusArray = skus.toCharArray();
    
            if (!addItemsToBasket(skusArray)) {
                // Error - invalid sku in String
                return Integer.valueOf(-1);
            }
    
            // Calculate the totalCost (taking into account special offers)
            int totalCost = ItemPriceCalculator.calculateTotalCost(basket);
    
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
                        basket.merge(Sku.B, 1, Integer::sum);
                        break;
                    case 'C':
                        basket.merge(Sku.C, 1, Integer::sum);
                        break;
                    case 'D':
                        basket.merge(Sku.D, 1, Integer::sum);
                        break;
                    case 'E':
                        basket.merge(Sku.E, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'G':
                        basket.merge(Sku.G, 1, Integer::sum);
                        break;
                    case 'H':
                        basket.merge(Sku.H, 1, Integer::sum);
                        break;
                    case 'I':
                        basket.merge(Sku.I, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                    case 'F':
                        basket.merge(Sku.F, 1, Integer::sum);
                        break;
                }
            }
            return true;
        }
    }

}

