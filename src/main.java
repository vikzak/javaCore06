
import animal.Animals;
import animal.Cat;
import animal.Dog;

public class main {
    public static void main(String[] args) {
        //изначально создаю новорожденных с нулевыми значениями))
        Cat cat1 = new Cat("Vasya1",0,0, 0);
        Cat cat2 = new Cat("Vasya2",0,0, 0);
        Dog dog1 = new Dog("Bobik1",0,0, 0);
        Dog dog2 = new Dog("Bobik2",0,0, 0);
        Animals cat3 = new Cat("Vasya3",1,1, 0);

        // передадим параметры кота1: Вася1, 7 лет, пробежал 5м, проплыл 0
        cat1.catInfo("Vasya1", 7,5, 0);
        cat2.catRun(200); // Передадим пробежку кота Вася2 в 200м
        cat1.catRun(190); // Передадим пробежку кота Вася в 190м
        dog1.dogRun(510);
        dog1.dogRun(499);

        // выведем через класс Животных информацию о коте Вася3
        cat3.animalInfo("Vasya3",5,5,0);

        // создадим массив животных
        Animals[] animalsArray = new Animals[5];
        animalsArray[0] = cat1;
        animalsArray[1] = cat2;
        animalsArray[2] = cat3;
        animalsArray[3] = dog1;
        animalsArray[4] = dog2;

        // выведем информацию о количестве животных используя методы нужных классов
        System.out.println("Количество животных: " + Animals.countAnimals);
        System.out.println("Количество Котов: " + Cat.countCats);
        System.out.println("Количество Собак: " + Dog.countDogs);


    }
}
