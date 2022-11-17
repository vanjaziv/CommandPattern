package at.campus02.kaffekueche;

public class Tee extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("-Tee: Fuege Zitronensaft hinzu");
    }

    @Override
    protected void brew() {
        System.out.println("-Tee: Tee werden im Wasser gebrücht");
    }
}
