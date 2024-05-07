
public class Human {
    private final int age;
    private final String name;
    private final LeftEye lEye;
    private final RightEye rEye;
    private final Heart heart;
    private final Stomach stomach;
    private final Skin skin;

    public Human(int age, String name, LeftEye lEye, RightEye rEye, Heart heart, Stomach stomach, Skin skin) {
        this.age = age;
        this.name = name;
        this.lEye = lEye;
        this.rEye = rEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public void printList(){
        System.out.println("Choose an Organ:");
        System.out.println("\t 1. Left Eye");
        System.out.println("\t 2. Right Eye");
        System.out.println("\t 3. Heart");
        System.out.println("\t 4. Stomach");
        System.out.println("\t 5. Skin");
        System.out.println("\t 6. Quit");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public LeftEye getlEye() {
        return lEye;
    }

    public RightEye getrEye() {
        return rEye;
    }

    public Heart getHeart() {
        return heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public Skin getSkin() {
        return skin;
    }
}
