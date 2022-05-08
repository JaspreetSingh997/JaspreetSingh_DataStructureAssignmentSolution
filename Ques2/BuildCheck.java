import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Data {
    int day;
    int val;
}

public class BuildCheck {

    public static void main(String[] args) {

        int n;
        System.out.println("enter the total no of floors in the building: ");
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> st = new Stack<Integer>();
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("enter the floor size given on day : " + (i + 1));

            arr.add(sc.nextInt());
        }

        st.push(arr.get(0));
        int i;
        for (i = 1; i < n; i++) {
            System.out.println("Day " + (i));
            if (st.peek() < arr.get(i)) {
                st.push(arr.get(i));
            } else {
                queue.add(arr.get(i));
                while (!st.empty() && st.peek() > queue.peek()) {

                    System.out.print(st.pop() + " ");
                }
                System.out.println();
                st.push(queue.poll());

            }

        }
        if(!st.empty()) {
            System.out.println("Day " + i );
            while(!st.empty()) {
                System.out.print(st.pop() + " ");
            }
        }
        System.out.println();
    }
}