package home_work_1;

public class PriorityOperators {
    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 2;
        int c = 8;
        int res1 = a1 +b1 / c;
        System.out.println(res1); //Результат 5, т.к. на выходе получается дробное число (5.25), которое потерялось из за типа int..

        int a2 = 5;
        int b2 = 2;
        int c2 = 8;
        int res2 = (a2 + b2) / c2;
        System.out.println(res2); //Результат 0, т.к. на выходе получается дробное число (0.875), которое потерялось из за типа int.

        int a3 = 5;
        int b3 = 2;
        int c3 = 8;
        int res3 = (a3 + b3++) / c3;
        System.out.println(res3); //Результат 0, т.к. на выходе получается дробное число (0.875), которое потерялось из за типа int. Инкремент b3++ не вывел +1
                                //т.к. не успел вернуть значение в b3.

        int a4 = 5;
        int b4 = 2;
        int c4 = 8;
        int res4 = (a4 + b4++)/ --c4;
        System.out.println(res4); //Проверяем декремент --с4 (7) 5+2=7; 7/7=1     Инкремент b4++ не вывел +1 т.к. не успел вернуть значение в b4.

        int a5 = 5;
        int b5 = 2;
        int c5 = 8;
        int res5 = ((a5 * b5 >> b5++) / --c5);
        System.out.println(res5); //Проверяем декремент --c5 (7); Инкремент b5++ не вывел +1 т.к. не успел вернуть значение в b5 (2).
                               //Проверяем умножение a5*b5 (10); Проверяем сдвиг битов вправо (1010) -2 бита = 10 в двоичной с/с, что равняется 2 в десятичной с/с.
                                //Делим 2/7; в результате дробное число, (0,285714286) которое потерялось из за типа int.

        int a6 = 5;
        int f6 = 7;
        int r6 = 20;
        int o6 = 68;
        int p6 = 22;
        int b6 = 2;
        int c6 = 8;
        int res6 = (a6 +f6 > r6 ? o6 : p6 * b6 >> b6++) / --c6;
        System.out.println(res6);// Проверяем декремент --c6 (7); Инкремент b6++ не вывел +1 т.к. не успел вернуть значение в b6 (2).
                                // Проверяем умножение p6 и b6 (44); Проверяем сумму a6 и f6 (12); Проверяем равенство a6+b6 > r6 12>20? (false) и присваиваем
                                // второе значение P6 * b6 (44); Проверяем сдвиг битов вправо (101100) -2 бита = 1011 в двоичной с/с что равняется 11 в
                                // десятичной с/с. Делим 11/7; в результате дробное число, (1,57142857) которое потерялось из за типа int.

        int a7 = 5;
        int f7 = 7;
        int r7 = 20;
        int o7 = 68;
        int p7 = 22;
        int b7 = 2;
        int c7 = 8;
        //int res7 = (a7 +f7 > r7 ? o7 >= o7 : p7 * b7 >> b7++) / --c7;
        System.out.println("в задании 2,7 Ошибка типов");
                                // Проверяем декремент --c7 (7); Инкремент b7++ не вывел +1 т.к. не успел вернуть
                               // значение в b7 (2). Проверяем сумму a7 + f7 (12); Проверяем выражение 12>20 (false) и присвиваем второе значение p7 * b7 (44);
                                // Проверяем сдвиг битов вправо (101100) -2 бита = 1011 в двоичной с/с что равняется 11 в
                                // десятичной с/с. Делим 11/7; в результате дробное число, (1,57142857) которое потерялось из за типа int.
                                // Проверяем значение равенства двух половин 5+7>20 >= 68 и получаем ошибку Типов.

        int a8 = 6;
        int b8 = 2;
        int c8 = 3;
        int d8 = 12;
        int e8 = 8;
        boolean res8 = a8 - b8 > c8 && d8 * d8 <= e8;
        System.out.println(res8); //Проверяем умножение d8 * d8 (144); проверяем вычитание a8 - b8 (4); Проверяем
                                    //первую часть выражения 4>3 (true); проверяем вторую часть выражения 144<=8 (false)
                                    //Соответсвенно, если хотя бы одна из сторон равна false, всё выражение становится
                                    //false

        boolean a9 = true;
        boolean b9 = false;
        System.out.println(a9 && b9); //выражение будет True только в том случае если все значения будут True.
                                        //Поэтому false.

    }
}
