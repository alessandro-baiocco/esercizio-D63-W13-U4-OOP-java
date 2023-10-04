package geometricForm;


public class MyRectangle {
    private String name;
      private int heigth;
      private int width;

      //costruttore
    public MyRectangle(int width , int heigth , String name){
        this.heigth = heigth;
        this.width = width;
        this.name = name;
    }


      //setters
      public void altezza(int h){
          this.heigth = h;
      }
      public void lungezza(int w){
          this.width = w;
      }
      // getters
        public void info(){
            System.out.println("la mia altezza è :" + this.heigth + "cm , sono lungo" + width + "cm");
        }

        // calcolo area e perimetro
        public void stampaRettangolo(){
            System.out.println("l'area è :" + this.width * this.heigth + "cm^2");
            System.out.println("il perimetro è : "  + ((this.width * 2) + (this.heigth * 2)) + " cm");
        }

        public void stampa2Rettangoli(MyRectangle second){
            System.out.println("l'area di " + this.name +  " : " + this.width * this.heigth + "cm^2");
            System.out.println("il perimetro di " + this.name + " è : "  + ((this.width * 2) + (this.heigth * 2)) + " cm");
            System.out.println("l'area di " + second.name +  "  :" + second.width * second.heigth + "cm^2");
            System.out.println("il perimetro di " + second.name +  " è : "  + ((second.width * 2) + (second.heigth * 2)) + " cm");

        }

}
