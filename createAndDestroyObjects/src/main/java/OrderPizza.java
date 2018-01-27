
public class OrderPizza {


    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SCHINKEN)
                .addTopping(Pizza.Topping.ZWIEBELN)
                .build();

        System.out.println(pizza.toString());
        System.out.println(pizza.toppings);
    }
}
