public class Coins {
    private int quantityOnHand;
    private float denomination;
    private float weight;

    public Coins(float d, float w){
        denomination = d;
        weight = w;
    }

    public float getTotalWeight(){
        float totalWeight = weight * quantityOnHand;
        return totalWeight;
    }

    public float getTotalValue(){
        float totalValue = denomination * quantityOnHand;
        return totalValue;
    }

    public int increaseQuantity(int quantity){
        quantityOnHand = quantityOnHand + quantity;
        return quantityOnHand;
    }

    public int decreaseQuantity (int quantity){
        quantityOnHand = quantityOnHand - quantity;

        if(quantityOnHand < 0){
            quantityOnHand = 0;
        }

        return quantityOnHand;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public String printPretty (float amount){
        return ("$" + String.format("%4.2f",amount));
    }

    @Override
    public String toString(){
        return "$" + getTotalValue() + " in $" + denomination + " coins";
    }
}
