
import java.util.ArrayList;

public class ParkeerplaatsManager {

    private final Logger logger = new Logger();

    private ArrayList<Parkeerplaats> parkeerplaatsen;

    public ParkeerplaatsManager() {
        //maken van een Seeder 
        //parkeerplaatssen arraylist vullen met parkeerplaatsen uit de seeder
    }


    public void reserveerParkeerplaats(ReserveringStandaard reservering) throws GeenBeschikbareParkeerplekExceptie {
        //functie afmaken
    }

    public void reserveerParkeerplaats(ReserveringElektrisch reservering) throws GeenBeschikbareParkeerplekExceptie {
       //functie afmaken
    }

    private Parkeerplaats krijgParkeerplaats(String type) throws GeenBeschikbareParkeerplekExceptie {
        //functie afmaken
    }

    //Laten staan niet aanpassen
    private void printReservering(Parkeerplaats parkeerplaats){
        System.out.println("De reservering onder naam " + parkeerplaats.getGereserveerdOnder()
                + " is gereserveerd voor parkeerplek " + parkeerplaats.getParkeerplaatsNummer() + " van het type " + parkeerplaats.getType());
    }

    //Laten staan niet aanpassen
    public ArrayList<Parkeerplaats> getParkeerplaatsen() {
        return parkeerplaatsen;
    }

}
