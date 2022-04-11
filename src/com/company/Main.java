package com.company;

import java.util.Scanner;

public class Main {
  final Scanner keyboard = new Scanner(System.in);
  final int[] ødeØSvar = new int[10];
  final String[] svarMuligheder = {"Kæreste", "kaffemaskine", "Netflix", "Sofa", "Løbesko", "Guitar", "Slik", "Hund", "Bog", "Øl"};

  private void menu() {
    int brugerSvar = 0;
    while (brugerSvar != 3) {
      System.out.println("\nVelkommen til den øde ø statistikprogrammet. ");
      System.out.println("Indtast 1 for tilføjelse af nye svar");
      System.out.println("Indtast 2 for statistik af svar");
      System.out.println("Indtast 3 for at afslutte programmet");
      brugerSvar = keyboard.nextInt();

      if (brugerSvar == 1) {
        tilføjNytSvar();
      } else if (brugerSvar == 2) {
        seSvarStatistik();
      }
    }
  }

  private void seSvarStatistik() {
    System.out.println("Brugernes stemmer har fordelt sig således:");
    for (int i = 0; i < svarMuligheder.length; i++) {
      System.out.println(svarMuligheder[i] + " " + ødeØSvar[i]);
    }
  }

  private void tilføjNytSvar() {
    System.out.println("Hvilken ting vil du helst have med på en øde ø?");

    for (int i = 0; i < svarMuligheder.length; i++) {
      System.out.println((i + 1) + " " + svarMuligheder[i]);
    }

    int brugerStemme = keyboard.nextInt();

    //kun svar mellem 0 og 10 kan bruges
    if (brugerStemme <= 10 && brugerStemme > 0) {
      tilføjStemmeTilSvarListe(brugerStemme);
    } else {
      tilføjNytSvar();
    }
  }

  private void tilføjStemmeTilSvarListe(int indexNr) {
    ødeØSvar[indexNr - 1] ++;
  }

  public static void main(String[] args) {
    new Main().menu();
  }
}
