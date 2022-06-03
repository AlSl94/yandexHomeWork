package ru.yandex.Sprint.Sprint2.Lesson11_1;

import java.util.ArrayList;

public class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things = new ArrayList<>();
    // реализуйте метод put()

    public void put(Object element) {
        things.add(element);
     }

    // реализуйте метод check()

    public boolean check(Object target) {
        if (target == null) {
            return false;
        } else
            for (Object object : things) { // логика проверки вещи в списке
            if(object.equals(target)) {
                return true;
            }
        }
            return false;
    }
}
