package container;

/**
 * A class that represents a node to be used in a linked list.
 * These nodes are singly linked.
 */
public class ListNode {

    private Object data;
    private ListNode next;

    public ListNode(Object data, ListNode next) {

        this.data = data;
        this.next = next;
    }

    public static boolean contains(ListNode n, Object o) {

        boolean r = false;

        while (true) {

            if (n == null) {

                break;
            }

            if (n.data.equals(o)) {

                r = true;
                break;
            }

            n = n.next;
        }

        return r;
    }
}
