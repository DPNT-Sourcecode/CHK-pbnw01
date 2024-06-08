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
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case H:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case I:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case J:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case K:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case L:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case M:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case N:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case O:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case P:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case Q:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case R:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case S:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case T:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case U:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case V:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case W:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case X:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case Y:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
                    break;
                case Z:
                    totalCost += ItemPriceCalculator.calculateTotalCostForItemF(basket.get(key).intValue());
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
        while (quantity > 0) {
            if 
        } else if(quantity >= 3) {
                costForItems += 80;
                quantity -= 3;
            } else {
                costForItems += 30;
                quantity--;
            }
        }
        return costForItems;
    }

    private static int calculateTotalCostForItemR(int quantity) {
        int costForItems = 0;
        while (quantity > 0) {
            if (quantity >= 3) {
                costForItems += 80;
                quantity -= 3;
            } else {
                costForItems += 30;
                quantity--;
            }
        }
        return costForItems;
    } 

}





