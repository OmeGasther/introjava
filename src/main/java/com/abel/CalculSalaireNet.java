package com.abel;

import java.util.Scanner;

public class CalculSalaireNet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le taux horaire brut : ");
        final double tauxHoraire = scanner.nextInt(); // Taux horaire brut (en euros)
        final double tauxDeduction = 0.20; // 20% de déductions pour les impôts

        System.out.print("Entrez le nombre d'heures travaillées dans le mois : ");
        int heuresTravaillees = scanner.nextInt();

        double salaireBrut = heuresTravaillees * tauxHoraire;

        double deductions = salaireBrut * tauxDeduction;

        double salaireNet = salaireBrut - deductions;

        System.out.println("Salaire brut : " + salaireBrut + " euros");
        System.out.println("Deductions : " + deductions + " euros");
        System.out.println("Salaire net : " + salaireNet + " euros");

        scanner.close();
    }
}
