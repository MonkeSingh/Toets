
public abstract class Parkeerplaats {
    private boolean bezet = false;
    private String type;
    private String gereserveerdeNaam;

    private int parkeerplaatsNummer;

    public Parkeerplaats(String type, int parkeerplaatsNummer) {
        this.type = type;
        this.parkeerplaatsNummer = parkeerplaatsNummer;
    }

    public void reserveer() {
        this.bezet = true;
    }

    public void geefVrij() {
        this.bezet = false;
    }

    public boolean isBezet() {
        return this.bezet;
    }

    public String getType() {
        return type;
    }

    public String getGereserveerdOnder() {
        return this.gereserveerdeNaam;
    }

    public void setGereserveerdeNaam(String gereserveerdeNaam) {
        this.gereserveerdeNaam = gereserveerdeNaam;
    }

    public int getParkeerplaatsNummer() {
        return parkeerplaatsNummer;
    }
}
