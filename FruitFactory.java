package TareaFactoryMethod;

public class FruitFactory {
    public IFruta provideFruit(String fruit) {
        return switch (fruit) {
            case "manzana" -> new Manzana();
            case "naranja" -> new Naranja();
            case "banana" -> new Banana();
            default -> null;
        };
    }
}
