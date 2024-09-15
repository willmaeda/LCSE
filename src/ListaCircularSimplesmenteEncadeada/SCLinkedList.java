package ListaCircularSimplesmenteEncadeada;


public class SCLinkedList {

    protected Node head;
    protected Node tail;

    protected long size;

    // Construtor de Lista Vazia
    public SCLinkedList() {
        head = tail = null;
        size = 0;
    }

    // Métodos
    // Adiciona elemento no começo da lista
    public void addHead(String element) {
        Node newNode = new Node(element, head);
        if (size == 0) {
            head = tail = newNode;
            tail.setNext(newNode);
        }else{
            head = newNode;
            tail.setNext(newNode);

        }
        size++;
    }

    public void addTail(String element) {
        Node newNode = new Node(element, head);
        if (size == 0) {
            tail = head = newNode;
        }else {
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
        }
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            throw new EmptySCLinkedList("Lista vazia");
        }
        head = head.getNext();
        tail.setNext(head);
        size--;
        if (size == 0) {
            tail = null;
        }

    }

    // Retorna uma representação em string da lista
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.getElement());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    public long getSize() {
        return size;
    }
}
