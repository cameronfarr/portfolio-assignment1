public class Notes {
    private int quantityOnHand;
    private int denomination;

    public Notes(int d){
        denomination = d;
    }

    public int getTotalValue(){
        int totalValue =  denomination * quantityOnHand;
        return totalValue;
    }

    public int increaseQuantity(int quantity){
        quantityOnHand = quantityOnHand + quantity;
        return quantityOnHand;
    }

    public int decreaseQuantity(int quantity){
        quantityOnHand = quantityOnHand - quantity;

        if(quantityOnHand < 0){
            quantityOnHand = 0;
        }

        return quantityOnHand;
    }

    public int getQuantityOnHand(){
        return quantityOnHand;
    }

    public String printPretty(float amount){
        return("$"+String.format("%4.2f",amount));
    }

    @Override
    public String toString(){
        return "$" + getTotalValue() + " in $" + denomination + " notes";
    }

}
