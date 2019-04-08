package ua.lviv.iot.manager;

import ua.lviv.iot.models.BabyShop;

import java.util.List;

public interface Shopping {

    List<BabyShop> searchByAge(double ageSuitability);

    void sortByPrice(boolean sort);

    void sortByWarranty(boolean sort);

}


