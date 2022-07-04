package meetkunde.controller;

import meetkunde.model.Cirkel;
import meetkunde.model.Punt;
import meetkunde.model.Rechthoek;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Gebruik mijn Meetkunde code en laat zien dat het allemaal netjes werkt.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkelArray = new Cirkel[3];

        mijnCirkelArray[0] = new Cirkel(3, new Punt(1, 4), "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(6);

        for (int arrayTeller = 0; arrayTeller < mijnCirkelArray.length;
             arrayTeller++) {
            System.out.println(mijnCirkelArray[arrayTeller].geefOmtrek());
            System.out.println(mijnCirkelArray[arrayTeller].geefOppervlakte());
            System.out.println(mijnCirkelArray[arrayTeller].getMiddelpunt().getxCoordinaat());
            System.out.println(mijnCirkelArray[arrayTeller].getMiddelpunt().getyCoordinaat());
            System.out.println();
        }

        System.out.println(Rechthoek.geefDefinitie());
        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];
        mijnRechthoekArray[0] = new Rechthoek(4, 3, new Punt(2, 5), "blauw");
        mijnRechthoekArray[1] = new Rechthoek();
        mijnRechthoekArray[2] = new Rechthoek(25, 10);
        for (int arrayTeller = 0; arrayTeller < mijnRechthoekArray.length;
             arrayTeller++) {
            System.out.println(mijnRechthoekArray[arrayTeller].geefOmtrek());
            System.out.println(mijnRechthoekArray[arrayTeller].geefOppervlakte());
            System.out.println(mijnRechthoekArray[arrayTeller].
                    getHoekpuntLinksBoven().getxCoordinaat());
            System.out.println(mijnRechthoekArray[arrayTeller].
                    getHoekpuntLinksBoven().getyCoordinaat());
            System.out.println(mijnRechthoekArray[arrayTeller].
                    vertelOverGrootte());
        }
    }

}
