package io.codeforall.bootcamp;

import javafx.scene.layout.Priority;

import java.util.PriorityQueue;


public class ToDoList extends PriorityQueue<ToDoList> {

    private TodoItem todoItem;

    public ToDoList(TodoItem todoItem) {
        this.todoItem = todoItem;


    }

    private class TodoItem implements Comparable<TodoItem> {

        private String item;

        private int priority;

        private Importance importance;


        public TodoItem (String item, int priority, Importance importance){
            this.item = item;
            this.priority = priority;
            this.importance = importance;
        }

        @Override
        public int compareTo(TodoItem o) {
            //if(todoItem.priority < todoItem.importance){

            //}
            return 0;
        }
    }

}
