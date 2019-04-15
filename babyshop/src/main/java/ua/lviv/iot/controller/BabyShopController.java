package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.models.BabyShop;

import ua.lviv.iot.repository.BabyShopRepository;

@RestController
class BabyShopController {
    private final BabyShopRepository<BabyShop> babyShopRepository;

    BabyShopController(@Qualifier("babyShopRepository") BabyShopRepository<BabyShop> repository) {
        this.babyShopRepository = repository;
    }

    @GetMapping("/baby-shop")
    Iterable<BabyShop> all() {
        return babyShopRepository.findAll();
    }

    @PostMapping("/baby-shop")
    public @ResponseBody
    BabyShop newBabyShop(BabyShop newBabyShop) {
        return babyShopRepository.save(newBabyShop);
    }

    @GetMapping("/baby-shop/{id}")
    BabyShop babyShop(@PathVariable Integer id) {
        return babyShopRepository.findById(id).orElseThrow(() -> new BabyShopNotFoundException(id));
    }

    @PutMapping("/baby-shop/{id}")
    BabyShop repleaceBabyShop(@RequestBody BabyShop newBabyShop, @PathVariable Integer id) {
        return babyShopRepository.findById(id).map(babyShop -> {
            babyShop.setName(newBabyShop.getName());
            babyShop.setBrand(newBabyShop.getBrand());
            babyShop.setPrice(newBabyShop.getPrice());
            babyShop.setWareSafetyStandard(newBabyShop.getWareSafetyStandard());
            babyShop.setGoodAvailability(newBabyShop.getGoodAvailability());
            babyShop.setWarranty(newBabyShop.getWarranty());
            babyShop.setAgeSuitability(newBabyShop.getAgeSuitability());
            babyShop.setSupplier(newBabyShop.getSupplier());
            babyShop.setCountry(newBabyShop.getCountry());
            return babyShopRepository.save(babyShop);
        }).orElseGet(() -> {
            newBabyShop.setId(id);
            return babyShopRepository.save(newBabyShop);
        });
    }

    @DeleteMapping("/baby-shop/{id}")
    void deleteBabyShop(@PathVariable Integer id) {
        babyShopRepository.deleteById(id);
    }
}