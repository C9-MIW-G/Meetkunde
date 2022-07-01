package meetkunde.controller;

import meetkunde.model.Cirkel;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Gebruik mijn Meetkunde code en laat zien dat het allemaal netjes werkt.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkelArray = new Cirkel[3];

        mijnCirkelArray[0] = new Cirkel(3, 1, 4, "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(6);

        for (int arrayTeller = 0; arrayTeller < mijnCirkelArray.length;
             arrayTeller++) {
            System.out.println(mijnCirkelArray[arrayTeller].geefOmtrek());
            System.out.println(mijnCirkelArray[arrayTeller].geefOppervlakte());
            System.out.println(mijnCirkelArray[arrayTeller].getKleur());
            System.out.println(mijnCirkelArray[arrayTeller].vertelOverGrootte());
            System.out.println();
        }
    }

}
