import Ecommerce.Cart;
import Ecommerce.Client;
import Ecommerce.Item;

public class Esercizio3Cart {

    public static void main(String[] args){

        Item spazzolino = new Item(123 , 4 , "per denti" , 2 );

        Client gianni = new Client("gianni" , "rossi" , "13/04/2001" , 1251251 , "gianni@gmail.com");
        Cart carrelloDiGianni = new Cart(1251251);

        carrelloDiGianni.addToCart(spazzolino , 2);
        carrelloDiGianni.info();


    }

}
