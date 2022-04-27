public class OurLinkedList {
    Node headNode;

    public OurLinkedList() {
        headNode = null;
    }
    public void add(Object val){
        Node newNode = new Node(val);
        if (headNode == null){
            headNode = newNode;
        }
        else{
            newNode.next = headNode;
            headNode = newNode;
        }
    }
    public void delete(){
        if (headNode != null) {
            headNode = headNode.next;
        }
        else{
            System.out.println("LinkedList boş");
        }
    }

    public void display(){
        Node n = headNode;
        while (n != null){
            System.out.println(n.value);
            n = n.next;
        }
    }
}
