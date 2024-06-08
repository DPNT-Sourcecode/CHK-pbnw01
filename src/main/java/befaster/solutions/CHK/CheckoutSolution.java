package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    Map<Sku, Integer> basket;
    final char MIN_ITEM_CHAR = 'A';
    final char MAX_ITEM_CHAR = 'E';

    public CheckoutSolution() {
        basket = new HashMap<Sku, Integer>();
    }

    public Integer checkout(String skus) {
        char[] skusArray = skus.toCharArray();
        

        // Calculate the totalCost (taking into account special offers)
        int totalCost = 0;

        while (numA > 0) {
            if (numA >= 3) {
                totalCost += 130;
                numA -= 3;
            } else {
                totalCost += 50;
                numA--;
            }
        }

        while (numB > 0) {
            if (numB >= 2) {
                totalCost += 45;
                numB -= 2;
            } else {
                totalCost += 30;
                numB--;
            }
        }

        totalCost += (numC * 20);
        totalCost += (numD * 15);

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
                    numB++;
                    break;
                case 'C':
                    basket.merge(Sku.A, 1, Integer::sum);
                    numC++;
                    break;
                case 'D':
                    basket.merge(Sku.A, 1, Integer::sum);
                    numD++;
                    break;
                case 'E':
                    basket.merge(Sku.A, 1, Integer::sum);

            }
        }

        return true;
    }

}
