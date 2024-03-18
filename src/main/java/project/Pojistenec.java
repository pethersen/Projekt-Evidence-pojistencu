package project;

public class Pojistenec {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefonniCislo;
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }
    public String getJmeno() {
        return jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }

    //vrátí jméno, příjmení, věk a telefonní číslo pojištěnce
    @Override
    public String toString() {
        return jmeno + " " + prijmeni  + " " + vek + " " + telefonniCislo;
    }
}
