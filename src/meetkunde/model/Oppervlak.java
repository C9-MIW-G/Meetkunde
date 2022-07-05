package meetkunde.model;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Een plek om figuren op te plaatsen
 */
public class Oppervlak {
    private double lengte;
    private double breedte;
    private ArrayList<Figuur> mijnFiguren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.mijnFiguren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        mijnFiguren.add(figuur);
    }

    private boolean figuurPastAlsVormInOppervlak(Figuur figuur) {
        boolean eenReturn = false;

        if (figuur instanceof Rechthoek) {
            // figuur is een Rechthoek
            if (((Rechthoek) figuur).getLengte() <= lengte && ((Rechthoek) figuur).getBreedte() <= breedte) {
                eenReturn = true;
            }
        } else if (figuur instanceof Cirkel) {
            // figuur is een Cirkel
            if (((Cirkel) figuur).getStraal() <= breedte / 2) {
                eenReturn = true;
            }
        }

        return eenReturn;
    }

    @Override
    public String toString() {
        String eenReturn = "";

        for (Figuur figuur : mijnFiguren) {
            eenReturn += figuur.toString() + "\n\n";
        }

        return eenReturn;
    }
}
