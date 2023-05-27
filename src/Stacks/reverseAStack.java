package Stacks;

import java.util.Stack;

public class reverseAStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> qt = new Stack<>();
        while(rt.size() > 0){
            qt.push(rt.pop());
        }
        System.out.println(qt);
//        Stack<Integer> qt = new Stack<>();
        while(qt.size() > 0){
            st.push(qt.pop());
        }
        System.out.println(st);
    }

}
