public class unemployed {
    private String State;
    private String AreaName;
    private double Unemployed_2007;
    private double Unemployed_2008;
    private double Unemployed_2009;
    private double Unemployed_2010;
    private double Unemployed_2011;
    private double Unemployed_2012;
    private double Unemployed_2013;
    private double Unemployed_2014;
    private double Unemployed_2015;
    private double Unemployed_2016;
    private double Unemployed_2017;

    public unemployed(String state, String areaName, double unemployed_2007,
                      double unemployed_2008, double unemployed_2009, double unemployed_2010,
                      double unemployed_2011, double unemployed_2012, double unemployed_2013,
                      double unemployed_2014, double unemployed_2015, double unemployed_2016,
                      double unemployed_2017) {
        State = state;
        AreaName = areaName;
        Unemployed_2007 = unemployed_2007;
        Unemployed_2008 = unemployed_2008;
        Unemployed_2009 = unemployed_2009;
        Unemployed_2010 = unemployed_2010;
        Unemployed_2011 = unemployed_2011;
        Unemployed_2012 = unemployed_2012;
        Unemployed_2013 = unemployed_2013;
        Unemployed_2014 = unemployed_2014;
        Unemployed_2015 = unemployed_2015;
        Unemployed_2016 = unemployed_2016;
        Unemployed_2017 = unemployed_2017;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String areaName) {
        AreaName = areaName;
    }

    public double getUnemployed_2007() {
        return Unemployed_2007;
    }

    public void setUnemployed_2007(double unemployed_2007) {
        Unemployed_2007 = unemployed_2007;
    }

    public double getUnemployed_2008() {
        return Unemployed_2008;
    }

    public void setUnemployed_2008(double unemployed_2008) {
        Unemployed_2008 = unemployed_2008;
    }

    public double getUnemployed_2009() {
        return Unemployed_2009;
    }

    public void setUnemployed_2009(double unemployed_2009) {
        Unemployed_2009 = unemployed_2009;
    }

    public double getUnemployed_2010() {
        return Unemployed_2010;
    }

    public void setUnemployed_2010(double unemployed_2010) {
        Unemployed_2010 = unemployed_2010;
    }

    public double getUnemployed_2011() {
        return Unemployed_2011;
    }

    public void setUnemployed_2011(double unemployed_2011) {
        Unemployed_2011 = unemployed_2011;
    }

    public double getUnemployed_2012() {
        return Unemployed_2012;
    }

    public void setUnemployed_2012(double unemployed_2012) {
        Unemployed_2012 = unemployed_2012;
    }

    public double getUnemployed_2013() {
        return Unemployed_2013;
    }

    public void setUnemployed_2013(double unemployed_2013) {
        Unemployed_2013 = unemployed_2013;
    }

    public double getUnemployed_2014() {
        return Unemployed_2014;
    }

    public void setUnemployed_2014(double unemployed_2014) {
        Unemployed_2014 = unemployed_2014;
    }

    public double getUnemployed_2015() {
        return Unemployed_2015;
    }

    public void setUnemployed_2015(double unemployed_2015) {
        Unemployed_2015 = unemployed_2015;
    }

    public double getUnemployed_2016() {
        return Unemployed_2016;
    }

    public void setUnemployed_2016(double unemployed_2016) {
        Unemployed_2016 = unemployed_2016;
    }

    public double getUnemployed_2017() {
        return Unemployed_2017;
    }

    public void setUnemployed_2017(double unemployed_2017) {
        Unemployed_2017 = unemployed_2017;
    }

    @Override
    public String toString() {
        return
                "State: " + State + "\n" +
                "AreaName: " + AreaName + "\n" +
                 Unemployed_2007 +
                ", " + Unemployed_2008 +
                ", " + Unemployed_2009 +
                ", " + Unemployed_2010 +
                ", " + Unemployed_2011 +
                ", " + Unemployed_2012 +
                ", " + Unemployed_2013 +
                ", " + Unemployed_2014 +
                ", " + Unemployed_2015 +
                ", " + Unemployed_2016 +
                ", " + Unemployed_2017
                ;
    }
}
