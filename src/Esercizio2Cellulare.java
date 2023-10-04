import Eletronic.CellSim;

public class Esercizio2Cellulare {
    public static void main(String[] args){

        CellSim franco = new CellSim(0.00 );

        franco.info();
        franco.call(412412515 , 40);
        franco.call(782164515 , 23);
        franco.info();

    }

}
