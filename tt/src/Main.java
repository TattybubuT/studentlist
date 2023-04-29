// Step 5. В классе Main создать 3х Собак тремя разными конструкторами
//Распечатать всю информацию о Собаках
//Распечатать лай собак 3мя разными методами makeVoice
public class Main {
    public static void main(String[] args) {

        String[] commands = {"SiteDown", "StandUp"};
        Shelter shelter = new Shelter("Romashka","Zhal 5");

        Dog dog = new Dog("Rex","Ovcharka",Color.BLACK,shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Giv Giv");
        dog.makeVoice("Guv Guv");
    }
}

