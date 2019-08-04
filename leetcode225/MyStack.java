/**
 * @author Taochunwei
 * @date 2019/8/4 - 20:31
 */
import java.util.LinkedList;
public class MyStack {

    LinkedList<Integer> linkedList;
    /** Initialize your data structure here. */
    public MyStack() {
       linkedList=new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
       linkedList.addFirst(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return linkedList.removeFirst();
    }

    /** Get the top element. */
    public int top() {
        return linkedList.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return linkedList.isEmpty();
    }
}
