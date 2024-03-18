package project;

import java.util.ArrayList;
import java.util.Scanner;

public class UzivatelskeRozhrani {
    Scanner scanner = new Scanner(System.in);
    private SpravaPojistencu evidence;
    public UzivatelskeRozhrani() {
        evidence = new SpravaPojistencu();
    }
    
    //přidá pojištěnce do databáze
    public void pridejPojistence() {
        System.out.println("Zadejte jméno:");
        String jmeno = "";
        while(jmeno.equals("")) {
            jmeno = scanner.nextLine().trim();
            if (jmeno.equals("")) {
                System.out.println("Jméno nezadáno. Zadejte jméno");
            }
        }
        System.out.println("Zadejte příjmení:");
        String prijmeni = "";
        while(prijmeni.equals("")) {
            prijmeni = scanner.nextLine().trim();
         if (prijmeni.equals("")) {
             System.out.println("Příjmení nezadáno. Zadejte příjmení");
         }
        }
        System.out.println("Zadejte věk:");
        boolean jeSpravne = false;
        int vek = 0;
        while (!jeSpravne) {
            try {
                vek = Integer.parseInt(scanner.nextLine().trim());
                jeSpravne = true;
            } catch (Exception ex) {
                System.out.println("Nesprávně zadáno. Zkuste znovu:");
            }
        }
        System.out.println("Zadejte telefonní číslo:");
        String telefonniCislo = "";
        while(telefonniCislo.equals("")) {
            telefonniCislo = scanner.nextLine().trim();
            if (telefonniCislo.equals("")) {
                System.out.println("Telefonní číslo nezadáno. Zadejte telefonní číslo");
            }
        }
        evidence.pridejPojistence(jmeno, prijmeni, vek, telefonniCislo);
        System.out.println("Nový pojištěnec byl přidán do evidence");
    }

    //vypíše pojištěnce v databázi
    public void vypisPojistence() {
        ArrayList<Pojistenec> pojistenci = evidence.getPojistenci();
        if (pojistenci.size() > 0) {
            System.out.println("Seznam pojištěnců:");
            for (Pojistenec pojistenec : pojistenci) {
                System.out.println(pojistenec);
            }
        } else {
            System.out.println("Evidence je prázdná");
        }
    }

    //vyhledá a zobrazí pojištěnce
    public void vyhledejPojistence() {
        System.out.println("Zadejte jméno:");
        String jmeno = scanner.nextLine().trim();
        System.out.println("Zadejte příjmení:");
        String prijmeni = scanner.nextLine().trim();
        ArrayList<Pojistenec> pojistenci = evidence.vyhledejPojistence(jmeno, prijmeni);
        if (pojistenci.size() > 0) {
            System.out.println("Výsledky hledání:");
            for (Pojistenec pojistenec : pojistenci) {
                System.out.println(pojistenec);
            }
        } else {
            System.out.println("Žádné výsledky");
        }
    }
}
