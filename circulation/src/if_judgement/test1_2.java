package if_judgement;
//红绿灯
public class test1_2 {
    public static void main(String[] args) {
       boolean greenlight = false;
       boolean redlight = true;
       boolean yellowlight = false;
       if (greenlight) {
           System.out.println("go");
       }
       if (yellowlight) {
           System.out.println("slow");
       }
       if (redlight){
           System.out.println("stop");
       }

    }
}
