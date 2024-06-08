package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    Map<Sku, Integer> basket;

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
            if (skusArray[i] < 'A' || skusArray[i] > 'D') {
                // Error - invalid item
                return Integer.valueOf(-1);
            }
            switch (skusArray[i]) {
                case 'A':
                    numA++;
                    break;
                case 'B':
                    numB++;
                    break;
                case 'C':
                    numC++;
                    break;
                case 'D':
                    numD++;
                    break;
            }
        }

        return true;
    }

}



