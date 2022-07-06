package meetkunde.model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Bevat alle eigenschappen van een cirkel
 */
public class Cirkel extends Figuur {
    private static final String DEFAULT_KLEUR = "regenboog";
    private static final int DEFAULT_STRAAL = 1;

    private double straal;
    private Punt middelpunt;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        super(kleur);
        this.setStraal(straal);
        this.middelpunt = middelpunt;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), DEFAULT_KLEUR);
    }

    public Cirkel() {
        this(DEFAULT_STRAAL);
    }

    @Override
    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public boolean pastInOppervlak(double lengte, double breedte) {
        return straal <= lengte / 2 && straal <= breedte / 2;
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, " +
                "die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    @Override
    public String toString() {
        return String.format("%s\nStraal: %s\nMiddelpunt: %s", super.toString(), this.straal, this.middelpunt);
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            throw new IllegalArgumentException("De straal moet positief zijn.");
        }
        this.straal = straal;
    }

    public Punt getMiddelpunt() {
        return middelpunt;
    }

    public void setMiddelpunt(Punt middelpunt) {
        this.middelpunt = middelpunt;
    }

}
