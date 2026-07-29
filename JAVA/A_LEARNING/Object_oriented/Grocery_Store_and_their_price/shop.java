package A_LEARNING.Object_oriented.Grocery_Store_and_their_price;
import java.util.*;

public class shop {
    shop(){
        ArrayList<Itemsandprices> abc = new ArrayList<>();
        System.out.println("\033[H\033[2J");

        abc.add(new Itemsandprices("Burger",74.99 ));
        abc.add(new Itemsandprices("Pizza", 69.99));

       for(Itemsandprices l : abc){
            l.shopinfo();
       }
    }

    public static void main(String[] args) {
        new shop();
    }
}
