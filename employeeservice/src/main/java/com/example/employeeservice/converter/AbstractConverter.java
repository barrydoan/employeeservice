package com.example.employeeservice.converter;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConverter<T, U> {
    public abstract T toObj(U u);

    public List<T> toListObj(List<U> list) {
        List<T> resultList = new ArrayList<T>();
        if (list != null) {
            for (U item : list) {
                T obj = toObj(item);
                resultList.add(obj);
            }
        }
        return resultList;
    }
}
