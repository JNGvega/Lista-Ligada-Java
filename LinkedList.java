package listaenlazada;

/**
 * Implementación de una Lista Enlazada Simple (Singly Linked List).
 * Permite la manipulación dinámica de nodos, incluyendo inserción, 
 * eliminación, búsqueda y reversión de la estructura.
 * 
 */
public class LinkedList {
    
    private Node head;
    private Node tail;
    private int length;
    
    /**
     * Clase interna que representa cada elemento (nodo) de la lista
     */
    class Node {
        int value;
        Node next;     
        public Node(int value) {
            this.value = value;
        }
    }
    
    /**
     * Constructor que inicializa la lista con un primer nodo
     * value El valor del nodo inicial
     */
    public LinkedList(int value) {
        Node newNode = new Node(value);
        length = 1;
        head = newNode;
        tail = newNode;
    }
    
    // ==========================================
    // MÉTODOS DE IMPRESIÓN Y LECTURA
    // ==========================================

    public void getHead() {
        if (head != null) System.out.println("Head: " + head.value);
    }

    public void getTail() {
        if (tail != null) System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    /**
     * Imprime todos los valores de la lista en orden
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // ==========================================
    // MÉTODOS DE INSERCIÓN
    // ==========================================

    /**
     * Agrega un nodo al final de la lista
     */
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    /**
     * Agrega un nodo al inicio de la lista
     */
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    /**
     * Inserta un nodo en un índice específico
     */
    public boolean insert(int index, int value) {
        if (index < 1 || index > length + 1) return false;
        if (index == 1) {
            prepend(value);
            return true;
        }
        if (index == length + 1) {
            append(value);
            return true;
        }
        Node tmp = head;
        int cur = 1;
        while (cur < index - 1) {
            tmp = tmp.next;
            cur++;
        }
        Node newNode = new Node(value);
        newNode.next = tmp.next;
        tmp.next = newNode;
        length++;
        return true;
    }

    // ==========================================
    // MÉTODOS DE ELIMINACIÓN
    // ==========================================

    /**
     * Elimina el último nodo de la lista
     */
    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
            length = 0;
            return temp;
        }
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        return temp;
    }

    /**
     * Elimina el primer nodo de la lista
     */
    public Node removeFirst() {
        if (length == 0) return null;
        Node tmp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        length--;
        return tmp;
    }

    /**
     * Elimina un nodo en un índice específico (basado en 1)
     */
    public Node remove(int index) {
        if (index < 1 || index > length) return null;
        if (index == 1) return removeFirst();
        if (index == length) return removeLast();
        Node prev = head;
        for (int i = 1; i < index - 1; i++) {
            prev = prev.next;
        }
        Node temp = prev.next;
        prev.next = temp.next;
        length--;
        return temp;
    }

    // ==========================================
    // MÉTODOS DE BÚSQUEDA Y UTILIDAD
    // ==========================================

    /**
     * Retorna el nodo ubicado en un índice específico
     */
    public Node getNode(int idx) {
        if (idx < 1 || idx > length) return null;
        Node tmp = head;
        for (int cur = 1; cur < idx; cur++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    /**
     * Actualiza el valor de un nodo en un índice específico
     */
    public void setNode(int idx, int value) {
        Node tmp = getNode(idx);
        if (tmp != null) {
            tmp.value = value;
        }
    }

    /**
     * Encuentra el nodo central usando el algoritmo de la tortuga y la liebre
     */
    public Node medio() {
        Node pt1 = head;
        Node pt2 = head;
        while (pt2 != null && pt2.next != null) {
            pt1 = pt1.next;
            pt2 = pt2.next.next;
        }
        return pt1;
    }
    
    /**
     * Detecta si existe un ciclo infinito en la lista enlazada
     */
    public boolean ciclo() {
        Node pt1 = head;
        Node pt2 = head;
        while (pt2 != null && pt2.next != null) {
            pt1 = pt1.next;
            pt2 = pt2.next.next;
            if (pt1 == pt2) return true;
        } 
        return false;
    }
    
    /**
     * Invierte la dirección de los punteros de la lista
     */
    public void reverse() {
        if (length <= 1) return;
        Node temp = head;
        head = tail;
        tail = temp;
        Node cur = tail;
        Node prev = null;
        Node next = null;
        for (int i = 0; i < length; i++) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
    }
}