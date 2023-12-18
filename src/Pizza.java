public class Pizza {
    private int price;
    private  Boolean veg;
    private  int extraCheesePrice = 100;
    private  int extraToppingAdded = 150;
    private  int backPack = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }
    public  void  addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppingAdded;
    }
    public void takeAway(){
        isForTakeAway = true;
        this.price += backPack;
    }
    public void getBill(){
        String bill = "";
        System.out.println("Pizza: " +basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese added: "+extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings added: "+extraToppingAdded+ "\n";
        }
        if(isForTakeAway){
            bill += "Extra Cheese added: "+backPack+ "\n";
        }
        bill += "Bill: "+this.price + "\n";
        System.out.println(bill);
    }
}
