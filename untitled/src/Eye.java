public class Eye {
    String name;
    String condition;
    String color;

    public Eye(String name, String condition, String color) {
        this.name = name;
        this.condition = condition;
        this.color = color;
    }

    public void getInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Medical Condition: " + this.condition);
        System.out.println("Color: " + this.color);
        System.out.println("\t 1.Close the Eye");

    }
}