package Ecommerce;
import Ecommerce.Item;

import java.util.Arrays;

public class Cart {

        private int codeCl;
        private String[] list;
        private double total;

        //costruttore
        public Cart(int codeCl ){
            this.codeCl = codeCl;
            this.list = new String[10];
        }

        public void addToCart(Item ogg , int quantity){
            String toAdd = "prodotto : " + ogg.code + " quantità : " + quantity + " prezzo : " + (ogg.price * quantity);
            for(int i = 9 ; i >= 0 ; i--){
                if(i == 0){
                    this.list[i] = toAdd;
                }else {
                    this.list[i] = this.list[i - 1];
                }

            }
            this.total += (ogg.price);
            System.out.println("il totale è : " + this.total);
            ogg.minusOne(quantity);


        }

        public void info(){
            System.out.println(Arrays.toString(this.list));
        }





    }
