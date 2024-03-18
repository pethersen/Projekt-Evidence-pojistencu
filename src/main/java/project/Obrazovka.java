package project;

import java.util.Scanner;

public class Obrazovka {
    private UzivatelskeRozhrani sprava;
    public Obrazovka() {
        sprava = new UzivatelskeRozhrani();
    }

    //vykreslí uživatelské rozhraní
    public void vypisObrazovku() {
        Scanner scanner = new Scanner(System.in);
        String volba = "";
        while (!volba.equals("4")) {
            System.out.println("------------------------------");
            System.out.println("EVIDENCE POJIŠTĚNÍ");
            System.out.println("------------------------------");
            System.out.println();
            System.out.println("Vyberte akci:");
            System.out.println("1 - Přidat nového pojištěnce");
            System.out.println("2 - Vypsat všechny pojištěnce");
            System.out.println("3 - Vyhledat pojištěnce");
            System.out.println("4 - Konec");
            volba = scanner.nextLine();
            switch(volba) {
                case "1":
                    sprava.pridejPojistence();
                    break;
                case "2":
                    sprava.vypisPojistence();
                    break;
                case "3":
                    sprava.vyhledejPojistence();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Neplatná volba");
            }
            System.out.println();
            System.out.println("Pokračujte stisknutím \"enter\"");
            scanner.nextLine();
        }
        System.out.println("Nashledanou!");
    }
}
