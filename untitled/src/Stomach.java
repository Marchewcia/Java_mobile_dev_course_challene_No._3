public class Stomach {
    private final String name;
    private final String condition;

    public Stomach(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public void digest(){
        System.out.println("Digesting begin...");
    }
    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Medical Condition: " + this.condition);
        System.out.println("Need to be fed");
        System.out.println("\t 1.Digest");

    }
}
