package ListaCircularSimplesmenteEncadeada;

public class Node {
    private String element;
    private Node next;

    // Construtor
    public Node(String s, Node n) {
        element = s;
        next = n;
    }

    // Métodos
    public String getElement() {return element;}

    public Node getNext() {return next;}

    public void setElement(String newElement) {element = newElement;}

    public void setNext(Node newNext) {next = newNext;}
}
