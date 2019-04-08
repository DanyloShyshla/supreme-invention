package ua.lviv.iot.manager;

import ua.lviv.iot.models.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerImplementation implements Shopping {

    private List<BabyShop> kidGoodsList;

    public ManagerImplementation(List<BabyShop> kidGoodsList) {
        this.kidGoodsList = kidGoodsList;
    }

    public ManagerImplementation() {

    }

    @Override
    public List<BabyShop> searchByAge(final double ageSuitability) {
        return kidGoodsList.stream()
                .filter(singleGood -> singleGood.getAgeSuitability() == ageSuitability)
                .collect(Collectors.toList());
    }

    @Override
    public void sortByPrice(final boolean sort) {

        int sorter = sort ? -1 : 1;
        Comparator<BabyShop> anonymousComparator = new Comparator<BabyShop>() {
            @Override
            public int compare(final BabyShop shop1, final BabyShop shop2) {
                return (int) (sorter * (shop1.getPrice() - shop2.getPrice()));
            }
        };


        Comparator<BabyShop> lambdaComparator = (shop1, shop2) -> (int) (sorter * (shop1.getPrice() - shop2.getPrice()));
        kidGoodsList.sort(lambdaComparator);


//        kidGoodsList.sort(Comparator.comparing(BabyShop::getPrice));  method reference
    }

    @Override
    public void sortByWarranty(final boolean sort) {

        int sorter = sort ? -1 : 1;
        kidGoodsList.sort((objectFirst, objectSecond) -> (sorter * (objectFirst.getWarranty() - objectSecond.getWarranty())));
    }

    public void addProduct() {

        kidGoodsList.add(new Chair("Brand chair", "Chicco", 2999.99, SafetyStandard.EN_1400_2016,
                14, 30, 3, "National delievery", "Ukraine",
                56, 44, 42, 42, "wood"));

        kidGoodsList.add(new SkinCare("Creme for hands", "Bubchen", 40, SafetyStandard.EN_1400_2019,
                30, 0, 3, "Bubchen company", "Germany"));

        kidGoodsList.add(new Chair("Space baby activity chair", "Bloom baby", 4799.99,
                SafetyStandard.EN_1400_2013, 4, 365, 5,
                "Bloom baby Ukraine logistics", "USA", 82, 46, 46, 55,
                "wood"));

        kidGoodsList.add(new Thermometer("Baby brand thermometer", "Gucci", 6999.99,
                SafetyStandard.EN_1400_2019, 1, 365, 3, "Gucci Ukraine",
                "Italy"));

        kidGoodsList.add(new Diapers("Diapers active baby", "Pampers", 899.99,
                SafetyStandard.EN_1400_2016, 40, 0, 3, "Pampers logistics",
                "China", 174, DiapersSize.MEDIUM, KidWeight.FROM_4_TO_9));
    }

    public List<BabyShop> getList() {
        return kidGoodsList;
    }
}
