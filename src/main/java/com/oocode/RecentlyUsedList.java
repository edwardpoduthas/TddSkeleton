package com.oocode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecentlyUsedList {

    private List<String> recUsedList;

    public RecentlyUsedList() {
        recUsedList = new ArrayList<String>() ;
    }

    public List<String> getList(){
        return recUsedList;
    }

    public void add(String item) {
        recUsedList.add(item);
    }

    public String getItem() {
        return recUsedList.get(0);
    }
}
