package practic.abstractLesson.pet;

public class Practice {
    public static void main(String[] args) {
        Cat cat = new Cat(4);
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog(4);
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster(4);
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish(0);
        fish.sleep();

        Spider spider = new Spider(8);
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }

}
