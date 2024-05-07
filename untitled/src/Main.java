import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit  = false;
        Scanner scanner = new Scanner(System.in);
        int con = 0;

        Human human = new Human(25, "Tom", new LeftEye("Left Eye", "Short sighted", "Blue"), new RightEye("Right Eye", "Normal", "Blue"), new Heart("Heart", "Normal", 65), new Stomach("Stomach", "PUD"), new Skin("Skin", "Burned"));

        System.out.println("Name: " + human.getName() + "\nAge: " + human.getAge());
        while(!exit){
            human.printList();
            int inp = scanner.nextInt();
            switch (inp){
                case 1:
                    human.getlEye().getInfo();
                    while(con != 1){
                        con = scanner.nextInt();
                    }
                    con = 0;
                    break;
                case 2:
                    human.getrEye().getInfo();
                    while(con != 1){
                        con = scanner.nextInt();
                    }
                    con = 0;
                    break;
                case 3:
                    human.getHeart().getInfo();
                    while(con != 1){
                        con = scanner.nextInt();
                    }
                    con = 0;
                    System.out.println("Enter new heart rate");
                    human.getHeart().changeRate(scanner.nextInt());
                    break;
                case 4:
                    human.getStomach().getInfo();
                    while(con != 1){
                        con = scanner.nextInt();
                    }
                    con = 0;
                    human.getStomach().digest();
                    break;
                case 5:
                    human.getSkin().getInfo();
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }
    }
}