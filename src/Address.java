public final class Address {
    private final String strasse;
    private final String stadt;
    private final int hausnummer;
    private final int plz;

    public Address(String strasse, String stadt, int hausnummer, int plz){
        if (plz > 99999 || plz < 10000){
            throw new IllegalArgumentException();
        }
        this.plz = plz;
        this.hausnummer = hausnummer;
        this.stadt = stadt;
        this.strasse = strasse;
    }

    public int getPlz() {
        return plz;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public String getStadt() {
        return stadt;
    }
}
