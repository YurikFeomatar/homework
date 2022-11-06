package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class Interfacer {
    public static void main(String[] args) {
        DoWhileOperation container = new DoWhileOperation();
        container.print();
    }
}
interface IArraysOperation {
    void print();
}
class DoWhileOperation implements IArraysOperation{
    int[] array;
    DoWhileOperation(){
        this.array = array;



    }


    public void print() {

        ArraysUtils.arrayFromConsole();
        ArraysIteration.iteral(array);

    }
}



