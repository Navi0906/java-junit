package com.bridgelabz;

import java.util.List;

public class ListManager {

    public boolean addElement(List<Integer> list, int element){
        list.add(Integer.valueOf(element));
        return (list.contains(element));
    }

    public boolean removeElement(List<Integer> list, int element){
        list.remove(Integer.valueOf(element));
        return (list.contains(element));
    }

    public int getSize(List<Integer> list){
        return list.size();
    }
}
