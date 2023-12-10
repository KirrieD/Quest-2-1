public class Main {
    public static void main(String[] args) {
        int amount = 13_676; // Ввод рублей, можно вводить что угодно.
        boolean miles = amount >= 20; // Наличие бонусной мили: Да/Нет.
        int condition; // Единичное значение мили.
        if (miles) {
            condition = 1; // Если да.
        } else {
            condition = 0; // Если нет.
        }
        int result = amount * condition / 20; // Расчет бонусной мили.
        System.out.println("Мили : " + result); // Вывод итоговой бонусной мили.
    }
}