
import java.util.ArrayList;

public class ParkeerplaatsSeeder {

    public ArrayList<Parkeerplaats> maakParkeerplaatsenAan(){
        ArrayList<Parkeerplaats> parkeerplaatsen = new ArrayList<>();

        parkeerplaatsen.add(new ParkeerplekStandaard(1));
        parkeerplaatsen.add(new ParkeerplekStandaard(2));
        parkeerplaatsen.add(new ParkeerplekStandaard(3));
        parkeerplaatsen.add(new ParkeerplekStandaard(4));

        parkeerplaatsen.add(new ParkeerplekMetLader(5, 75));
        parkeerplaatsen.add(new ParkeerplekMetLader(6, 50));

        return parkeerplaatsen;
    }
}
