public enum Month {
    JAN(31),
    FEB(28),
    MARCH(30),
    APRIL(31),
    MAY(30),
    JUNE(31),
    JULY(30),
    AUGUST(31),
    SEP(30),
    OKT(31),
    NOV(30),
    DEC(31);

    private int tage;

    Month(int tage){};

    public int getTage() {
        return tage;
    }
}
