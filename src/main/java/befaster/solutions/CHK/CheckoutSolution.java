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
                    case 'J':
                        basket.merge(Sku.J, 1, Integer::sum);
                        break;
                    case 'K':
                        basket.merge(Sku.K, 1, Integer::sum);
                        break;
                    case 'L':
                        basket.merge(Sku.L, 1, Integer::sum);
                        break;
                    case 'M':
                        basket.merge(Sku.M, 1, Integer::sum);
                        break;
                    case 'N':
                        basket.merge(Sku.N, 1, Integer::sum);
                        break;
                    case 'O':
                        basket.merge(Sku.O, 1, Integer::sum);
                        break;
                    case 'P':
                        basket.merge(Sku.P, 1, Integer::sum);
                        break;
                    case 'Q':
                        basket.merge(Sku.Q, 1, Integer::sum);
                        break;
                    case 'R':
                        basket.merge(Sku.R, 1, Integer::sum);
                        break;
                    case 'S':
                        basket.merge(Sku.S, 1, Integer::sum);
                        break;
                    case 'T':
                        basket.merge(Sku.T, 1, Integer::sum);
                        break;
                    case 'U':
                        basket.merge(Sku.U, 1, Integer::sum);
                        break;
                    case 'V':
                        basket.merge(Sku.V, 1, Integer::sum);
                        break;
                    case 'W':
                        basket.merge(Sku.W, 1, Integer::sum);
                        break;
                    case 'X':
                        basket.merge(Sku.X, 1, Integer::sum);
                        break;
                    case 'Y':
                        basket.merge(Sku.Y, 1, Integer::sum);
                        break;
                    case 'Z':
                        basket.merge(Sku.Z, 1, Integer::sum);
                        break;
                }
            }
            return true;
        }
    }

}


