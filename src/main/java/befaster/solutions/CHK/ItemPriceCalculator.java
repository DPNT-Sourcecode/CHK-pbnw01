package befaster.solutions.CHK;

public class ItemPriceCalculator {

    public static int calculateTotalCost(Sku sku, int quantity) {
        int totalCost = 0;
        switch (sku) {
            case Sku.A:

            case Sku.B:
            case Sku.C:
            case Sku.D:
            case Sku.E:

        }
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

    private static int calculateTotalCostForItemB(int quantity) {
        
        int costForItems = 0;

        while (quantity > 0) {
            if (quantity >= 2) {
                costForItems += 45;
                quantity -= 2;
            } else {
                costForItems += 30;
                quantity--;
            }
        }

        return costForItems;
    }

    private static int calculateTotalCostForItemC(int quantity) {
        return quantity * 
    }



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

}


