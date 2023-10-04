package Ecommerce;

public class Client {
    private String name;
    private String surname;
    private int codeCl;
    private String email;
    private String iscriptionDate;

    //costruttore
    public Client(String name, String surname, String iscriptionDate, int codeCl, String email) {
        this.codeCl = codeCl;
        this.name = name;
        this.surname = surname;
        this.iscriptionDate = iscriptionDate;
        this.email = email;
    }


    public  void putInCart(Cart MyCart ,Item ogg ,  int quantity){
        MyCart.addToCart(ogg , quantity);

    }



}



