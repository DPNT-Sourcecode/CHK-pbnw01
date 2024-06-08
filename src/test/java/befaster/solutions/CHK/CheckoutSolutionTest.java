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
    void testAThenBIndividually() {
        String skus = "A";
        Integer expectedCost = 50;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
        String skus2 = "B";
        Integer expectedCost2 = 30;
        assertEquals(expectedCost2, checkoutSolution.checkout(skus2), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidItemsNoSpecialOffers() {
        String skus = "ABCD";
        Integer expectedCost = 115;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidItemsWithSpecialOffersForA1() {
        String skus = "AAABCD";
        Integer expectedCost = 195;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidItemsWithSpecialOffersForA2() {
        String skus = "AAAAABCD";
        Integer expectedCost = 265;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidItemsWithSpecialOffersForB() {
        String skus = "ABBBBBCCDD";
        Integer expectedCost = 240;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidItemsWithSpecialOffersForE() {
        String skus = "ABBCCDDEE";
        Integer expectedCost = 230;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidItemsAndAllOffers() {
        String skus = "AAAAABBBCDEE";
        Integer expectedCost = 360;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithLotsOfItems() {
        String skus = "ABCDECBAABCABBAAAEEAA";
        Integer expectedCost = 665;
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
