/*
package ua.lviv.iot.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.models.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BabyShopWriterTest {
    @Test
    void test() {
        List<BabyShop> babyShopList = new ArrayList<>();
        babyShopList.add(new BabyShop());

        BabyShop productThermometer = new Thermometer("Baby brand thermometer", "Gucci", 6999.99,
                SafetyStandard.EN_1400_2019, 1, 365, 3, "Gucci Ukraine",
                "Italy");

        BabyShop productChair = new Chair("Brand chair", "Chicco", 2999.99, SafetyStandard.EN_1400_2016,
                14, 30, 3, "National delievery", "Ukraine", 56,
                44, 42, 42, "wood");

        BabyShop productSkinCare = new SkinCare("Creme for hands", "Bubchen", 40,
                SafetyStandard.EN_1400_2019, 30, 0, 3, "Bubchen company",
                "Germany");

        BabyShop productDiapers = new Diapers("Diapers active baby", "Pampers", 899.99,
                SafetyStandard.EN_1400_2016, 40, 0, 3, "Pampers logistics",
                "China", 174, DiapersSize.MEDIUM, KidWeight.FROM_4_TO_9);

        babyShopList.add(productThermometer);
        babyShopList.add(productChair);
        babyShopList.add(productSkinCare);
        babyShopList.add(productDiapers);
        try{
            BabyShopWriter.writeToFile(babyShopList);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
*/
