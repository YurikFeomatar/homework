package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class MainLoops {
    public static void main(String[] args) {
        Interfacer dowhileLoops = new DoWhile();
        dowhileLoops.runLoops(ArraysUtils.arrayRandom(50,100));
        Interfacer whileLoops = new While();
        whileLoops.runLoops(ArraysUtils.arrayRandom(50,100));
        Interfacer forLoops = new For();
        forLoops.runLoops(ArraysUtils.arrayRandom(50,100));
        Interfacer forEachLoops = new ForEach();
        forEachLoops.runLoops(ArraysUtils.arrayRandom(50,100));
    }
}
