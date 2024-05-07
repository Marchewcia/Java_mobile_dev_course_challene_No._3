public class Skin {
    private final String name;
    private final String condition;

    public Skin(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Medical condition: " + this.condition);
    }
}
