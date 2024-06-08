package befaster.solutions.CHK;

public class ItemPriceCalculator {

    public static int calculateTotalCost(Sku sku, int quantity) {
        int totalCost = 0;
        switch (sku) {
            case A:
                totalCost += ItemPriceCalculator.calculateTotalCostForItemA(quantity);
                break;
            case B:
                totalCost += ItemPriceCalculator.calculateTotalCostForItemB(quantity);
                break;
            case C:
                totalCost += ItemPriceCalculator.calculateTotalCostForItemC(quantity);
                break;
            case D:
                totalCost += ItemPriceCalculator.calculateTotalCostForItemD(quantity);
                break;
            case E:
                totalCost += ItemPriceCalculator.calculateTotalCostForItemE(quantity);
                break;
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




