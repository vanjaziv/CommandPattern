package at.campus02.myadapter;

public class StockEnte implements Duck{
    @Override
    public void quack() {
        System.out.println("StockEnte quack");
    }

    @Override
    public void fly() {
        System.out.println("StockEnte fly");
    }
}
