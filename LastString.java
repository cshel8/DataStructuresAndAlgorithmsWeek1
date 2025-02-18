import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LastString {
    public static void main(String[] args) {
        int kString = Integer.parseInt(args[0]);
        Queue<String> queue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            String reply = input.next();
            queue.add(reply);
            if (queue.size() > kString) {
                queue.poll();
            }
        }
        if (queue.size() == kString) {
            System.out.println(queue.peek());
        }
    }
}