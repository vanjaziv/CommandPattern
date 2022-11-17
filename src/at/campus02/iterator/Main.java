package at.campus02.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> meineListe = new ArrayList<>();
        meineListe.add("a");
        meineListe.add("b");
        meineListe.add("c");

        System.out.println("Inhalt von meineListe:");

        for (String listElement: meineListe){
            System.out.println("Eintrag: " + listElement);
        }

        ZamList meineZamListe = new ZamList("Hallo liebe ZAM es ist Nachmittag....");

        int i = 0;
        for (String listElement: meineZamListe){
            System.out.println("Eintrag: " + i++ + ": " + listElement);
        }



    }
}
