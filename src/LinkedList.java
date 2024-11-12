public class LinkedList {
    private int data;
    private LinkedList next;
    private LinkedList first;
    private static int count;

    public LinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    public void add(int data) {
        if (first == null) {
            first = new LinkedList(data);
            first.next = null;
            count++;
            return;
        }

        next = this.first;

        while (next.next != null) {
            next = this.next.next;
        }

        var current = next;
        current.next = new LinkedList(data);
        current.next.next = null;
        count++;
    }

    public void print() {
        var current = first;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(count + " total");
    }
}