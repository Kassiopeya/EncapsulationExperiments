public class Country {
    String countryName;
    int population = 112;
    double square = 111444.4;
    String capitalName = "ТИБОмвм";
    boolean accessToSea = true;


    public Country(String countryName){
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }

    public double getSquare() {
        return square;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public boolean getIsAccessToSea() {
        return accessToSea;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setAccessToSea(boolean accessToSea) {
        this.accessToSea = accessToSea;
    }

}
