public class BonusMileService {
    public int calculate(int price) {
        int rubblesForMile = 20;
        // количество рублей за одну бонусную милю
        int miles;
        miles = price / rubblesForMile;
        //расчет бонусов
        return miles;
    }
}
