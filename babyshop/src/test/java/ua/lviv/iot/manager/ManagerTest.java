package ua.lviv.iot.manager;

//import org.junit.jupiter.api.*;
import ua.lviv.iot.models.*;

import java.util.ArrayList;
import java.util.List;


/*
public class ManagerTest {
    BabyShop productThermometer;
    BabyShop productChair;
    BabyShop productSkinCare;
    BabyShop productDiapers;

    List<BabyShop> products = new ArrayList<BabyShop>();

    ManagerImplementation manager;

    BabyShop theMostExpensiveWare;
    BabyShop theLongestWarranty;
    public static final int BEST_AGE = 3;
    public static final int AGE_SUITABILITY_COUNTER = 4;

    @BeforeEach
    void setUp() {
        this.productThermometer = new Thermometer("Baby brand thermometer", "Gucci", 6999.99,
                SafetyStandard.EN_1400_2019, 1, 365, 3, "Gucci Ukraine",
                "Italy");

        this.productChair = new Chair("Brand chair", "Chicco", 2999.99, SafetyStandard.EN_1400_2016,
                14, 30, 3, "National delievery", "Ukraine", 56,
                44, 42, 42, "wood");

        this.productSkinCare = new SkinCare("Creme for hands", "Bubchen", 40,
                SafetyStandard.EN_1400_2019, 30, 0, 3, "Bubchen company",
                "Germany");

        this.productDiapers = new Diapers("Diapers active baby", "Pampers", 899.99,
                SafetyStandard.EN_1400_2016, 40, 0, 3, "Pampers logistics",
                "China", 174, DiapersSize.MEDIUM, KidWeight.FROM_4_TO_9);

        products.add(productThermometer);
        products.add(productChair);
        products.add(productSkinCare);
        products.add(productDiapers);

        manager = new ManagerImplementation(products);

        this.theMostExpensiveWare = productThermometer;
        this.theLongestWarranty = productThermometer;
    }

    @Test
    public void sortByPriceDescTest() {  //Descending
        manager.sortByPrice(true);
        Assertions.assertEquals(manager.getList().get(0), theMostExpensiveWare);

    }

    @Test
    public void sortByPriceAscTest() {  //Ascending
        manager.sortByPrice(false);
        Assertions.assertEquals(manager.getList().get(manager.getList().size() - 1), theMostExpensiveWare);

    }

    @Test
    public void sortByWarrantyDescTest() {
        manager.sortByWarranty(true);
        Assertions.assertEquals(manager.getList().get(0), theLongestWarranty);
    }

    @Test
    public void sortByWarrantyAscTest() {
        manager.sortByWarranty(false);
        Assertions.assertEquals(manager.getList().get(manager.getList().size() - 1), theLongestWarranty);

    }

    @Test
    public void searchByAgeTest() {
//        manager.searchByAge(BEST_AGE);
        Assertions.assertEquals(manager.getList().size(), AGE_SUITABILITY_COUNTER);
    }

    */
/*@Test(expected = ClassNotFoundException.class)
    public void givenNoDrivers_whenLoadDriverClass_thenClassNotFoundException()
            throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }*//*


    @AfterEach
    void cleanUp() {
        products.clear();
    }

    @AfterAll
    static void finish() {
        System.out.println("That's it! Tests are executed!");
    }
}
*/
