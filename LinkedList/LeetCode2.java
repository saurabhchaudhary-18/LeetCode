package LinkedList;

import java.util.Scanner;

public class LeetCode2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        LinkedList list = new LinkedList();
        for(int i=0; i<n; i++){
            list.insertAtBeginning(arr[i]);
        }

        list.display();
    }
}

