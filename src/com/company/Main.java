package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Parašyti metodą kuris suskaičiuoja kiek per parametrus paduotame žodyje yra
        //raidžių “a”. Prieš atliekant veiksmus patikrinti ar paduotas žodis yra skaičius, jei
        //skaičius, grąžinti 0.
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi");
        String zodis = sc.nextLine();
        int kiekis=0;




        boolean arSkaicius = false;
        try {
            Float.parseFloat("");
            arSkaicius = true;
        } catch (Exception klaida) {
        }
        if (arSkaicius == true) {
            System.out.println("Ivedete skaiciu");
        }
        if(arSkaicius == false){
            for (int i = 0; i < zodis.length(); i++)
            {
                char raide = zodis.charAt(i);
                if (raide == 'a' || raide == 'A') {
                    kiekis++;
                }

            }
        }
        System.out.println("A raidziu skaicius jusu zodyje: " + kiekis);
    }
        }

