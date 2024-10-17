package practic.abstractLesson.pet;

public class Dog extends Pet{

    public Dog(int pawsCount) {
        super(pawsCount);
    }
    public void bringStick () {
        System.out.println("Принес палочку, как хороший мальчик!");
    }

    @Override
    void giveVoice() {
        System.out.println("Гав - Гав");
    }
}
