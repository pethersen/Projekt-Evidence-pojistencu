package project;

import java.util.ArrayList;

public class SpravaPojistencu {
    private ArrayList<Pojistenec> pojistenci;
    public SpravaPojistencu() {
        pojistenci = new ArrayList<>();
    }

    //přidá pojištěnce do databáze
    public void pridejPojistence(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, telefonniCislo));
    }

    //vyhledá a zobrazí pojištěnce
    public ArrayList<Pojistenec> vyhledejPojistence(String jmeno, String prijmeni) {
        ArrayList<Pojistenec> nalezene = new ArrayList<>();
        for (Pojistenec pojistenec : pojistenci) {
            if ((pojistenec.getJmeno().equals(jmeno)) && (pojistenec.getPrijmeni().equals(prijmeni))) {
                nalezene.add(pojistenec);
            }
        }
        return nalezene;
    }

    public ArrayList<Pojistenec> getPojistenci() {
        return pojistenci;
    }
}
