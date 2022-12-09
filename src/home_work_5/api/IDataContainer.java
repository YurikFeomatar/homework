package home_work_5.api;

import home_work_5.ComparatorInteger;

public interface IDataContainer <T> {
    int add(T item);
    T get(int index);
    String toString();
    T[] getItems();
    boolean delete(int index);
    boolean delete(T item);
    int hashCode(T item);
    boolean equals(Object o);
    void sort(Comporator<? super T> comparator);


}
