package home_work_5;

import home_work_5.api.Comporator;
import home_work_5.api.IDataContainer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;

public class DataContainer <T> implements IDataContainer<T>, Iterable<T>{
    private T item;
    private T[] data;

    /**
     * конструктор
     * @param data массив с дженериком <T>
     */
    public DataContainer(T[] data){
        this.data = data;
    }

    /**
     * добавление значения в пустую ячейку массива, если её нет - добавляем ячейку.
     * @param item значение ячейки
     * @return индекс ячейки массива
     */
    public int add(T item){
        int index = 0;
        if(item == null){
            return -1;
        }
        if(data.length == 0){
            data =  Arrays.copyOf(data,data.length + 1);
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                index = i;
                return index;
            }else {}
        }
        data =  Arrays.copyOf(data,data.length + 1);
        for (int j = 0; j < data.length; j++) {
            if (data[j] == null) {
                data[j] = item;
                index = j;
                        return index;
                    }
                }

        return index;
    }

    /**
     * возвращает объект сохранненый в ячейку массива data
     * @param index индекс ячейки массива
     * @return объект в ячейке массива
     */
    @Override
    public T get(int index) {
        if(data.length - 1 < index){
            data =  Arrays.copyOf(data,data.length + 1);
        }
        return data[index];
    }

    /**
     * возвращает массив из поля data
     * @return массив
     */
    @Override
    public T[] getItems() {
        return data;
    }

    /**
     * удаляет ячейку из массива по индексу
     * @param index индекс ячейки массива
     * @return булеан значение, true - если удаление прошло успешно, false - если удаления не произошло
     */
    @Override
    public boolean delete(int index) {
        boolean flag = false;
        if(index > data.length){
            flag = false;
            return flag;
        }
        data[index] = null;
        if(data[index] == null) {
            flag = true;
            for (int i = index + 1; i < data.length; i++) {
                data[i-1] = data[i];
                data[i] = null;
            }
            data =  Arrays.copyOf(data,data.length - 1);
        }
        return flag;
    }

    /**
     * удаляет ячейку массива по оъекту.
     * @param item оъект
     * @return boolean значение, true - если удаление прошло успешно, false - если удаления не произошло
     */
    @Override
    public boolean delete(T item) {
        boolean flag = false;
        if(item == null){
            flag = false;
            return flag;
        }
        for (int i = 0; i < data.length; i++) {
            if(item.equals(data[i])){
                flag = true;
                data[i] = null;
                for (int j = i+1; j < data.length; j++) {
                    data[j-1] = data[j];
                    data[j] = null;
                }
                data =  Arrays.copyOf(data,data.length - 1);
            }else{
                flag = false;
            }
        }
        return flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataContainer<?> that = (DataContainer<?>) o;
        return Objects.equals(item, that.item) && Arrays.equals(data, that.data);
    }

    @Override
    public int hashCode(T item) {
        int result = Objects.hash(item);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }

    /**
     * сортирует объекты в массиве
     * @param comparator экземпляр класса Comporator
     */
    public void sort(Comporator<? super T> comparator) {
        T sorter;
        for (int i = 0; i < this.data.length -1; i++) {
            for (int j = this.data.length -1; j > i; j--) {
                if(comparator.compare(data[j - 1],data[j]) > 0) {
                    sorter = data[j -1];
                    data[j -1] = data[j];
                    data[j] = sorter;
                }
            }
        }
    }

    /**
     * переопределенный метод toString выводит содержимое массива без null ячеек
     * @return строку с содержимим массива без null ячеек
     */
    @Override
    public String toString() {
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
                for (int j = i + 1; j < data.length; j++) {
                    data[j-1] = data[j];
                    data[j] = null;
                }
                data =  Arrays.copyOf(data,data.length - 1);
            }
        }
        return "DataContainer{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    /**
     * сортирует элементы в переданном объекте DataContainer с помощью compareTo интерфейса Comparable
     * @param container Объект DataContainer
     * @param <T> дженерик
     */
    public static <T extends Comparable<T>> void sort(DataContainer<? extends T>  container){
        T sorter;
        T[] data = container.getItems();
        for (int i = 0; i < data.length -1; i++) {
            for (int j = data.length -1; j > i; j--) {
                if(data[j - 1].compareTo( data[j]) > 0) {
                    sorter = data[j -1];
                    data[j -1] = data[j];
                    data[j] = sorter;
                }
            }
        }
    }

    /**
     * сортирует элементы в переданном объекте DataContainer с помощью Comporator
     * @param container объект DataContainer
     * @param comporator объект Comporator
     * @param <T> дженерик
     */
    public static<T> void sort(DataContainer<? extends T> container,Comporator<? super T> comporator){
        container.sort(comporator);
    }

    /**
     * итерирует элементы массива с помощью интерфейса Iterable
     * @return объект Iterator
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int cursor;
            int lastRet = -1;
            @Override
            public boolean hasNext() {
                return cursor != data.length;
            }
            @Override
            public T next() {
                int b = cursor;
                cursor = b + 1;
                return data[lastRet = b];
            }
        };
    }
}
