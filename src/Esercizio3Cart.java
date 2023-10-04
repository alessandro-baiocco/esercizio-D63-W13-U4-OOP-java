import Ecommerce.Cart;
import Ecommerce.Client;
import Ecommerce.Item;

public class Esercizio3Cart {

    public static void main(String[] args){

        Item spazzolino = new Item("spazzolino" ,123 , 4 , "per denti" , 2 );
        Item coso = new Item("coso" ,153 , 8 , "???" , 4 );

        Client gianni = new Client("gianni" , "rossi" , "13/04/2001" , 1251251 , "gianni@gmail.com");
        Cart carrelloDiGianni = new Cart(1251251);


        carrelloDiGianni.info();

        gianni.putInCart(carrelloDiGianni , spazzolino , 2);
        gianni.putInCart(carrelloDiGianni , coso , 2);
        carrelloDiGianni.info();



    }

}
