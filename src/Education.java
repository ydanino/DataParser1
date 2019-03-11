public class Education {

    private String State;
    private String county;
    private int fips;
    private double noHighSchool;
    private double onlyHighSchool;
    private double someCollege;
    private double bachelorsOrMore;

    public Education(String state, String county, int fips, double noHighSchool, double onlyHighSchool, double someCollege, double bachelorsOrMore) {
        State = state;
        this.county = county;
        this.fips = fips;
        this.noHighSchool = noHighSchool;
        this.onlyHighSchool = onlyHighSchool;
        this.someCollege = someCollege;
        this.bachelorsOrMore = bachelorsOrMore;
    }
}
