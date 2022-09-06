public class Main {
    public static void main(String[] args) {
        //Задание 1
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = 0; i < 17; i=i+2) {
            System.out.println(i);
        }
        //Задание 2
        for (int i=1904; i<=2096; i=i+4) {
            System.out.println(i + " год является високосным");
        }
        for (int i=7; i<=98; i=i+7) {
            System.out.println(i);
        }
        for (int i=1; i<=512; i=i*2) {
            System.out.println(i);
        }
        //Задание 3
        //Пример из видео:
        int salary = 65_535; //зп
        int total = 0; //суммарная зп
        for (int i = 0; i <= 12; i++) { //годовой цикл
            total = total + total/100; //прибавляем процент накопления
            total = total + salary; //каждую зп складываем в сумму
            System.out.println(total); //выводим
            System.out.println("Месяц " + i + " Итого " + total); //помесячная динамика роста
        }
        /*
        1. Формула не очевидна
        2. Возможность увидеть промежуточные результаты вычислений
         */

        //Задача 3.1
        int invest = 29_000;
        int total2 = 0;
        for (int i=0; i<=12; i++) {
            total2 = total2 + invest;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, total2);
        }
        //Задача 3.2
        int invest3 = 29_000;
        int total3 = 0;
        for (int i=0; i<=12; i++) {
            total3 = total3 + (total3/100);
            total3 = total3 + invest3;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, total3);
        }

    }
}

