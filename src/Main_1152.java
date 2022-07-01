import java.util.Scanner;

public class Main_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] data = s.split(" ");
        int count =0;
        for(int i = 0; i<data.length; i++){
            if (data[i].length() > 0) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
