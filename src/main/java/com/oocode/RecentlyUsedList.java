package com.oocode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RecentlyUsedList {

    private List<String> recUsedList;

    public RecentlyUsedList() {
        recUsedList = new LinkedList<String>() ;
    }

    public List<String> getList(){
        return recUsedList;
    }

    public void add(String item) {
        List<String> tmpList = new LinkedList<String>();
        tmpList.add(item);
        tmpList.addAll(recUsedList);
        recUsedList=tmpList;
    }

    public String getItem() {
        return recUsedList.get(0);
    }
}
