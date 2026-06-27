package LinkedList;

import java.util.Scanner;

public class LeetCode2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //Size of First LinkedList...
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        //Size of Second LinkedList..
        int m = input.nextInt();
        int[] temp = new int[m];
        for(int i=0; i<m; i++){
            temp[i] = input.nextInt();
        }
        LinkedList l1 = new LinkedList();
        for(int i=0; i<n; i++){
            l1.insertAtBeginning(arr[i]);
        }
        LinkedList l2 = new LinkedList();
        for(int i=0; i<m; i++){
            l2.insertAtBeginning(temp[i]);
        }
        l1.display();
        ListNode list1 = new ListNode(arr[n-1]);
        ListNode list2 = new ListNode(temp[m-1]);
        ListNode result = addNumber(list1,list2);

    }

    //MAIN code on leetcode ...Above is only for LinkedList Implementation
    public static ListNode addNumber(ListNode l1, ListNode l2){
        ListNode pagal = new ListNode(0);
        ListNode bkl = pagal;
        int boss = 0;
        while(l1!=null || l2!=null || boss != 0){
            int x = (l1 != null) ? l1.data : 0;
            int y = (l2 != null) ? l2.data : 0;
            int sum = boss + x +y;
            boss = sum/10;
            bkl.next = new ListNode(sum % 10);
            bkl = bkl.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return pagal.next;
    }
}

