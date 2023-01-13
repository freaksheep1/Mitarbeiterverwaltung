package arbeiter;

public class Manager extends BueroArbeiter {

    private double bonusSatz;

    public double getBonusSatz() {
        return bonusSatz;
    }

    public void setBonusSatz(double bonusSatz) {
        this.bonusSatz = bonusSatz;
    }

    public Manager(int id, String name, double festgehalt, double bonusSatz) {
        super(id, name, festgehalt);
        setId(id);
        this.bonusSatz = bonusSatz;
    }

    @Override
    protected void setId(int id) {
        if (id >= 5000 && id <= 5099) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID is to low or high. Must be between 5000 and 5099.");
        }
    }

    @Override
    public double einkommen() {
        return getFestgehalt() + berechneBonus();
    }

    public double berechneBonus() {
        return bonusSatz * getFestgehalt();
    }
}

