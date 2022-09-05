public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
//        int price = 10_000; т.к. расчеты ведутся в отдельном классе.
        int miles = service.calculate();
        System.out.println(miles);
    }
}