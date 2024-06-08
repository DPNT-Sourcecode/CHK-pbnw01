package befaster.solutions.CHK;

import java.util.Map;

public class ItemPriceCalculator {

    public static int calculateTotalCost(Map<Sku, Integer> basket) {
        int totalCost = 0;
        for (Sku key : basket.keySet()) {
            switch (key) {
                case A:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemA(basket.get(key).intValue());
                    break;
                case B:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemB(basket.get(key).intValue(), basket.get(Sku.E).intValue());
                    break;
                case C:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemC(basket.get(key).intValue());
                    break;
                case D:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemD(basket.get(key).intValue());
                    break;
                case E:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemE(basket.get(key).intValue());
                    break;
            }        
        }
        return totalCost;
    }

    private static int calculateTotalCostForItemA(int quantity) {
        int costForItems = 0;
        while (quantity > 0) {
            if (quantity >= 5) {
                costForItems += 200;
                quantity -= 5;
            } else if (quantity >= 3) {
                costForItems += 130;
                quantity -= 3;
            } else {
                costForItems += 50;
                quantity--;
            }
        }
        return costForItems;
    }

    private static int calculateTotalCostForItemB(int quantityOfB, int quantityOfE) {
        int costForItems = 0;
        while (quantityOfB > 0) {
            if (quantityOfE >= 2) {
                quantityOfB--;
            } else if (quantityOfB >= 2) {
                costForItems += 45;
                quantityOfB -= 2;
            } else {
                costForItems += 30;
                quantityOfB--;
            }
        }
        return costForItems;
    }

    private static int calculateTotalCostForItemC(int quantity) {
        return quantity * 20;
    }

    private static int calculateTotalCostForItemD(int quantity) {
        return quantity * 15;
    }

    private static int calculateTotalCostForItemE(int quantity) {
        return quantity * 40;
    }

}






