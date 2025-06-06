class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class SortedListToBinaryTree {
    private ListNode head;

    public TreeNode sortedListToBST(ListNode head) {
        this.head = head;
        int size = getSize(head);
        return sortedListToBSTHelper(0, size - 1);
    }
    private int getSize(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    private TreeNode sortedListToBSTHelper(int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode leftChild = sortedListToBSTHelper(left, mid - 1);
        TreeNode root = new TreeNode(head.val);
        root.left = leftChild;
        head = head.next;
        root.right = sortedListToBSTHelper(mid + 1, right);
        return root;
    }
    public void printPreorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        } else {
            System.out.print("null ");
        }
    }

    public static void main(String[] args) {
        SortedListToBinaryTree solution = new SortedListToBinaryTree();
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);
        TreeNode root = solution.sortedListToBST(head);
        solution.printPreorder(root); 
    }
}