import java.util.Scanner;

public class CellPhoneService {
    public static void main (String args[]) {
        int talk_min = 0;
        int txt_msg = 0;
        int mobile_data = 0;
        Scanner input = new Scanner(System.in);
        // Input the talk time
        System.out.print("Enter your talk time ");
        talk_min = input.nextInt();
        // Input the text messages sent
        System.out.print("Enter the amount of messages you sent ");
        txt_msg = input.nextInt();
        // Input the Mobile Data in Gigabytes
        System.out.print("Enter the amount of data used in Gigabytes ");
        mobile_data = input.nextInt();
        if (talk_min >= 0 && txt_msg >= 0 && mobile_data > 0 && mobile_data < 2){
            System.out.println("You should get Plan E at $79 per month");
        }
        if (talk_min >= 0 && txt_msg >= 0 && mobile_data >= 2){
            System.out.println("You should get Plan F at $87 per month");
        }
        if (talk_min < 500 && txt_msg == 0 && mobile_data == 0){
            System.out.println("You should get Plan A at $49 per month");
        }
        if (talk_min < 500 && txt_msg > 0 && mobile_data == 0){
            System.out.println("You should get Plan B at $55 per month");
        }
        if (talk_min >= 500 && txt_msg < 100 && mobile_data == 0){
            System.out.println("You should get Plan C at $61 per month");
        }
        if (talk_min >= 500 && txt_msg >= 100 && mobile_data == 0){
            System.out.println("You should get Plan D at $70 per month");
        }
    }
}
