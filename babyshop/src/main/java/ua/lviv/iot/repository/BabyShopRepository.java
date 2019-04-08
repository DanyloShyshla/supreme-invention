package ua.lviv.iot.repository;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.models.BabyShop;

public interface BabyShopRepository<T extends BabyShop> extends CrudRepository<T, Integer>{

}
