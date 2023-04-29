import java.util.ArrayList;
import java.util.Arrays;

// Step 4. Создать класс Dog наследуя его от Pet с полями: name, breed, commands.
public final class Dog extends Pet{
    private String name;
    private String breed;
    private String[] commands;

    //Создать getter-ы и setter-ы для полей класса
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog(){
    }

    //Создать 3 конструктора (1. по-умолчанию, 2. name, breed, color, shelter 3. name, breed, color, shelter, commands)
    public Dog(String name, String breed, Color color, Shelter shelter){
        this.name = name;
        this.breed= breed;
        super.setShelter(shelter);
        super.setColor(color);
    }
    public Dog(String name, String breed,String[] commands,Color color, Shelter shelter ){
        this.name = name;
        this.breed= breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setColor(color);
    }

    //Создать 3 перегруженных метода void makeVoice(String voice, int number)
    public void makeVoice(){
        System.out.println("Gav-Gav");
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }


    //Создать метод public String getInfo() который перезапишет метод родительского класса и будет возвращать всю информацию по полям
    @Override
    public final String getInfo(){
        return super.getInfo() + "\nName: " + name + "\nBreed: "+ breed + "\nCommands: " + Arrays.toString(commands);
    }

}
