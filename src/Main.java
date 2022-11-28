public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println ("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = (int) (dog - 3.5);
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }
    public static void task2 () {
        System.out.println ("Задача 2");
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }
    public static void task3() {
        System.out.println ("Задача 3");
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task4() {
        System.out.println ("Задача 4");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println ("Общий вес " + totalWeight + " кг");
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println ("Разница между весами " + weightDifference + " кг");
        var weightDifference2 = secondBoxer - firstBoxer;
        System.out.println ("Разница между весами " + weightDifference2 + " кг");
        var remains = secondBoxer % firstBoxer;
        System.out.println ("Разница между весами " + remains + " кг");


    }
    public static void task5() {
        System.out.println ("Задача 5");
        var allTime = 640;
        var workingHours = 8;
        var totalEmployee = allTime / workingHours;
        System.out.println ("Всего работников в компании - " + totalEmployee + " человек");
        var moreEmployee = 94;
        var totalWorks = moreEmployee + totalEmployee;
        System.out.println ("Всего работает " + totalWorks + " человека");
        var totalEmployee2 = totalEmployee + moreEmployee * workingHours;
        System.out.println("Если в компании работает " + totalWorks + " человек, то всего " +  totalEmployee2 + " часа работы может быть поделено между сотрудниками");




    }
}