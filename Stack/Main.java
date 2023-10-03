import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Stack - LIFO data structure. Last-in First-out
        // stores objects into a sort of "vertical tower"
        // push() to add to the top
        // pop() to remove from the top

        // uses of stack
        // 1. undo/redo features in text editors
        // 2. moving back/forward through bowser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        // * Stack can run out memory
        /**
            for (int i = 0; i < 100000000; i++) {
                stack.push("HI");
            }
            System.out.println(stack);  
         */

        Stack<String> stack = new Stack<String>();
        // System.out.println(stack.empty());

        stack.push("MineCraft");
        stack.push("Skyrl");
        stack.push("DOM");
        stack.push("PUBG");
        stack.push("MOBA");
        // System.out.println(stack);
        // stack.pop();
        // System.out.println(stack.peek());
        // System.out.println(stack);
        // System.out.println(stack.search("MI"));   -1


        

        
    }
}