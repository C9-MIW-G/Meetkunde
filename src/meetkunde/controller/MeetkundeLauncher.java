package meetkunde.controller;

import meetkunde.model.Cirkel;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Gebruik mijn Meetkunde code en laat zien dat het allemaal netjes werkt.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel(2, 0, 0, "blauw");

        Cirkel eenheidscirkel = new Cirkel();

        Cirkel cirkel2 = new Cirkel(6);

        System.out.println(cirkel.geefOmtrek());
        System.out.println(cirkel.geefOppervlakte());

        System.out.println(eenheidscirkel.geefOmtrek());
        System.out.println(eenheidscirkel.geefOppervlakte());

        System.out.println(cirkel2.geefOmtrek());
        System.out.println(cirkel2.geefOppervlakte());
        System.out.println(Cirkel.geefDefinitie());
    }

}
