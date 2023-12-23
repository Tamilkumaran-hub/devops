import java.util.ArrayList;
public class QueueArraylist<T> {
    ArrayList<T> numbers = new ArrayList<T>();

    // Push method to add an element to the end of the queue
    public void push(T num) {
        numbers.add(num);
    }

    // Pop method to remove and return the element from the front of the queue
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return numbers.remove(0);
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return numbers.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return numbers.size();
    }

    public static void main(String[] args) {
        QueueArraylist<Integer> queue = new QueueArraylist<>();

        // Push elements to the queue
        queue.push(1);
        queue.push(2);
        queue.push(3);

        // Prints the size of queue
        System.out.println("Size of queue is "+ queue.size());

        // Pop elements from the queue and print them
        while (!queue.isEmpty()) {
            Integer num = queue.pop();
            System.out.println("Popped: " + num);
        }
    }
}


//        list.poll();
//        list.remove();
//        list.add("Dog");
//        list.add("Cat");
//        list.add("Parrot");
//        list.add("Cow");
//
//        System.out.println(list);
//        list.poll();
//        list.peek();
//        System.out.println(list.size());
//        System.out.println(list.contains("Cat"));
//        System.out.println(list.contains("Rose"));
//        System.out.println(list.poll());
//        System.out.println(list.peek());
//        System.out.println(list);