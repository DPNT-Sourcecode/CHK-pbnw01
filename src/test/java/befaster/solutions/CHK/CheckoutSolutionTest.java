package befaster.solutions.CHK;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CheckoutSolutionTest {

    private CheckoutSolution checkoutSolution;

    @Test
    void testCheckoutWithValidItemsNoSpecialOffers() {
        checkoutSolution = new CheckoutSolution();
        String skus = "ABCD";
        Integer expectedCost = 115;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidItemsWithSpecialOffersForA() {
        checkoutSolution = new CheckoutSolution();
        String skus = "AAABCD";
        Integer expectedCost = 195;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidItemsWithSpecialOffersForB() {
        checkoutSolution = new CheckoutSolution();
        String skus = "ABBBBBCCDD";
        Integer expectedCost = 115;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }
}
