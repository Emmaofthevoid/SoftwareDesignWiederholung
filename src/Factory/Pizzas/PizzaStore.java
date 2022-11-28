package Factory.Pizzas;

public abstract class PizzaStore {

    public Pizza createPizza(PizzaTypes pizzaType) {
        Pizza pizza;

        if (pizzaType == PizzaTypes.LACHS) {
            return new LachsPizza();
        }
        return null;
    }
}
