public class Sugar extends AddOns {
    public Sugar(Drinks drink) {
        super(drink);
    }

    @Override
    void setCost() {
        System.out.println("Add sugar-> "+drink.cost);
        cost = drink.cost+15;
    }
}
