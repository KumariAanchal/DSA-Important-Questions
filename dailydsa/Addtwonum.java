class Solution {
        public ListNode helper(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode result = null;
        int carry = 0;
        while (!stack1.empty() || !stack2.empty() || carry != 0) {
            int digit1 = !stack1.empty() ? stack1.pop() : 0;
            int digit2 = !stack2.empty() ? stack2.pop() : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            newNode.next = result;
            result = newNode;
        }
        return result;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = helper(l1, l2);
        return ans;
    }
}
