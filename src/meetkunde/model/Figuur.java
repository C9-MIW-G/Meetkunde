package meetkunde.model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Algemene eigenschappen die alle figuren delen
 */
public class Figuur {
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

    public double geefOmtrek() {
        // Het spijt me ik weet niet beter
        return 0;
    }

    public double geefOppervlakte() {
        // Het spijt me ik weet niet beter
        return 0;
    }

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
}
