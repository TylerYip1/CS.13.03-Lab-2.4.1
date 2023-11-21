import java.util.LinkedList;

public class CISStack {

    // Linked list property.
    private LinkedList<Integer> stack;

    // Size property.
    private int size;


    CISStack(){
        this.stack = new LinkedList<Integer>();
        this.size = 0;
    }
    // Constructor.

    // Push. This method pushes a value onto the top of the stack.
    public void push(int a){
        this.stack.push(a);
        size += 1;
    }
    // Pop. This method pops a value from the top of the stack.
    public int pop(){
        int a = stack.getFirst();
        this.stack.pop();
        size -= 1;
        return a;
    }
    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    // size. Returns the size of the queue.
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "CISStack{" +
                "stack=" + stack +
                ", size=" + size +
                '}';
    }

}
