public class employed {
    private String State;
    private String county;
    private int fips;
    private int totalLaborForce;
    private int employedLaborForce;
    private int unemployedLaborForce;
    private double unemployedPercent;

    public employed(String state, String county, int fips, int totalLaborForce, int employedLaborForce, int unemployedLaborForce, double unemployedPercent) {
        State = state;
        this.county = county;
        this.fips = fips;
        this.totalLaborForce = totalLaborForce;
        this.employedLaborForce = employedLaborForce;
        this.unemployedLaborForce = unemployedLaborForce;
        this.unemployedPercent = unemployedPercent;
    }

}
