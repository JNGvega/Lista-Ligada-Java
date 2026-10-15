/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaenlazada;

/**
 *
 * @author Armando
 */
public class Main {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList(10);
            ll.append(20);
            ll.append(30);
            ll.append(40);
            ll.append(50);
            ll.printList();
            System.out.println("DATOS ADICIONALES");
            ll.getHead();
            ll.getTail();
            ll.getLength();
            System.out.println("Probando REMOVE 50");
            System.out.println( ll.removeLast().value );
            System.out.println("Probando REMOVE 40");
            System.out.println( ll.removeLast().value );
            System.out.println("Probando REMOVE 30");
            System.out.println( ll.removeLast().value );
            System.out.println("Probando REMOVE 20");
            System.out.println( ll.removeLast().value );
            System.out.println("Probando REMOVE 10");
            System.out.println( ll.removeLast().value );

            System.out.println("Probando REMOVE vacio");
            System.out.println( ll.removeLast() );

            ll.append(100);
            System.out.println("IMPRIME LISTA CON 100");
            ll.printList();
            ll.append(200);
            System.out.println("IMPRIME LISTA CON 100 Y 200");
            ll.printList();
            // Prueba del método Prepend
            ll.prepend(5);
            ll.prepend(4);
            ll.prepend(3);
            ll.prepend(2);
            ll.prepend(1);
            System.out.println("IMPRIME LISTA");
            ll.printList();
            // Prueba de metodo RemoveFirst
            ll.removeFirst();
            ll.removeFirst();
            ll.removeFirst();
            System.out.println("IMPRIME LISTA");
            ll.printList();
            ll.prepend(3);
            ll.prepend(2);
            ll.prepend(1);
            System.out.println("IMPRIME LISTA");
            ll.printList();
            // Prueba del método getNode
            System.out.println("Uso del metodo getNode");
            System.out.println(ll.getNode(1).value);
            System.out.println(ll.getNode(2).value);
            System.out.println(ll.getNode(3).value);
            System.out.println(ll.getNode(4).value);
            System.out.println(ll.getNode(5).value);
            System.out.println(ll.getNode(6).value);
            System.out.println(ll.getNode(7).value);
            // Prueba del metodo SET
            System.out.println("Uso del metodo getNode");
            ll.setNode(1,100);
            ll.setNode(2,200);
            ll.setNode(3,300);
            ll.setNode(4,400);
            ll.setNode(5,500);
            System.out.println("IMPRIME LA LISTA DESPUES DE LOS SET");
            ll.printList();
            System.out.println("Usar el insert (index, value)");
            ll.insert(2,333);
            ll.insert(3,334);
            ll.insert(4,335);
            ll.insert(0,10000);
            System.out.println("Imprimir la lista despues del insert");
            ll.printList();
            System.out.println("Prueba del método de remove(index)");
            ll.remove(4);
            ll.remove(1);
            ll.remove(1);
            System.out.println("Lista con operaciones remove");
            ll.printList();
            System.out.println("Prueba del metodo Medio para obetener el Node del medio de la LinkedList");
            System.out.println(ll.medio().value);
            System.out.println("Prueba pasada");
               
            
            // prueba 2
            if (ll.ciclo()) {
                System.out.println("La lista actual es un ciclo");
            } else {
                System.out.println("La lista actual no es un ciclo");
            }
            
            //Prueba de el reverse
            System.out.println("Prueba del reverse: ");
                  
            
            ll.reverse();
            ll.printList();
            // Paso las pruebas el codigo
            
            System.out.println();
            System.out.println("Pruebas de codigo ");
            
    }
    
}
