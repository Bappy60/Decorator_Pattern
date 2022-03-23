public class Milk extends AddOns {
    public Milk(Drinks drink) {
        super(drink);
    }

    @Override
    void setCost() {
        System.out.println("Add Milk-> "+drink.cost);
        cost=drink.cost+10;

    }
}
