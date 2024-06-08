package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        char[] skusArray = skus.toCharArray();
        int numA, numB, numC, numD;
        numA = numB = numC = numD = 0;

        // Check all items in the "skus" String are valid
        for (int i = 0; i < skusArray.length; i++) {
            if (skusArray[i] < 'A' || skusArray[i] > 'D') {
                // Error - invalid item
                return -1;
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

}
