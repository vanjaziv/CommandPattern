package at.campus02.fernbedienungmanfred;

public class TVKanalRunterKommando implements Kommando{

    private TV tv;

    public TVKanalRunterKommando(TV tv) {
        this.tv = tv;
    }

    @Override
    public void ausfuhren() {
        if (tv.istEin() == false){
            tv.an();
            System.out.println("TVKanalRaufKommando: TV war ausgeschaltet.");
        }else {
            tv.runter();
        }
    }

    @Override
    public void undo() {
        tv.rauf();
    }
}
