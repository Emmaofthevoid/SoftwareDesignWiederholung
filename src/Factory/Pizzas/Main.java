package Factory.Pizzas;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStoreGraz();
        PizzaStore pizzaStore1 = new PizzaStoreWien();


        pizzaStore.createPizza(PizzaTypes.LACHS);
        pizzaStore1.createPizza(PizzaTypes.CHEESE);
    }
}
