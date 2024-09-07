package TareaFactoryMethod;

public class Main {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();

        IFruta fruta = fruitFactory.provideFruit("manzana");
        fruta.producirJugo();
        fruta = fruitFactory.provideFruit("naranja");
        fruta.producirJugo();
        fruta = fruitFactory.provideFruit("banana");
        fruta.producirJugo();
    }
}
