package meetkunde.model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Bevat alle eigenschappen van een cirkel
 */
public class Cirkel {
    public static final int DEFAULT_MIDDELPUNT_X = 0;
    public static final int DEFAULT_MIDDELPUNT_Y = 0;
    public static final String DEFAULT_KLEUR = "regenboog";

    public double straal;
    public double middelpuntX;
    public double middelpuntY;
    public String kleur;

    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        this.straal = straal;
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;
    }

    public Cirkel(double straal) {
        this.straal = straal;
        this.middelpuntX = DEFAULT_MIDDELPUNT_X;
        this.middelpuntY = DEFAULT_MIDDELPUNT_Y;
        this.kleur = DEFAULT_KLEUR;
    }

    public Cirkel() {
        this.straal = 1;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "regenboog";
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, " +
                "die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

}
