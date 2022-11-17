package at.campus02.kaffekueche;

public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected void pourInCup() {
        System.out.println("Giesze in Haeferl");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Koche Wasser");
    }

}
