public class Heart {
    private final String name;
    private final String condition;
    private int hRate;

    public Heart(String name, String condition, int hRate) {
        this.name = name;
        this.condition = condition;
        this.hRate = hRate;
    }

    public void changeRate(int newRate){
        this.hRate = newRate;
        System.out.println("Heart rate changed to: " + this.hRate);
    }

    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Medical Condition: " + this.condition);
        System.out.println("Heart rate: " + this.hRate);
        System.out.println("\t 1.Change the heart rate");

    }
}
