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

    // Test individual skus
    @Test
    void testIndividualA() {
        String skus = "A";
        Integer expectedCost = 50;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualB() {
        String skus = "B";
        Integer expectedCost = 30;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualC() {
        String skus = "C";
        Integer expectedCost = 20;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualD() {
        String skus = "D";
        Integer expectedCost = 15;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualE() {
        String skus = "E";
        Integer expectedCost = 40;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualF() {
        String skus = "F";
        Integer expectedCost = 10;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualG() {
        String skus = "G";
        Integer expectedCost = 20;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualH() {
        String skus = "H";
        Integer expectedCost = 10;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualI() {
        String skus = "I";
        Integer expectedCost = 35;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualJ() {
        String skus = "J";
        Integer expectedCost = 60;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualK() {
        String skus = "K";
        Integer expectedCost = 80;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualL() {
        String skus = "L";
        Integer expectedCost = 90;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualM() {
        String skus = "M";
        Integer expectedCost = 15;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualN() {
        String skus = "N";
        Integer expectedCost = 40;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualO() {
        String skus = "O";
        Integer expectedCost = 10;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualP() {
        String skus = "P";
        Integer expectedCost = 50;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualQ() {
        String skus = "Q";
        Integer expectedCost = 30;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualR() {
        String skus = "R";
        Integer expectedCost = 50;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualS() {
        String skus = "S";
        Integer expectedCost = 30;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualT() {
        String skus = "T";
        Integer expectedCost = 20;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualU() {
        String skus = "U";
        Integer expectedCost = 40;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualV() {
        String skus = "V";
        Integer expectedCost = 50;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualW() {
        String skus = "W";
        Integer expectedCost = 20;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualX() {
        String skus = "X";
        Integer expectedCost = 90;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualY() {
        String skus = "Y";
        Integer expectedCost = 10;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testIndividualZ() {
        String skus = "Z";
        Integer expectedCost = 50;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    // Test groups of skus
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
    void testCheckoutWithValidSingleF() {
        String skus = "F";
        Integer expectedCost = 10;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    } 
    
    @Test
    void testCheckoutWithValidThreeFs() {
        String skus = "FFF";
        Integer expectedCost = 20;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    } 

    @Test
    void testCheckoutWithValidSevenFs() {
        String skus = "FFFFFFF";
        Integer expectedCost = 50;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidSevenFsAndThreeAs() {
        String skus = "AAFFFFFFFA";
        Integer expectedCost = 180;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }
    

    @Test
    void testCheckoutWithValidItemsNoSpecialOffers() {
        String skus = "ABCDEF";
        Integer expectedCost = 165;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidItemsWithSpecialOffersForA1() {
        String skus = "AAABCDEF";
        Integer expectedCost = 245;
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
        String skus = "ABBCCDDEEF";
        Integer expectedCost = 225;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithValidItemsAndAllOffers() {
        String skus = "AAAAABBBCDEEFFFFFFFFF";
        Integer expectedCost = 420;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithLotsOfItems() {
        String skus = "ABCDECBAABCABBAAAEEAA";
        Integer expectedCost = 665;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithOfferForH1() {
        String skus = "HHHHHH";
        Integer expectedCost = 55;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithOfferForH2() {
        String skus = "HHHHHHHHHH";
        Integer expectedCost = 80;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithOfferForK() {
        String skus = "KK";
        Integer expectedCost = 150;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithOfferForM() {
        String skus = "MNNNMNNNM";
        Integer expectedCost = 255;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithOfferForP() {
        String skus = "PPPPP";
        Integer expectedCost = 200;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithOfferForQ1() {
        String skus = "QQQ";
        Integer expectedCost = 80;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    // Policy: The policy of the supermarket is to always favor the customer when applying special offers.
    //         So QQQRRR - should:
    //             Get the discount of 3Qs for 80
    //             And then remove the price of one full Price Q (i.e. 30)
    //         Total cost: 50 + (cost of 3 Rs)
    @Test
    void testCheckoutWithOfferForQ2() {
        String skus = "QQQRRR";
        Integer expectedCost = 200;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithOfferForQ3() {
        String skus = "QQQRRRRRRRRR";
        Integer expectedCost = 450;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithOfferForU() {
        String skus = "UUUU";
        Integer expectedCost = 120;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithOfferForV1() {
        String skus = "VV";
        Integer expectedCost = 90;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    @Test
    void testCheckoutWithOfferForV2() {
        String skus = "VVV";
        Integer expectedCost = 130;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    // Policy: The policy of the supermarket is to always favor the customer when applying special offers.
    //         So BBEE - should:
    //             Get the discount of 2Bs for 45
    //             And then remove the price of one full Price B (i.e. 30)
    //         Total cost: 15 + (cost of 2 Es)
    @Test
    void testCheckoutWithOfferForB() {
        String skus = "BBEE";
        Integer expectedCost = 95;
        assertEquals(expectedCost, checkoutSolution.checkout(skus), "Total cost calculated incorrectly");
    }

    // Invalid items
    @Test
    void testCheckoutWithInvalidItems1() {
        String skus = "ABCDz";
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



