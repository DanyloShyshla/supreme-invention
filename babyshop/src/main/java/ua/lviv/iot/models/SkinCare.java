package ua.lviv.iot.models;

public class SkinCare extends BabyShop {
    private boolean hypoallergenic;
    private int bottleSizeInML;
    private SkinCareType skinCareModelType;

    public SkinCare(
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

    public SkinCare() {

    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "hypoallergenic" + ", " + "bottleSizeInML" + ", " + "skinCareModelType";
    }

    public String toCSV() {
        return super.toCSV() + ", " + isHypoallergenic() + ", " + getBottleSizeInML() + ", " + getSkinCareModelType();
    }

    final boolean isHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(final boolean hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    final int getBottleSizeInML() {
        return bottleSizeInML;
    }

    public void setBottleSizeInML(final int bottleSizeInML) {
        this.bottleSizeInML = bottleSizeInML;
    }

    final SkinCareType getSkinCareModelType() {
        return skinCareModelType;
    }

    public void setSkinCareModelType(final SkinCareType skinCareModelType) {
        this.skinCareModelType = skinCareModelType;
    }
}
