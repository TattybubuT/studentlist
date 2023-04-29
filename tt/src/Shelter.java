// Step 2. Создать класс Shelter (приют) с полями: name, address.
public class Shelter {
    private String name;
    private String addres;

    //Создать getter-ы для полей класса
    public String getName() {
        return name;
    }

    public String getAddres() {
        return addres;
    }

    //Создать конструктор для инициализации полей класса
    public Shelter(String name, String address) {
        this.name = name;
        this.addres = address;
    }
}

