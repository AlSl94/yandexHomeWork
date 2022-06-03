package ru.yandex.Sprint.Sprint3.Lesson16_8_1;

// Унаследуйте класс от базового класса, описывающего контакт Contact
public class Address extends Contact {
    private final String city;
    private final String address;

    public Address(String name, String city, String address) {
        super(name);
        this.city = city;
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    // Метод sendMessage переопределяет метод базового класса
    @Override
    public void sendMessage() {
        System.out.println("Отправим открытку в город " + city + " по адресу: " + address);
    }

    @Override
    public void print() {
        System.out.println("Город: " + getCity());
        System.out.println("Адрес: " + getAddress());
    }

}
