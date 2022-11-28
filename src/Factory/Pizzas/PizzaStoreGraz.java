package Factory.Pizzas;

public class PizzaStoreGraz extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaTypes pizzaType) {
        Pizza pizza = super.createPizza(pizzaType);
        if (pizza != null) {
            return pizza;
        } else if (pizzaType == PizzaTypes.VEGAN) {
            return new VeganPizza();
        } else {
            System.out.println("No pizza could be made from Graz.");

            return null;
        }
    }
}
