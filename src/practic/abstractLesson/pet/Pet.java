package practic.abstractLesson.pet;

public abstract class Pet {
    public int pawsCount;

    public Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public void sleep () {
        System.out.println("Сплю");
    }
    public void play () {
        System.out.println("Играю");
    }
    public int getPawsCount () {
        return this.pawsCount;
    }

    abstract void giveVoice ();

}
