public class BonusMilesService {
    public int calculate() {
        int price = 50_000; // объявил переменную стоимость билета
        int base = 20; // объявил переменную базы
        int miles = price / base;
        return miles; // отдаем значение в main
    }
}
