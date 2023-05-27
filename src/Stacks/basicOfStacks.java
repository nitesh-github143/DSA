package Stacks;

import java.util.Stack;

public class basicOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        System.out.println(st);
        displayRec(st);
        System.out.println();
        System.out.println(st);
    }

    public static void displayRec(Stack<Integer> st) {
        if(st.size() == 1) {
            st.pop();
            return ;
        }

        int x = st.pop();
        displayRec(st);
        System.out.print(x + " ");
        st.push(x);
    }
}
