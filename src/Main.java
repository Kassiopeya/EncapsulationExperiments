public class Main {
    public static void main(String[] args) {
        Country country = new Country("Италия");
        country.setCapitalName("Париж");
        country.setSquare(11);
        System.out.println("Название страны: " + country.capitalName);
        System.out.println("Площадь страны: " + country.square);
    }
}