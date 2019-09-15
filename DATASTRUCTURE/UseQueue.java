package DATASTRUCTURE;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    //Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		// * Use For Each loop and while loop with Iterator to retrieve data.
    public static void main(String[] args) {
        Queue<String> districts = new LinkedList<>();
        districts.add("chittagong");
        districts.add("dhaka");
        districts.add("sylet");
        districts.add("coxbazar");
        System.out.println("peek :"+districts.peek());
        System.out.println("remove:"+ districts.remove());
        System.out.println("poll:" + districts.poll());
        for (String  a:districts){
            System.out.println("for loop:" +a);
            Iterator it = districts .iterator();
            while (it.hasNext()){
                System.out.println("iterator :"+ it. next());
            }

        }


    }
}
