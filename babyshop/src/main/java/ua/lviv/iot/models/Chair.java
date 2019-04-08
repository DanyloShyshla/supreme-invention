package ua.lviv.iot.models;

import javax.persistence.Entity;

@Entity
public class Chair extends BabyShop {

    private double height;
    private double width;
    private double depth;
    private double weightLimit;
    private String material;

    public Chair(
            final String name,
            final String brand,
            final double price,
            final SafetyStandard wareSafetyStandard,
            final int goodAvailability,
            final int warranty,
            final double ageSuitability,
            final String supplier,
            final String country,
            final double height,
            final double width,
            final double depth,
            final double weightLimit,
            final String material

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

    public Chair() {

    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "height" + ", " + "width" + ", " + "depth" + ", " + "weightLimit" + ", " + "material";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getHeight() + ", " + getWidth() + ", " + getDepth() + ", " + getWeightLimit()
                + ", " + getMaterial();
    }

    @Override
    void createEmptyBabyShop() {
        super.createEmptyBabyShop();
        Chair c = new Chair();
    }

    //overloading
    void createEmptyBabyShop(final int n) {

    }

    //overloading
    void createEmptyBabyShop(final double n) {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(final double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(final double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(final double depth) {
        this.depth = depth;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(final double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(final String material) {
        this.material = material;
    }
}
