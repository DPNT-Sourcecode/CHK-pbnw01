package befaster.solutions.CHK;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CheckoutSolutionTest {

    private CheckoutSolution checkoutSolution;

    @BeforeEach
    void beforeEach() {
        checkoutSolution = new CheckoutSolution();
    }

    @Test
    void testCheckoutWithValidItemsNoSpecialOffers() {
        String skus = "B";
        Integer expectedCost = 30;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidItemsWithSpecialOffersForA() {
        String skus = "AAABCD";
        Integer expectedCost = 195;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidItemsWithSpecialOffersForB() {
        String skus = "ABBBBBCCDD";
        Integer expectedCost = 240;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithInvalidItems1() {
        String skus = "ABCDZ";
        Integer expectedCost = -1;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithInvalidItems2() {
        String skus = "ABCDa";
        Integer expectedCost = -1;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithInvalidItems3() {
        String skus = "125ABCD";
        Integer expectedCost = -1;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }
}


