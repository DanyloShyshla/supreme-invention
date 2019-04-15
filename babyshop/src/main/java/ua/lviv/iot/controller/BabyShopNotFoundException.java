package ua.lviv.iot.controller;

public class BabyShopNotFoundException extends RuntimeException {
    public BabyShopNotFoundException(Integer id) {
        super("Could not find employee " + id);
    }
}
