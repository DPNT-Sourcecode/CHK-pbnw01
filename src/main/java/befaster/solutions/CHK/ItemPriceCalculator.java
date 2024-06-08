package befaster.solutions.CHK;

import java.util.Map;

// TODO - the calculateTotalCostForItem? logic could be refactored using a few methods to prevent the repeated patterns of while loops
//        e.g. numberOfItemForPrice(args) and buyNumberGetOneFree(args)
//        But because this is a timed test, I'm going to leave the while loops as they are
public class ItemPriceCalculator {

    public static int calculateTotalCost(Map<Sku, Integer> basket) {
        int totalCost = 0;
        for (Sku key : basket.keySet()) {
            switch (key) {
                case A:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemA(basket.get(key).intValue());
                    break;
                case B:
                    Integer quantityOfE = basket.get(Sku.E);
                    int intQuantityOfE = (quantityOfE == null) ? 0 : quantityOfE.intValue(); 
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemB(basket.get(key).intValue(), intQuantityOfE);
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
                case F:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case G:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemG(basket.get(key).intValue());
                    break;
                case H:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemH(basket.get(key).intValue());
                    break;
                case I:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemI(basket.get(key).intValue());
                    break;
                case J:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemJ(basket.get(key).intValue());
                    break;
                case K:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemK(basket.get(key).intValue());
                    break;
                case L:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemL(basket.get(key).intValue());
                    break;
                case M:
                    Integer quantityOfN = basket.get(Sku.N);
                    int intQuantityOfN = (quantityOfN == null) ? 0 : quantityOfN.intValue(); 
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemM(basket.get(key).intValue(), intQuantityOfN);
                    break;
                case N:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemN(basket.get(key).intValue());
                    break;
                case O:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemO(basket.get(key).intValue());
                    break;
                case P:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemP(basket.get(key).intValue());
                    break;
                case Q:
                    Integer quantityOfR = basket.get(Sku.R);
                    int intQuantityOfR = (quantityOfR == null) ? 0 : quantityOfR.intValue(); 
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemQ(basket.get(key).intValue(), intQuantityOfR);
                    break;
                case R:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemR(basket.get(key).intValue());
                    break;
                case S:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemS(basket.get(key).intValue());
                    break;
                case T:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemT(basket.get(key).intValue());
                    break;
                case U:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemU(basket.get(key).intValue());
                    break;
                case V:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemV(basket.get(key).intValue());
                    break;
                case W:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemW(basket.get(key).intValue());
                    break;
                case X:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemX(basket.get(key).intValue());
                    break;
                case Y:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemY(basket.get(key).intValue());
                    break;
                case Z:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemZ(basket.get(key).intValue());
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
                quantityOfE -= 2;
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

    private static int calculateTotalCostForItemF(int quantity) {
        int costForItems = 0;
        while (quantity > 0) {
            if (quantity >= 3) {
                costForItems += 20;
                quantity -= 3;
            } else {
                costForItems += 10;
                quantity--;
            }
        }
        return costForItems;
    }

    private static int calculateTotalCostForItemG(int quantity) {
        return quantity * 20;
    }

    private static int calculateTotalCostForItemH(int quantity) {
        int costForItems = 0;
        while (quantity > 0) {
            if (quantity >= 10) {
                costForItems += 80;
                quantity -= 10;
            } else if (quantity >= 5) {
                costForItems += 45;
                quantity -= 5;
            } else {
                costForItems += 10;
                quantity--;
            }
        }
        return costForItems;
    }

    private static int calculateTotalCostForItemI(int quantity) {
        return quantity * 35;
    }

    private static int calculateTotalCostForItemJ(int quantity) {
        return quantity * 60;
    }

    private static int calculateTotalCostForItemK(int quantity) {
        int costForItems = 0;
        while (quantity > 0) {
            if (quantity >= 2) {
                costForItems += 150;
                quantity -= 2;
            } else {
                costForItems += 80;
                quantity--;
            }
        }
        return costForItems;
    }

    private static int calculateTotalCostForItemL(int quantity) {
        return quantity * 90;
    }

    private static int calculateTotalCostForItemM(int quantityOfM, int quantityOfN) {
        int costForItems = 0;
        while (quantityOfM > 0) {
            if (quantityOfN >= 3) {
                quantityOfN -= 3;
                quantityOfM--;
            } else {
                costForItems += 15;
                quantityOfM--;
            }
        }
        return costForItems;
    }

    private static int calculateTotalCostForItemN(int quantity) {
        return quantity * 40;
    }

    private static int calculateTotalCostForItemO(int quantity) {
        return quantity * 10;
    }

    private static int calculateTotalCostForItemP(int quantity) {
        int costForItems = 0;
        while (quantity > 0) {
            if (quantity >= 5) {
                costForItems += 200;
                quantity -= 5;
            } else {
                costForItems += 50;
                quantity--;
            }
        }
        return costForItems;
    }

    private static int calculateTotalCostForItemQ(int quantityOfQ, int quantityOfR) {
        int costForItems = 0;
        while (quantityOfQ > 0) {
            if (quantityOfR >= 3) {
                quantityOfR -= 3;
                quantityOfQ--;
            } else if (quantityOfQ >= 3) {
                costForItems += 80;
                quantityOfQ -= 3;
            } else {
                costForItems += 30;
                quantityOfQ--;
            }
        }
        return costForItems;
    }

    private static int calculateTotalCostForItemR(int quantity) {
        return quantity * 50;
    }

    private static int calculateTotalCostForItemS(int quantity) {
        return quantity * 30;
    }

    private static int calculateTotalCostForItemT(int quantity) {
        return quantity * 20;
    }

    private static int calculateTotalCostForItemU(int quantity) {
        int costForItems = 0;
        while (quantity > 0) {
            if (quantity >= 4) {
                costForItems += 120;
                quantity -= 4;
            } else {
                costForItems += 40;
                quantity--;
            }
        }
        return costForItems;
    }

    private static int calculateTotalCostForItemV(int quantity) {
        int costForItems = 0;
        while (quantity > 0) {
            if (quantity >= 3) {
                costForItems += 130;
                quantity -= 3;
            } else if (quantity >= 2) {
                costForItems += 90;
                quantity -= 2;
            } else {
                costForItems += 50;
                quantity--;
            }
        }
        return costForItems;
    }

    private static int calculateTotalCostForItemW(int quantity) {
        return quantity * 20;
    }

    private static int calculateTotalCostForItemX(int quantity) {
        return quantity * 90;
    }

    private static int calculateTotalCostForItemY(int quantity) {
        return quantity * 10;
    }

    private static int calculateTotalCostForItemZ(int quantity) {
        return quantity * 50;
    }

}




