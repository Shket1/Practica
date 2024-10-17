package practic.abstractLesson.pet;

public class Hamster extends Pet{

    public Hamster(int pawsCount) {
        super(pawsCount);
    }

    public void hideFood () {
        System.out.println("Вся еда - в щечках!");
    }

    @Override
    void giveVoice() {
        System.out.println("ФЫр");
    }
}
