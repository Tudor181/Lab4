package pack;

import java.util.Scanner;

public class App {

    public static void varstaMedie(Persoana[] persoane) {
        int sum = 0;
        for (Persoana person : persoane) {
            sum += person.getAge();
        }
        System.out.println("Varsta medie este: " + sum / persoane.length);
    }

    public static void main(String args[]) {
        LoggingSingleton log = LoggingSingleton.getLog();
        log.setMessage("Program started");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce ti numele apoi cnp ul unei persoane:");
        String nume = scanner.nextLine();
        String cnp = scanner.nextLine();
        int age = scanner.nextInt();
        Persoana[] persoane = new Persoana[2];
        CarteIdentitate ci = new CarteIdentitate(cnp, nume, age);
        Persoana personWithAlreadyExistentCi = new Persoana(ci);
        Persoana personWithNewCI = new Persoana("123145", "Lopata Andrei", 25);
        persoane[0] = personWithAlreadyExistentCi;
        persoane[1] = personWithNewCI;
        personWithAlreadyExistentCi.getCNP();

        // n siruri de char si int
        // int n = scanner.nextInt();
        // int[] random = new int[n];
        // for (char i = 0; i < n; ++i) {
        // random[i] = scanner.nextInt();
        // }

        // int n1 = scanner.nextInt();
        // String[] chars = new String[n];
        // for (char i = 0; i < n1; ++i) {
        // chars[i] = scanner.nextLine();
        // }
        System.out.println("S-au instantiat:" + Persoana.ObiecteInstantiate + "personae");
        varstaMedie(persoane);

        log.stopLogging();

    }
}
