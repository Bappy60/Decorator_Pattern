public class MainClass {
    public static void main(String[] args) {
        Drinks tea = new Milk(new Sugar (new Sugar(new Tea())));
        System.out.println(tea.cost);

        Drinks coffee = new Milk(new Sugar(new Espresso()));
        System.out.println(coffee.cost);
    }
}
