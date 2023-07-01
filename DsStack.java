import java.util.Stack;

class DsStack{
    public static void main(String[] args) {

        // INITIALIZE AN EMPTY STACK
        Stack<String> stack = new Stack<>();

        // PUSH ITEMS IN THE STACK
        stack.push("Prince of Persia Sands of Time");        
        stack.push("Prince of Persia Warrior Within");
        stack.push("Prince of Persia The Two Thrones");
        stack.push("Control");
        stack.push("Project IGI");
        stack.push("Counter Strike 1.6");        
        stack.push("Counter Strike GO");        
        stack.push("PUBG");

        // CHECK WEATHER THE STACK IS EMPTY
        System.out.println(stack.empty());

        // REMOVE THE TOP MOST ITEM FROM THE STACK
        System.out.println(stack.pop());

        // CHECK YOUR STACK ITEMS
        System.out.println(stack);
        
    }
}