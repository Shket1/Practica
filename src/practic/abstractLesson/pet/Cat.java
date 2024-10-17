package practic.abstractLesson.pet;

public class Cat extends Pet{

    public Cat(int pawsCount) {
        super(pawsCount);
    }

    public void catchMouse () {
        System.out.println("Поймала мышку!");
    }

    @Override
    void giveVoice() {
        System.out.println("Мяу - мяу");
    }
}
