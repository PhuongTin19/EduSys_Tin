package com.eduSys.dao;
import java.util.List;
abstract public class EduSysDAO<E,K> {
   abstract public void insert(E entity);
   abstract public void update(E entity);
   abstract public void delete(K key);
   abstract public List<E> selectAll();
   abstract public E selectID(K key);
   abstract protected List<E> selectBySql(String sql,Object...args);
}

