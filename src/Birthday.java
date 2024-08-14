//final because of constant dates in real life
//must implement a constructor which sets values to the attributes in final classes
// or directly give the attributes values which does not work in this case
// as the attributes are final no setter methods can be done
public final class Birthday {
    private final int tag;
    private final int jahr;
    private final Month month;

    public Birthday(int tag, int jahr, Month month){
        //check if the birthday is valid
        if (tag < 1 || tag > month.getTage() || jahr < 1961 || jahr >= 2007){
            throw new IllegalArgumentException();
        }
        this.tag = tag;
        this.month = month;
        this.jahr = jahr;
    }

    public Month getMonth() {
        return month;
    }

    public int getJahr() {
        return jahr;
    }

    public int getTag() {
        return tag;
    }
}
