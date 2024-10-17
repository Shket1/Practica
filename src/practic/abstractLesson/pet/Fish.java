package practic.abstractLesson.pet;

public class Fish extends Pet{
    public Fish(int pawsCount) {
        super(pawsCount);
    }

    @Override
    void giveVoice() {
        System.out.println("...");
    }
}
