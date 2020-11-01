public class StackWithArray {
    int top = -1;
    int[] stack;

    public StackWithArray(int length){
        this.stack = new int[length];
    }

    public void push(int item){
        if(isStackFull()){
            System.out.println("Stack overflow");//Can throw errors
            return;
        }
        this.top++;
        this.stack[this.top] = item;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack empty");//Can throw errors
            return 0;
        }else {
            return this.stack[this.top--];
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack empty");//Can throw errors
            return 0;
        }
        return this.stack[top];
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Stack empty");
            return;
        }
        for(int i=0; i <= top; i++){
            System.out.println(this.stack[i]);
        }
    }

    private boolean isEmpty(){
        return top == -1;
    }

    private boolean isStackFull(){
        return this.top == this.stack.length-1;
    }
}
