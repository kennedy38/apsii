public class TestePizza {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();

        System.out.println("=== NOVA YORK ===");
        nyStore.orderPizza("queijo");
        nyStore.orderPizza("mariscos");

        System.out.println("=== CHICAGO ===");
        PizzaIngredientFactory chicagoFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizzaChicago = new CheesePizza(chicagoFactory);
        pizzaChicago.setName("Pizza de Queijo no Estilo de Chicago");
        pizzaChicago.prepare();
        pizzaChicago.bake();
        pizzaChicago.cut();
        pizzaChicago.box();

        System.out.println("Massa: " + chicagoFactory.createDough());
        System.out.println("Molho: " + chicagoFactory.createSauce());
        System.out.println("Queijo: " + chicagoFactory.createCheese());
        System.out.println("Mariscos: " + chicagoFactory.createClam());
    }
}
