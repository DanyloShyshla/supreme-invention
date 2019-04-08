package ua.lviv.iot.models;

public class Thermometer extends BabyShop {

    private String color;
    private ThermometerType thermometerModelType;

    public Thermometer(
            final String name,
            final String brand,
            final double price,
            final SafetyStandard wareSafetyStandard,
            final int goodAvailability,
            final int warranty,
            final double ageSuitability,
            final String supplier,
            final String country
    ) {
        super(
                name,
                brand,
                price,
                wareSafetyStandard,
                goodAvailability,
                warranty,
                ageSuitability,
                supplier,
                country
        );
    }

    public Thermometer() {
    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "color" + ", " + "thermometerModelType";
    }

    public String toCSV() {
        return  super.toCSV() + ", " + getColor() + ", " + getThermometerModelType();
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public ThermometerType getThermometerModelType() {
        return thermometerModelType;
    }

    public void setThermometerModelType(final ThermometerType thermometerModelType) {
        this.thermometerModelType = thermometerModelType;
    }
}
