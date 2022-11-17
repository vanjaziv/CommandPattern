package at.campus02.fernbedienungmanfred;

public class LichtAusKommando implements Kommando{

    private Licht licht;

    public LichtAusKommando(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void ausfuhren() {
        licht.aus();
    }

    @Override
    public void undo() {
        licht.an();
    }
}
