package cn.huang.leetcode;

import java.util.LinkedList;

/*
225. Implement Stack using Queues
 */
public class LC_0225_ImplementStackusingQueues {
    //https://blog.csdn.net/coder_orz/article/details/51605052
    //https://www.youtube.com/watch?v=grAYBHmn4Cs
    class MyStack {

        LinkedList<Integer> queue1 = new LinkedList<Integer>();
        LinkedList<Integer> queue2 = new LinkedList<Integer>();

        // Push element x onto stack.
        public void push(int x) {
            if(empty()){
                //Adds the specified element as the tail (last element) of this list.
                queue1.offer(x);
            }else{
                if(queue1.size()>0){
                    queue2.offer(x);
                    int size = queue1.size();
                    while(size>0){
                        queue2.offer(queue1.poll());
                        size--;
                    }
                }else if(queue2.size()>0){
                    queue1.offer(x);
                    int size = queue2.size();
                    while(size>0){
                        queue1.offer(queue2.poll());
                        size--;
                    }
                }
            }
        }

        // Removes the element on top of the stack.
        public void pop() {
            if(queue1.size()>0){
                queue1.poll();
            }else if(queue2.size()>0){
                queue2.poll();
            }
        }

        // Get the top element.
        public int top() {
            if(queue1.size()>0){
                return queue1.peek();
            }else if(queue2.size()>0){
                return queue2.peek();
            }
            return 0;
        }

        // Return whether the stack is empty.
        public boolean empty() {
            return queue1.isEmpty() & queue2.isEmpty();
        }
    }
}
