import java.util.*;

public class Main_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        do {
            String[] list = data.split("");
            String[] reversed = list.clone();

            List<String> listItem = Arrays.asList(reversed);
            Collections.reverse(listItem);
            if(Arrays.equals(list, reversed)){
                System.out.println("yes");
            }else System.out.println("no");
            data = sc.next();

        }while(!data.equals("0"));
    }
}
