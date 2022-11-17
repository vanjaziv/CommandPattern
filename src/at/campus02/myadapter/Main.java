package at.campus02.myadapter;

public class Main {
    public static void main(String[] args) {
        Duck d1 = new StockEnte();
        d1.quack();

        BigTurkey t1 = new BigTurkey();
        t1.gobble();

        Duck adaptierteEnte = new TurkeyAdapter(t1);
        adaptierteEnte.quack();
        adaptierteEnte.fly();
    }
}
