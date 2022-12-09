package home_work_5;

import home_work_5.api.IDataContainer;

public class DataContainerMain <T> {
    public static void main(String[] args) {
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
            System.out.println(var.add(777));
            System.out.println(var.toString());
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,null,null,null});
            System.out.println(var.add(null));
            System.out.println(var);
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,null,3,null,null,null});
            System.out.println(var.add(777));
            System.out.println(var);
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3});
            System.out.println(var.add(777));
            System.out.println(var);
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{});
            System.out.println(var.add(777));
            System.out.println(var);
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{});
            System.out.println(var.add(9999));
            System.out.println(var);
            System.out.println(var.get(0));

        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{9999});
            System.out.println(var);
            System.out.println(var.get(1));
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,777});
            System.out.println(var.delete(3));
            System.out.println(var);
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,777});
            System.out.println(var.delete(9));
            System.out.println(var);
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,777});
            System.out.println(var.delete(2));
            System.out.println(var);
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,777});
            System.out.println(var.delete(null));
            System.out.println(var);
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,777,null});
            System.out.println(var.delete(null));
            System.out.println(var);
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,777});
            System.out.println(var.delete(Integer.valueOf(777)));
            System.out.println("getItems = " + var.getItems());
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,777});
            System.out.println(var.delete(Integer.valueOf(111)));
            System.out.println(var);
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,777});
            System.out.println(var.delete(Integer.valueOf(3)));
            System.out.println(var);
        }
        System.out.println(" ");
        //________________________________________________________________________________________
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{3,1,3,777});
            System.out.println("хешкод = " + var.hashCode(2));
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,777});
            System.out.println("equals = " + var.equals(777));
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{3,1,3,777});
            var.sort(new ComparatorInteger<>());
            System.out.println("после сорт = " + var);

        }
        System.out.println(" ");
        {
            IDataContainer <String> var = new DataContainer<>(new String[]{"i","hello","1","Как домашка"});
            var.sort(new ComporatorString<>());
            System.out.println("после сорт = " + var);
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,777,3});
            System.out.println(var.toString());
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,null});
            System.out.println(var);
        }
        System.out.println(" ");
        {
            IDataContainer <Integer> var = new DataContainer<>(new Integer[]{});
            System.out.println(var);
        }
        System.out.println(" ");
        {
            Integer[] array = new Integer[]{2,1,4,5,3,6};
            DataContainer <Integer> var = new DataContainer<>(array);
            DataContainer.sort(var);
            System.out.println(var);
        }
        System.out.println(" ");
        {
            Integer[] array = new Integer[]{7,9,6,5,3,6,777};
            DataContainer <Integer> var = new DataContainer<>(array);
            DataContainer.sort(var,new ComparatorInteger<>());
            System.out.println(var);
        }
        System.out.println(" ");
        {
            DataContainer <Integer> var = new DataContainer<>(new Integer[]{1,2,3,4,5,6});
            while (var.iterator().hasNext()){
              int element = var.iterator().next();
                System.out.println(element);
            }
        }
    }
}
