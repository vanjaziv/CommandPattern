package at.campus02.kaffekueche;

public class Coffee extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("-Coffee: fuege Milch und Zucker hinzu.");
    }

    @Override
    protected void brew() {
        System.out.println("-Coffee: Espresso auf Herd erhitzen");
    }
}
