package practic.abstractLesson.pet;

public class Spider extends Pet{
    public Spider(int pawsCount) {
        super(pawsCount);
    }

    @Override
    void giveVoice() {
        System.out.println("ШШШШ");
    }
}
