public class MainClass {
    public static void main(String[] args) {

        // Создать переменные всех пройденных типов данных, и инициализировать их значения
        // Целочисленные типы данных
        byte a = 1;
        short b = 2;
        int c = 4;
        long d = 884523114453L;

        //Числовые типы данных с плавающей точкой
        float f = 4.0f;
        double e = 8.0;

        //Символьный тип данных
        char ch = 'h';

        System.out.println(func1(5,2, 10, 4));

        System.out.println(inBorder(5,7));

        isPositive(15);

        System.out.println(isNegative(-26));

        sayHello("Влад");

        isLeapYear(400);
    }

        // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        // где a, b, c, d – входные параметры этого метода

        public static double func1 (double a, double b, double c, double d){
            return a * (b + (c / d));
        }


        // Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
        // от 10 до 20(включительно), если да – вернуть true, в противном случае – false

        public static boolean inBorder (int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <=20);
        }


        // Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
        // в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

        public static void isPositive (int x) {
        if (x >= 0){
            System.out.println("Число " + x + " положительное");
        }
        else {
            System.out.println("Число " + x + " отрицательное");
        }
        }

        // Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное

        public static boolean isNegative(int x){
            return x < 0;
        }


        // Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        // метод должен вывести в консоль сообщение «Привет, указанное_имя!»

        public static void sayHello(String name){
            System.out.println("Привет, " + name + "!");
        }
        // Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        public static void isLeapYear (int year){
            if (year %4 == 0 && year %100 != 0 || year %400 ==0){
                System.out.println("Год " + year + " является високосным");
            }
            else {
                System.out.println("Год " + year + " не является високосным");
            }
        }



}
