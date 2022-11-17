package at.campus02.fernbedienungmanfred;

public class TVKanalRaufKommando implements Kommando{

    private TV tv;

    public TVKanalRaufKommando(TV tv) {
        this.tv = tv;
    }

    @Override
    public void ausfuhren() {
        if (tv.istEin() == false){
            tv.an();
            System.out.println("TVKanalRaufKommando: TV ist ausgeschaltet. Jetzt ist er an.");
        }else {
            tv.rauf();
        }
    }

    @Override
    public void undo() {
        tv.runter();
    }
}
