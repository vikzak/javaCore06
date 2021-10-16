package animal;

public abstract class Animals {
    public static int countAnimals = 0;
    protected String name;
    protected int age;
    protected int run;
    protected int swim;

    public Animals(String name, int age, int run, int swim) {
        this.name = name;
        this.age = age;
        this.run = run;
        this.swim = swim;
        countAnimals++;
    }

    public Animals() {

    }

    public void animalInfo(String name, int age, int run, int swim){
        if (swim == 0) System.out.println("Имя животного: " + name + ", возраст: " + age + ", пробежал: " + run + "м. и не стал пыть");
        else System.out.println("Имя животного: " + name + ", возраст: " + age + ", пробежал: " + run + "м., проплыл: ");
    }


}
