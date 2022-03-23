public  abstract class AddOns extends Drinks {
    Drinks drink;
    public AddOns(Drinks drink){
        this.drink = drink;
        setCost();
    }
    abstract void setCost();

}
