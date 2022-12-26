package inheritance.hierarchical;

public class MainClass {

    public static void main(String[] args) {

        ChineseRestaurant chineseRestaurant = new ChineseRestaurant();
        FrenchRestaurant frenchRestaurant = new FrenchRestaurant();

        chineseRestaurant.vegetables();
        frenchRestaurant.vegetables();
    }
}
