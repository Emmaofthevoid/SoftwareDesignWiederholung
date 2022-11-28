package Factory.Pizzas;

public class PizzaStoreWien extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaTypes pizzaType) {
        Pizza pizza = super.createPizza(pizzaType);
        if (pizza != null) {
            return pizza;
        } else if (pizzaType == PizzaTypes.CHEESE) {
            System.out.println("New Cheese Pizza");
            return new CheesePizza();
        } else {
            System.out.println("No pizza from Wien");
            return null;
        }
    }
}
