package at.campus02.fernbedienungmanfred;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fernbedienung Manfred starting...");

        EinfacheVernbedienung fb = new EinfacheVernbedienung();
        Licht licht = new Licht(); // Licht ist unsere Empfänger

        LichtAnKommando lichtAnKommando = new LichtAnKommando(licht);
        LichtAusKommando lichtAusKommando = new LichtAusKommando(licht);

        TV tv = new TV();
        // System.out.println("TV: ist eingeschaltet? " + tv.istEin());
        // tv.an();
        // System.out.println("TV: ist eingeschaltet? " + tv.istEin());
        // System.out.println("TV: welche Kanal? " + tv.getKanal());
        // tv.rauf();
        // tv.rauf();
        // tv.setKanal(30);

        fb.setKommando(1,lichtAnKommando);
        fb.knopfGedrueckt(1);
        fb.undoVernbedinung();
        fb.undoVernbedinung();

        // unprogrammieren
        fb.setKommando(2, lichtAusKommando);
        fb.knopfGedrueckt(2);

        fb.setKommando(3,new TVKanalRaufKommando(tv));
        fb.setKommando(4,new TVKanalRunterKommando(tv));
        fb.knopfGedrueckt(3);
        fb.knopfGedrueckt(3);
        fb.knopfGedrueckt(4);
        fb.knopfGedrueckt(4);
        fb.knopfGedrueckt(5);

    }
}
