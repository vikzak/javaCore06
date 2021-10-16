package animal;


public class Cat extends Animals{
    public static int countCats = 0;
    public Cat(String name, int age, int run, int swim) {
        super(name, age, run, swim);
        countCats++;
    }

    public void catInfo(String name, int age, int run, int swim) {
        System.out.println("Кот: " + name + ", возраст: " + age + ", пробежал: " + run + "м., проплыл: " + swim);
    }
    public void catRun(int run){
        if (run < 200) System.out.println("Кот: " + name + ", пробежал: " + run + "м.");
        else System.out.println("Кот: " + name + ", пробежать " + run + "м. не может - устал");
    }


}

