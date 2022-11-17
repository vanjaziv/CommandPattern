package at.campus02.fernbedienungmanfred;

public class LichtAnKommando implements Kommando{

    private Licht licht;

    public LichtAnKommando(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void ausfuhren() {
       licht.an();
    }

    @Override
    public void undo() {
        licht.aus();
    }
}
