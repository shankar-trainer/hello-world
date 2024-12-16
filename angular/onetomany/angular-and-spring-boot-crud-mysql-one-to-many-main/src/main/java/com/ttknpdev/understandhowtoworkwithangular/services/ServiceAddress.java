package com.ttknpdev.understandhowtoworkwithangular.services;

import java.util.Map;

public interface ServiceAddress <T>{
    Iterable<T> reads();
    Map<String,Boolean> create(T obj , Long eid);
    T read(Long aid);
    Map<String,Boolean> delete(Long aid);
    Map<String,Boolean> update(T obj,Long aid);
}
