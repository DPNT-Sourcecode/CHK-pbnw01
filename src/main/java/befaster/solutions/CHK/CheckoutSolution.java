package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        char[] skusArray = skus.toCharArray();
        int numA, numB, numC, numD;
        numA = numB = numC = numD = 0;

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

        int totalCost = 0;

        return -1;
    }

    


}




