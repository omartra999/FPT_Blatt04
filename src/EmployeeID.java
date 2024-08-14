public class EmployeeID {
    private String vorname;
    private String nachname;
    private Birthday birthday;
    private Address address;
    private final int UID;
    private SecurityAccessLevel accessLevel;

    public EmployeeID(String vorname, String nachname, Address address, Birthday birthday, int UID, SecurityAccessLevel accessLevel){
        this.vorname = vorname;
        this.nachname = nachname;
        this.address = address;
        this.birthday = birthday;
        this.UID = UID;
        this.accessLevel = accessLevel;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public int getUID() {
        return UID;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }
    public SecurityAccessLevel getAccessLevel(){
       return this.accessLevel;
    }



    @Override
    public String toString() {
        return "EmployeeID{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", birthday=" + birthday +
                ", address=" + address +
                ", UID=" + UID +
                '}';
    }
}
