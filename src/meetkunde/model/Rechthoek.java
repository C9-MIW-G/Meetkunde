package meetkunde.model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Bevat alle eigenschappen van een rechthoek
 */
public class Rechthoek extends Figuur {
    public static final String DEFAULT_KLEUR = "groen";

    public static final int DEFAULT_LENGTE = 0;
    public static final int DEFAULT_BREEDTE = 0;

    private final double lengte;
    private final double breedte;
    private final Punt hoekpuntLinksBoven;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        super(kleur);
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), DEFAULT_KLEUR);
    }

    public Rechthoek() {
        this(DEFAULT_LENGTE, DEFAULT_BREEDTE);
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken";
    }

    @Override
    public double geefOmtrek() {
        return 2 * (lengte + breedte);
    }

    @Override
    public double geefOppervlakte() {
        return lengte * breedte;
    }

    @Override
    public boolean pastInOppervlak(double lengte, double breedte) {
        return this.lengte <= lengte && this.breedte <= breedte;
    }

    @Override
    public String toString() {
        return String.format("%s\nLengte: %s\nBreedte: %s\nHoekpuntLinksBoven: %s", super.toString(), this.lengte, this.breedte, this.hoekpuntLinksBoven);
    }
}
