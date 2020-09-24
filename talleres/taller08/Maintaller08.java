 /**
 *La clase Taller8 dos tiene como objetivo dar solución al taller8
 *
 *@Autor Andrea Sanchez Cortes 
 *@version 1
 */
import java.util.*;


public class Maintaller08 {

    public static void main(String[] args) {
	System.out.println(polaca("6 5 - 4 +"));
        System.out.println(polaca("3 5 * 2 +"));
        System.out.println(polaca("10 2 /"));

        Queue<String> queue = new LinkedList<>();
        queue.add("Juan");
        queue.add("María");
        queue.add("Pedro");
        cola(queue);

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Original:" + stack);
        Stack<Integer> stack_inv = inversa(stack);
        System.out.println("Invertido:" + stack_inv);

        Queue<Integer> neveras = new LinkedList<>();
        neveras.add(1);
        neveras.add(2);
        neveras.add(3);
        neveras.add(4);
        neveras.add(5);
        Queue<String> tiendas = new LinkedList<>();
        tiendas.add("Tienda 1");
        tiendas.add("Tienda 2");
        Queue<Integer> pedidos = new LinkedList<>();
        pedidos.add(2);
        pedidos.add(3);

        while (pedidos.peek()!=null) {
            String nombre = tiendas.poll();
            int num = (Integer) pedidos.poll();
            for(int i = 1; i <= num; i++) {
                ventas(neveras, nombre);
            }
        }
    }

    //ejercio 1
    public static int polaca  (String string){
        String[] prefixStr = string.split(" ");
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<prefixStr.length;i++){
            if(prefixStr[i].equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(prefixStr[i].equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(prefixStr[i].equals("-")){
                stack.push(-stack.pop() + stack.pop());
            }
            else if(prefixStr[i].equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.parseInt(prefixStr[i]));
            }
        }
        return stack.pop();
    }

    //ejercicio 2
    public static void ventas(Queue neveras, String nombre) {
        System.out.println("La nevera numero" + neveras.poll() + " se asigna a la tienda " + nombre);
    }

    //ejercicio 3 [Opcional]
    public static Stack<Integer> inversa (Stack stack){
        int n = stack.size();
        Stack<Integer> temp = new Stack<Integer>();
        for(int i = 0; i < n; i++)
            temp.push((Integer) stack.pop());
        return temp;
    }
	
    //  ejercicio 4 [Opcional]
    public static void cola(Queue<String> queue){
        while(queue.peek()!=null) System.out.println("Atendiendo a " + queue.poll());
    }
}