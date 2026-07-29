package A_LEARNING.Object_oriented.Grocery_Store_and_their_price;

public class Itemsandprices {
    String items;
    double price;

    public Itemsandprices(String it, double rs){
        this.items = it;
        this.price = rs;
    }

    public void shopinfo(){
        System.out.println(items+", Rs"+price);
    }
}
