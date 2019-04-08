package ua.lviv.iot.models;

public class Diapers extends BabyShop {
    private int amountInPack;
    private DiapersSize diapersModelSize;
    private KidWeight kidWeightInKilo;

    public Diapers(
           final String name,
           final String brand,
           final double price,
           final SafetyStandard wareSafetyStandard,
           final int goodAvailability,
           final int warranty,
           final double ageSuitability,
           final String supplier,
           final String country,
           final int amountInPack,
           final DiapersSize diapersModelSize,
           final KidWeight kidWeightInKilo
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

    public Diapers() {
    }

    public String getHeaders() {
        return super.getHeaders() + ", " + "amountInPack" + ", " + "diapersModelSize" + ", " + "kidWeightInKilo";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getAmountInPack() + ", " + getDiapersModelSize() + ", " + getKidWeightInKilo();
    }

    public int getAmountInPack() {
        return amountInPack;
    }

    public void setAmountInPack(final int amountInPack) {
        this.amountInPack = amountInPack;
    }

    public DiapersSize getDiapersModelSize() {
        return diapersModelSize;
    }

    public void setDiapersModelSize(final DiapersSize diapersModelSize) {
        this.diapersModelSize = diapersModelSize;
    }

    public KidWeight getKidWeightInKilo() {
        return kidWeightInKilo;
    }

    public void setKidWeightInKilo(final KidWeight kidWeightInKilo) {
        this.kidWeightInKilo = kidWeightInKilo;
    }
}
