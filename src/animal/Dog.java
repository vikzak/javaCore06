package animal;

public class Dog extends Animals{
    public static int countDogs = 0;
    public Dog(String name, int age, int run, int swim) {
        super(name, age, run, swim);
        countDogs++;
    }
    public void dogInfo(String name, int age, int run, int swim) {
        System.out.println("Пёс: " + name + ", возраст: " + age + ", пробежал: " + run + "м., проплыл: " + swim);
    }
    public void dogRun(int run){
        if (run < 500) System.out.println("Пёс: " + name + ", пробежал: " + run + "м.");
        else System.out.println("Пёс: " + name + ", пробежать " + run + "м. не может - устал");
    }
}
