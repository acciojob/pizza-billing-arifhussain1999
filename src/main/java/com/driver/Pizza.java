package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
int extraCheese=80;
   int extraToppingsVeg= 70;
    int extraToppingsnonVeg = 120;
    int away=20;
    int basePrice=0;

    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){basePrice=300;}
        else{basePrice=400;}
        price+=basePrice;
    }
    boolean takeAway=false;
    boolean addCheese=false;
    boolean addToppings=false;
    public int getPrice(){
       return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!addCheese)
        {
            this.price+=80;
            addCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!addToppings && isVeg){
            this.price+=70;
            addToppings=true;
        }else if (!addToppings && !isVeg)
        {
            this.price+=120;
            addToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            this.price+=20;
            takeAway=true;
        }
    }
boolean isGenerated=false;

    public String getBill(){
        // your code goes here
        if(!isGenerated){
            this.bill= "Base Price Of The Pizza: "+ basePrice+"\n";
            if(addCheese){
                bill+="Extra Cheese Added: "+extraCheese+"\n";
            }
            if(addToppings){
                if(isVeg){
                    bill+="Extra Toppings Added: "+extraToppingsVeg+"\n";
                }
                else{
                    bill+="Extra Toppings Added: " +extraToppingsnonVeg+"\n";
                }
            }
            if(takeAway){
                bill+="Paperbag Added: "+away+"\n";
            }
            bill += "Total Price: " + this.price;
            isGenerated=true;
        }

        return this.bill;
    }


}
