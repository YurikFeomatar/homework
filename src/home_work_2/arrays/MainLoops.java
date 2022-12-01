package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class MainLoops {
    public static void main(String[] args) {
        final ArraysUtils calc = new ArraysUtils();
        {
            final Interfacer dowhileLoops = new DoWhile();
            System.out.println(dowhileLoops.runLoopsIter(calc.arrayRandom(50, 100)));
            System.out.println(dowhileLoops.runLoopsIterOdd(calc.arrayRandom(50, 100)));
            System.out.println(dowhileLoops.runLoopsIterBackArray(calc.arrayRandom(50, 100)));
        }
        {
            final Interfacer whileLoops = new While();
            System.out.println(whileLoops.runLoopsIter(calc.arrayRandom(50, 100)));
            System.out.println(whileLoops.runLoopsIterOdd(calc.arrayRandom(50, 100)));
            System.out.println(whileLoops.runLoopsIterBackArray(calc.arrayRandom(50, 100)));
        }
        {
            final Interfacer forLoops = new For();
            System.out.println(forLoops.runLoopsIter(calc.arrayRandom(50, 100)));
            System.out.println(forLoops.runLoopsIterOdd(calc.arrayRandom(50, 100)));
            System.out.println(forLoops.runLoopsIterBackArray(calc.arrayRandom(50, 100)));
        }
        {
            final Interfacer forEachLoops = new ForEach();
            System.out.println(forEachLoops.runLoopsIter(calc.arrayRandom(50, 100)));
            System.out.println(forEachLoops.runLoopsIterOdd(calc.arrayRandom(50, 100)));
            System.out.println(forEachLoops.runLoopsIterBackArray(calc.arrayRandom(50, 100)));
        }
    }
}
