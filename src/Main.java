public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan"; //инициализация "имя"
        String middleName = "Ivanovich"; //инициализация "отчество"
        String lastName = "Ivanov"; //инициализация "фамилия"
        String fullName = lastName + " " + firstName + " " + middleName; //создание строки для хранения ФИО в формате Фамилия Имя Отчество
        System.out.println("ФИО сотрудника - " + fullName);

    }
    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich"; //инициализация ФИО сотрудника
        System.out.println("Данные ФИО сотрудника для заполнения отчета  - " + fullName.toUpperCase()); // вывод результата с использованием метода преобразования всех знаков в верхний регистр
    }
    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович"; //инициализация ФИО сотрудника
        fullName = fullName.replace("ё", "е"); //замена буквы "ё" на "ё"
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}