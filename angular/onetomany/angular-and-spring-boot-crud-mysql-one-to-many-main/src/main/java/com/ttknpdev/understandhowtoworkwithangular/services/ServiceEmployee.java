package com.ttknpdev.understandhowtoworkwithangular.services;

import java.util.List;
import java.util.Map;

public interface ServiceEmployee<T>{
    Iterable<T> reads();
    List<T> readsOnlyEmployee();
    T create(T obj);
    T read(Long eid);
    Map<String,Boolean> delete(Long eid);
    Map<String,Boolean> update(T obj , Long eid);
}