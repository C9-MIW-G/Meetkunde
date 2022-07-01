package meetkunde.model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Bevat alle eigenschappen van een cirkel
 */
public class Cirkel {
    private static final int DEFAULT_MIDDELPUNT_X = 0;
    private static final int DEFAULT_MIDDELPUNT_Y = 0;
    private static final String DEFAULT_KLEUR = "regenboog";
    private static final int DEFAULT_STRAAL = 1;
    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private double straal;
    private double middelpuntX;
    private double middelpuntY;
    private String kleur;

    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        this.setStraal(straal);
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;
    }

    public Cirkel(double straal) {
        this(straal, DEFAULT_MIDDELPUNT_X, DEFAULT_MIDDELPUNT_Y, DEFAULT_KLEUR);
    }

    public Cirkel() {
        this(DEFAULT_STRAAL);
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Ik ben klein!!!";
        }
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, " +
                "die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            System.out.printf("De straal moet positief zijn. De straal wordt nu op %d gezet.\n", DEFAULT_STRAAL);
            this.straal = DEFAULT_STRAAL;
        } else {
            this.straal = straal;
        }
    }

    public double getMiddelpuntX() {
        return middelpuntX;
    }

    public void setMiddelpuntX(double middelpuntX) {
        this.middelpuntX = middelpuntX;
    }

    public double getMiddelpuntY() {
        return middelpuntY;
    }

    public void setMiddelpuntY(double middelpuntY) {
        this.middelpuntY = middelpuntY;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}
