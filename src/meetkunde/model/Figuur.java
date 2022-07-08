package meetkunde.model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Algemene eigenschappen die alle figuren delen
 */
public abstract class Figuur implements Comparable<Figuur>, ToelaatbaarInOppervlak {
    protected static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private static final String DEFAULT_KLEUR = "paars";

    protected String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this(DEFAULT_KLEUR);
    }

    public static String geefDefinitie() {
        return "Een figuur is een verzameling punten";
    }

    public abstract double geefOmtrek();

    public abstract double geefOppervlakte();

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Ik ben klein!!!";
        }
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s\nOmtrek: %.2f\nOppervlakte %.2f", this.kleur, geefOmtrek(), geefOppervlakte());
    }

    @Override
    public int compareTo(Figuur anderFiguur) {
        // zo kon het ook
        // return Double.compare(this.geefOppervlakte(), anderFiguur.geefOppervlakte());
        if (this.geefOppervlakte() < anderFiguur.geefOppervlakte()) {
            return -1;
        } else if (this.geefOppervlakte() > anderFiguur.geefOppervlakte()) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getKleur() {
        return kleur;
    }
}
