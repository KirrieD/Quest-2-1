public class Main {
    public static void main(String[] args) {
        int amount = 13_676; // Ввод рублей, можно вводить что угодно.
        boolean miles = amount >= 20; // Наличие бонусной мили: Да/Нет.

        int x; // Единичное значение мили.
        if (miles) {
            x = 1; // Если да.
        } else {
            x = 0; // Если нет.
        }

        int a = amount * x / 20; // Расчет бонусной мили.

        System.out.println("Мили : " + a); // Вывод итоговой бонусной мили.

        // Можно вводить любую сумму в графу 3, вывод будет корректен. Сверено с эталоном задачи, так же проверял
        // различные иные значения, вывод был корректен.
        // ЭТАЛОН: 13_676; ИТОГ: 683.
    }
}