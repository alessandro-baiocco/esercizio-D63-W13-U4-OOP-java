package Ecommerce;

public class Item {
        String name;
        private String description;
        int code;
        int quantity;
        double price;

        //costruttore
        public Item(String name ,int code , int quantity , String description , double price){
            this.name = name;
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



