package Eva;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько у вас котов?");
        Cats cats = new Cats();
        while (true) {
            cats.message();
            printMenu();
            int input = scanner.nextInt();

            if (input == 1) {
                cats.FoodToExactCat();
            }
            if (input == 2) {
                cats.foodToAllCats();
            }
            if (input == 3) {
                cats.evenCats();
            }
            if (input == 4) {
                break;
            } else System.out.println("Неверная команда");
        }
    }

    public static class Cats {
        Scanner scanner = new Scanner(System.in);
        int cat = scanner.nextInt();
        int[] catFood = new int[cat];


        public void message() {
            for (int i = 0; i < catFood.length; i++) {
                System.out.println("У кота №" + (i + 1) + " " + catFood[i] + " пакетиков еды.");
            }
        }

        public void FoodToExactCat() {
            System.out.println("Выберите номер кота");
            int catNumber = scanner.nextInt() - 1;
            if (catNumber > catFood.length || catNumber < 0) {
                System.out.println("Такого кота не существует");
            } else
            System.out.println("Выберите количество упаковок еды (Не более 7)");
            int addFood = scanner.nextInt();
            if (addFood < 0 || addFood > 7) {
                System.out.println("Введите другое количество упаковок (Не более 7)");
            } else
            catFood[catNumber] = addFood;
        }

        public void foodToAllCats() {
            System.out.println("Введите количество еды для всех котов:");
            int foodForAll = scanner.nextInt();
            if (foodForAll < 0 || foodForAll > 7) {
                System.out.println("Введите новое количество пакетиков с едой (Не более 7)");
            } else
            for (int i = 0; i < catFood.length; i++) {
                catFood[i] = foodForAll;
            }
        }
        public void evenCats() {
            System.out.println("1. Изменить количество еды у нечетных котов");
            System.out.println("2. Изменить количество еды у четных котов");
            int evenUnevenCat = scanner.nextInt();
            System.out.println("Введите новое количество пакетиков с едой (Не более 7)");
            int newFood = scanner.nextInt();
            if (newFood < 0 || newFood > 7) {
                System.out.println("Введите число не более 7");
            } else
            if (evenUnevenCat == 1) {
                for (int i = 0; i < catFood.length; i++) {
                    if (i % 2 == 0) {
                        catFood[i] = newFood;
                    }
                }
            }
            if (evenUnevenCat == 2) {
                for (int i = 0; i < catFood.length; i++) {
                    if (i % 2 != 0) {
                        catFood[i] = newFood;
                    }
                }
            } else System.out.println("Неверная команда");
        }
    }

    public static void printMenu() {
        System.out.println("1 - Добавить или убавить еду у кота");
        System.out.println("2 - Добавить или убавить еду у всех котов сразу");
        System.out.println("3 - Добавить или убавить еду у четных или нечетных котов");
        System.out.println("4 - Выйти из программы");
    }

}


