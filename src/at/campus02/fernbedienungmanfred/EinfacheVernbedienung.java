package at.campus02.fernbedienungmanfred;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class EinfacheVernbedienung {

    Map<Integer, Kommando> slots = new HashMap<Integer, Kommando>();
    //private Kommando slot1;
    private Stack<Kommando> history = new Stack<>();

    public void setKommando(Integer slotnummer, Kommando k){
        slots.put(slotnummer, k);
    }

    public void knopfGedrueckt(Integer slotnummer){
        if (slots.containsKey(slotnummer)){
            Kommando k = slots.get(slotnummer);
            k.ausfuhren();
            history.push(k); // history befüllen
        }else { // Slot existieren nich
            System.out.println("EinfacheVernbedinung: ERROR: slot " + slotnummer + " nicht vergeben.");
        }
    }
    public void undoVernbedinung(){
        System.out.println("UNDO aufrufen");
        if (history.isEmpty()){
            System.out.println("Fernbedinung: ERROR: History ist leer");
        }
        Kommando letztesk = history.pop(); // vom Stapel geholt
        letztesk.undo(); // undo it
        //history.pop().undo();
    }
}
