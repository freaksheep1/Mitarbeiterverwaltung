package fahrzeuge;

public class GPS {
    private float laengengrad;
    private float breitengrad;

    public float getLaengengrad() {
        return laengengrad;
    }

    public void setLaengengrad(float laengengrad) {
        this.laengengrad = laengengrad;
    }

    public float getBreitengrad() {
        return breitengrad;
    }

    public void setBreitengrad(float breitengrad) {
        this.breitengrad = breitengrad;
    }

    public GPS(float laengengrad, float breitengrad) {
        this.laengengrad = laengengrad;
        this.breitengrad = breitengrad;
    }

}
