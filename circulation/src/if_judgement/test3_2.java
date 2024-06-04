package if_judgement;
//红绿灯
public class test3_2 {
    public static void main(String[] args) {
        boolean greenlight = false;
        boolean redlight = true;
        boolean yellowlight = false;
        if (greenlight) {
            System.out.println("go");
        } else if (redlight) {
            System.out.println("stop");
        } else{
            System.out.println("slow");

        }
    }
}
