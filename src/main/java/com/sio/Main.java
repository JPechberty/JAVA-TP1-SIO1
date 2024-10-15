package com.sio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("#############################################");
        System.out.println("            JAVA TP1 SIO 1 ALT");
        System.out.println("#############################################");

        while (true) {
            System.out.println("\n1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Exit");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    calculerAireCarre();
                    break;
                case 2:
                    System.out.println("Entrer le nombre limite: ");
                    int limit = scanner.nextInt();
                    int sum = 0;
                    for (int i = 1; i <= limit; i++) {
                        sum += i;
                    }
                    System.out.println("La somme des " + limit + " premiers nombres est " + sum);
                    break;
                case 3:
                    System.out.println("Quel est votre indice ?");
                    int indice = scanner.nextInt();
                    double brut = indice * 2.3;
                    double retenues = brut * 0.2;
                    double net = brut - retenues;
                    System.out.println("Salaire brut : " + brut + "€");
                    System.out.println("Montant des retenues : " + retenues + "€");
                    System.out.println("Salaire net : " + net + "€");
                    break;
                case 4:
                    DecimalFormat df = new DecimalFormat("##.###");
                    System.out.println("Quelle est la valeur du rayon ?");
                    double rayon = scanner.nextDouble();
                    float pi = 3.141592f;
                    //double perimetre = 2 * Math.PI * rayon;
                    double perimetre = 2 * pi * rayon;
                    System.out.println("Le périmètre du cercle est " + df.format(perimetre) + " cm");
                    break;
                case 0: System.exit(0); break;
                default: System.out.println("Choix invalide!"); break;
            }
        }
    }

    private static void calculerAireCarre() {
        System.out.println("Entrer la valeur du côté:");
        double cote = scanner.nextDouble();
        double aire = cote * cote;
        System.out.println("La aire du carré est " + aire +" cm²");
    }

}