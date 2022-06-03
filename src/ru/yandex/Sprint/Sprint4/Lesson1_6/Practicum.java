package ru.yandex.Sprint.Sprint4.Lesson1_6;

public class Practicum {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3, 4, 6, 8};
        int[] array2 = new int[]{1, 2, 3, 8, 9};
        int[] resultArray = merge(array1, array2);

        for (int e : resultArray) {
            System.out.print(e + ", ");
        }
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {

        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int[] resultArray = new int[leftSize + rightSize];

        // Индексы, по которым идёт итерация
        int left = 0;
        int right = 0;
        int index = 0;

        while (index < resultArray.length) {

            // Если левый индекс больше максимального левого индекса — добавляем элемент из правого подмассива.
            if (left >= leftSize) {
                resultArray[index] = rightArray[right];
                right++;
            }

            // Если правый индекс больше максимального — добавляем элемент из левого подмассива.
            else if (right >= rightSize) {
                // !!! Добавьте ваш код
                resultArray[index] = leftArray[left];
                left++;
            }

            // Если оба текущих индекса внутри своих границ, нужно сравнивать элементы по этим индексам
            // Если элемент в левом массиве меньше — добавляем его и увеличиваем левый индекс.
            else if (leftArray[left] <= rightArray[right]) {
                resultArray[index] = leftArray[left];
                left++;
            }
            // Иначе — делаем тоже самое с правым индексом.
            else {
                // !!! Добавьте ваш код
                resultArray[index] = rightArray[right];
                right++;
            }
            index++;
        }
        return resultArray;
    }
}