package whynotac;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        if (n == m) return head;
        // write code here
        ListNode h = new ListNode(0);
        h = h.next;
        ListNode l = h, r;
        for (int i = 0; i < m - 1; i ++) l = l.next;
        r = l.next;
        ListNode t;
        for (int i = 0; i < n - m; i ++) {
            t = l;
            r = r.next;
            l = l.next;
            r.next = t;
        }
        return h.next;
    }
}
