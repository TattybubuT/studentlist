import java.util.Random;

// Step 3. Создать класс Pet (питомец) с полями: age, color, shelter.
public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;



    //Создать getter-ы и setter-ы для полей класса
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    //Создать метод private int generateDefaultAge() и инициализировать поле age
    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(10)+1;
    }

    //Создать метод public String getInfo() который будет возвращать всю информацию по полям
    public String getInfo(){
        return "Pet info: \n" + "Age: "+age+"\nColor: "+color+"\nShelter: \n" + "Name: " + shelter.getName() + "\n Addres: " + shelter.getAddres();

    }
}
