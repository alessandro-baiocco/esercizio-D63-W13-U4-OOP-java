package Ecommerce;

public class Item {

        private String description;
        public int code;
        public int quantity;
        public double price;

        //costruttore
        public Item(int code , int quantity , String description , double price){
            this.code = code;
            this.quantity = quantity;
            this.price = price;
            this.description = description;
        }


        public void minusOne(int minusQuantity){
            this.quantity -= minusQuantity;
        }
    public void plusOne(int addQuantity){
        this.quantity += addQuantity;
    }




}



