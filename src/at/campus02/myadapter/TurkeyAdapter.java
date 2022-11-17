package at.campus02.myadapter;

public class TurkeyAdapter implements Duck{
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.walk();
        turkey.walk();
    }

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
}
