package stacks;

public class Stack {
    int stck[] = new int[10];
    int tos;

    public Stack(){
        tos = 0;
    }
    void push(int item){
        if(tos==9){
            System.out.println("Stos jest pelny!");
        }else{
            stck[tos++] = item;
        }
    }

    int pop(){
        if(tos < 0){
            System.out.println("Stos nie ma już zadnych elementow!");
            return 0;
        }
        else{
            return stck[tos--];
        }

    }
}
