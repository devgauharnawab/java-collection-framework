package parent_pkg.queue;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < 5; i++)
            q.offer(i);
        System.out.println("The Queues is : ");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
