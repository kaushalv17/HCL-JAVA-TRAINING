import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QC{
    public static void main(String[]args){
       Queue<Integer> queue = new LinkedList<>();

       queue.offer(4);
       System.out.println(queue);
 ArrayDeque<Integer> stack = new ArrayDeque<>();

        // a.offer(10);
        // a.offer(20);
        // a.offerFirst(5);
        // a.offerLast(30);

        // System.out.println(a);    
        //  System.out.println(a.peek());  
        // System.out.println(a.peekLast());

          stack.push(10);
        stack.push(20);
        stack.push(30);

         System.out.println(stack);  
          System.out.println(stack.peek());
          System.out.println(stack.pop()); 
        
    }
}