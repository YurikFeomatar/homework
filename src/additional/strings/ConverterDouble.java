package additional.strings;

import java.util.Scanner;

public class ConverterDouble {
    public static void main(String[] args) {
        final ConverterDouble var = new ConverterDouble();
        final Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от -999 999 999 до 999 999 999 с дробью до сотых,  и мы выведем его прописью");
            double number = scan.nextDouble();
            int numberNoDouble = (int) number;
            if (number >= (-999_999_999) && number <= 999_999_999) {
                var.toString(numberNoDouble);
                var.toStringDouble(number);
            } else {
                System.out.println("Вы ввели число вне заданного диапазона");
            }
    }
    public void toStringDouble(double number){
        final String a = String.valueOf(number);
            String numb = a.replaceAll("\\.", "");
            int totalRes = Integer.parseInt(numb);
            totalRes = totalRes % 100;
            String[] twenty = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
            String[] tens = {"сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
            if (totalRes < 20) {
                System.out.println(" целых " + twenty[totalRes] + " сотых");
            }
            if (totalRes >= 20) {
                int high = totalRes / 10;
                int low = totalRes % 10;
                String text = tens[high];
                if (low != 0)
                    text += " " + twenty[low];
                System.out.println(" целых " + text + " сотых");
            }

    }
    public void toString(int num) {
        final String[] twenty = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        final String[] tens = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        final String[] hundreds = {"","сто","двести","триста","четыреста","пятьсот","шестьсот","семьсот","восемьсот","девятьсот"};
        final String[] oneTwo = {"","одна", "две","три", "четыре"};
        boolean minus = false;
        if(num < 0){
            minus = true;
            num = num * -1;
        }
        if (num < 20) {
            String text = twenty[num];
            if(minus == true){
                System.out.print("минус " + text);
            }else
            System.out.print(twenty[num]);
        }
        if (num < 100 && num >=20) {
            int high = num / 10;
            int low = num % 10;
            String text = tens[high];
            if (low != 0)
                text += " " + twenty[low];
            if(minus == true){
                System.out.print("минус " + text);
            }else
            System.out.print(text);
        }
        if (num == 100){
            String text = hundreds[1];
            if(minus == true){
                System.out.print("минус " + text);
            }else
            System.out.print(text);
        }
        if(num <= 999 && num > 100){
            if(num > 100 && num < 120) {
                int high = num / 100;
                int low = num % 100;
                String text = hundreds[high];
                if (low != 0) {
                    text += " " + twenty[low];
                }
                if(minus == true){
                    System.out.print("минус " + text);
                }else
                System.out.print(text);
            }
            if(num > 110 && num <120){
                int high = num / 10;
                int low = num % 10;
                String text = tens[high];
                if (low != 0)
                    text += " " + twenty[low];
                if(minus == true){
                    System.out.print("минус " + text);
                }else
                System.out.print(text);
            }

            if(num >= 120) {
                int high = num / 100;
                int middle = (num % 100) / 10;
                int low = num % 10;
                String text = hundreds[high];
                if (low != 0) {
                    text += " " + tens[middle] + " " + twenty[low];
                } else {
                    text += " " + tens[middle];
                }
                if(minus == true){
                    System.out.print("минус " + text);
                }else
                System.out.print(text);
            }
        }
        if(num < 20_000 && num > 999){
            if(num < 2000){
                int high = num / 1000;
                int middle = (num%1000) / 100;
                int mid = (num%100) / 10;
                int low = num % 10;
                String text = "одна тысяча";
                if(low != 0){
                    text +=" " + hundreds[middle] + " " + tens[mid] + " " + twenty[low];
                }
                if(minus == true){
                    System.out.print("минус " + text);
                }else
                System.out.print(text);
            }
            if(num >= 2000 && num < 3000){
                int high = num / 1000;
                int middle = (num%1000) / 100;
                int mid = (num%100) / 10;
                int low = num % 10;
                String text = "две тысячи";
                if(low != 0){
                    text +=" " + hundreds[middle] + " " + tens[mid] + " " + twenty[low];
                }
                if(low == 0){
                    text +=" " + hundreds[middle] + " " + tens[mid];
                }
                if(minus == true){
                    System.out.print("минус " + text);
                }else
                System.out.print(text);
            }
            if(num < 5000 && num >= 3000){
                int high = num / 1000;
                int middle = (num % 1000) / 100;
                int mid = (num % 100) / 10;
                int low = num % 10;
                String text = twenty[high] + " тысячи";
                if (low != 0) {
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + twenty[low];
                }else{
                    text += " " + hundreds[middle] + " " + tens[mid];
                }
                if(minus == true){
                    System.out.print("минус " + text);
                }else
                System.out.print(text);
            }

            if(num >= 5000){
                int high = num / 1000;
                int middle = (num % 1000) / 100;
                int mid = (num % 100) / 10;
                int low = num % 10;
                String text = twenty[high] + " тысячь";
                if (low != 0) {
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + twenty[low];
                }else{
                    text += " " + hundreds[middle] + " " + tens[mid];
                }
                if(minus == true){
                    System.out.print("минус " + text);
                }else
                System.out.print(text);
            }
        }
        if(num <100_000 && num > 20_000){
            if(num >= 21000 && num < 22000 ||num >= 31000 && num < 32000 ||num >= 41000 && num < 420000 || num >= 51000 && num < 52000 || num >= 61000 && num <62000
                    ||num >= 71000 && num < 72000 ||num >= 81000 && num < 82000||num >= 91000 && num < 92000){
                int high = num / 10000;
                int middle = (num%10000) / 1000;
                int mid = (num%1000) / 100;
                int a = (num%100) / 10;
                int low = num % 10;
                String text = tens[high];
                if(middle == 1){
                    if(low != 0) {
                        text += " " + oneTwo[middle] + " тысяча" + " " + hundreds[mid] + " " + tens[a] + " " + twenty[low];
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }else{
                        text += " " + oneTwo[middle] + " тысяча" + " " + hundreds[mid] + " " + tens[a];
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                }
                if(middle == 2 || middle == 3 || middle == 4){
                    if(low != 0) {
                        text += " " + oneTwo[middle] + " тысячи" + " " + hundreds[mid] + " " + tens[a] + " " + twenty[low];
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }else{
                        text += " " + oneTwo[middle] + " тысячи" + " " + hundreds[mid] + " " + tens[a];
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                }
                if(middle >=5 || middle == 0){
                    if(low != 0) {
                        text += " " + twenty[middle] + " тысячь" + " " + hundreds[mid] + " " + tens[a] + " " + twenty[low];
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }else{
                        text += " " + twenty[middle] + " тысячь" + " " + hundreds[mid] + " " + tens[a];
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                }
            }
        }
        if(num >=100_000 && num <=120_000 || num >=200_000 && num <=220_000 || num >=300_000 && num <=320_000
                || num >=400_000 && num <=420_000 || num >=500_000 && num <=520_000
                || num >=600_000 && num <=620_000 || num >=700_000 && num <=720_000 || num >=800_000 && num <=820_000
                || num >=900_000 && num <=920_000 ){
            int high = num / 100000;
            int middle = (num%100000) / 10000;
            int mid = (num%10000) / 1000;
            int a = (num%1000) / 100;
            int b = (num%100) / 10;
            int low = num % 10;
            String text = hundreds[high];
            if(mid == 1){
                if(low != 0) {
                    text += " " + oneTwo[mid] + " тысяча" + " " + hundreds[a] + " " + tens[b] + " " + twenty[low];
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }else{
                    text += " " + oneTwo[mid] + " тысяча" + " " + hundreds[a] + " " + tens[b];
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
            }
            if(mid == 2 || mid == 3 || mid == 4){
                if(low != 0) {
                    text += " " + oneTwo[mid] + " тысяча" + " " + hundreds[a] + " " + tens[b] + " " + twenty[low];
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }else{
                    text += " " + oneTwo[mid] + " тысяча" + " " + hundreds[a] + " " + tens[b];
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
            }

            if(num <120000 && num >= 105000 || num <220000 && num >= 205000 || num <320000 && num >= 305000
                    || num <420000 && num >= 405000 || num <520000 && num >= 505000 || num <620000 && num >= 605000
                    || num <720000 && num >= 705000 || num <820000 && num >= 805000 || num <920000 && num >= 905000){
                high = num / 100000;
                middle = (num%100000) / 1000;
                mid = (num%10000) / 1000;
                a = (num%1000) / 100;
                b = (num%100) / 10;
                low = num % 10;
                text = hundreds[high];
                if(mid >=5 || mid == 0) {
                    if (low != 0) {
                        text += " " + twenty[middle] + " тысяч" + " " + hundreds[a] + " " + tens[b] + " " + twenty[low];
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    } else {
                        text += " " + twenty[middle] + " тысяч" + " " + hundreds[a] + " " + tens[b];
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                }
            }
            if(num == 100000 || num == 200000 || num == 300000 || num == 400000 || num == 500000 || num == 600000
                    || num == 700000 || num == 800000 || num == 900000){
                high = num / 100000;
                middle = (num%100000) / 1000;
                mid = (num%10000) / 1000;
                a = (num%1000) / 100;
                b = (num%100) / 10;
                low = num % 10;
                text = hundreds[high];
                if(mid >=5 || mid == 0) {
                    if (low != 0) {
                        text += " " + twenty[middle] + " тысяч" + " " + hundreds[a] + " "  + twenty[low];
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    } else {
                        text += " " + twenty[middle] + " тысяч" + " " + hundreds[a] + " " + tens[b];
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                }
            }
        }
        if(num >=120_000 && num < 200_000 || num >=220_000 && num < 300_000 || num >=320_000 && num < 400_000
                || num >=420_000 && num < 500_000 || num >=520_000 && num < 600_000 || num >=620_000 && num < 700_000
                || num >=720_000 && num < 800_000 || num >=820_000 && num < 900_000 || num >=920_000 && num < 1_000_000){
            int high = num / 100000;
            int middle = (num%100000) / 10000;
            int mid = (num%10000) / 1000;
            int a = (num%1000) / 100;
            int b = (num%100) / 10;
            int low = num % 10;
            String text = hundreds[high];
            if(mid >=5 || mid == 0) {
                if (low != 0) {
                    text += " " + tens[middle] + " " + twenty[mid] + " тысяч" + " " + hundreds[a] +  " " + tens[b] + " " + twenty[low];
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                } else {
                    text += " " + tens[middle] + " " + twenty[mid] + " тысяч" + " " + hundreds[mid] + " " + tens[a];
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
            }
        }
        if(num >= 1_000_000 && num < 20_000_000){
            int high = num / 1_000_000;             //миллионы
            int middle = (num%1_000_000) / 100_000; // сотни тысяч
            int mid = (num%100_000) / 10_000; // десятки тысяч
            int a = (num%10_000) / 1000; // единицы тысяч
            int b = (num%1000) / 100; // сотни
            int c = (num%100) /10; // десятки
            int low = num % 10; // единицы
            String text = twenty[high];
            if(high == 1) {
                text += " " + "миллион";
                if (middle == 0 && mid == 0 && a == 0 && b == 0 && c == 0 && low == 0) {   // проверка на миллионы
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid == 0 && a == 0){               //проверка на сотни тысяч
                    text += " " + hundreds[middle] + " тысяч";
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(mid == 1 && c !=1){
                    a = (num%100_000) / 1000;
                    text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на twenty тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(mid == 1 && c == 1){
                    a = (num%100_000) / 1000;
                    low = num%100;
                    text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] +  " " + twenty[low];  // проверка на twenty единицы
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 0 && c != 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на десятки тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 0 && c == 1 ){
                    low = num%100;
                    text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + twenty[low];  // проверка на десятки тысяч
                    if(minus == true){
                        System.out.println("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысяча" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 1 тысячу
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 2){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысячи" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 2 тысячи
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a >= 2 && c!= 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + twenty[a] + " " + "тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на единиц тысяч > 2
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
            }
            if(high > 1 && high <= 4){
                text += " " + "миллиона";
                if (middle == 0 && mid == 0 && a == 0 && b == 0 && c == 0 && low == 0) {   // проверка на миллионы
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid == 0 && a == 0){               //проверка на сотни тысяч
                    text += " " + hundreds[middle] + " тысяч";
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(mid == 1 && c !=1){
                    a = (num%100_000) / 1000;
                    text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на twenty тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(mid == 1 && c == 1){
                    a = (num%100_000) / 1000;
                    low = num%100;
                    text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] +  " " + twenty[low];  // проверка на twenty единицы
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 0 && c != 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на десятки тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 0 && c == 1 ){
                    low = num%100;
                    text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + twenty[low];  // проверка на десятки тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысяча" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 1 тысячу
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 2){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысячи" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 2 тысячи
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a >= 2 && c!= 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + twenty[a] + " " + "тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на единиц тысяч > 2
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
            }
            if(high > 4 && high <= 19){
                text += " " + "миллионов";
                if (middle == 0 && mid == 0 && a == 0 && b == 0 && c == 0 && low == 0) {   // проверка на миллионы
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid == 0 && a == 0){               //проверка на сотни тысяч
                    text += " " + hundreds[middle] + " тысяч";
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(mid == 1 && c !=1){
                    a = (num%100_000) / 1000;
                    text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на twenty тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(mid == 1 && c == 1){
                    a = (num%100_000) / 1000;
                    low = num%100;
                    text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] +  " " + twenty[low];  // проверка на twenty единицы
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 0 && c != 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на десятки тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 0 && c == 1 ){
                    low = num%100;
                    text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + twenty[low];  // проверка на десятки тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысяча" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 1 тысячу
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 2){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысячи" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 2 тысячи
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a >= 2 && c!= 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + twenty[a] + " " + "тысячи" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на единиц тысяч > 2
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
            }
        }
        if(num >= 20_000_000 && num < 100_000_000){
            int superHigh = num / 10_000_000; //десятки миллионов
            int high = (num%10000000) /1000000;          //миллионы
            int middle = (num%1_000_000) / 100_000; // сотни тысяч
            int mid = (num%100_000) / 10_000; // десятки тысяч
            int a = (num%10_000) / 1000; // единицы тысяч
            int b = (num%1000) / 100; // сотни
            int c = (num%100) /10; // десятки
            int low = num % 10; // единицы
            String text = tens[superHigh];
            if(superHigh !=0){
                if(high == 1) {
                    text += " " + twenty[high] + " " + "миллион";
                }
                if(high >= 2 && high < 5){
                    text += " " + twenty[high] + " " + "миллиона";
                }
                if(high >= 5 || high == 0){
                    text += " " + twenty[high] + " " + "миллионов";
                }
                if (middle == 0 && mid == 0 && a == 0 && b == 0 && c == 0 && low == 0) {    // проверка на миллионы
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid == 0 && a == 0){               //проверка на сотни тысяч
                    text += " " + hundreds[middle] + " тысяч";
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(mid == 1 && c !=1){
                    a = (num%100_000) / 1000;
                    text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на twenty тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(mid == 1 && c == 1){
                    a = (num%100_000) / 1000;
                    low = num%100;
                    text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] +  " " + twenty[low];  // проверка на twenty единицы
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 0 && c != 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на десятки тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 0 && c == 1 ){
                    low = num%100;
                    text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + twenty[low];  // проверка на десятки тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысяча" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 1 тысячу
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 2){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысячи" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 2 тысячи
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a >= 2 && c!= 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + twenty[a] + " " + "тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на единиц тысяч > 2
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
            }
        }
        if(num >= 100_000_000 && num < 1_000_000_000){
            int superiorHigh = num / 100_000_000; // сотни миллионов
            int superHigh = (num%100_000_000) / 1000_0000; //десятки миллионов
            int high = (num%10_000_000) /1000000;          //миллионы
            int middle = (num%1_000_000) / 100_000; // сотни тысяч
            int mid = (num%100_000) / 10_000; // десятки тысяч
            int a = (num%10_000) / 1000; // единицы тысяч
            int b = (num%1000) / 100; // сотни
            int c = (num%100) /10; // десятки
            int low = num % 10; // единицы
            String text = hundreds[superiorHigh];
            if(superHigh != 1) {
                text += " " + tens[superHigh];
                if(high == 1) {
                    text += " " + twenty[high] + " " + "миллион";
                }
                if(high >= 2 && high < 5){
                    text += " " + twenty[high] + " " + "миллиона";
                }
                if(high >= 5 || high == 0){
                    text += " " + twenty[high] + " " + "миллионов";
                }
                if (middle == 0 && mid == 0 && a == 0 && b == 0 && c == 0 && low == 0) {   // проверка на миллионы
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid == 0 && a == 0){               //проверка на сотни тысяч
                    text += " " + hundreds[middle] + " тысяч";
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(mid == 1 && c !=1){
                    a = (num%100_000) / 1000;
                    text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на twenty тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(mid == 1 && c == 1){
                    a = (num%100_000) / 1000;
                    low = num%100;
                    text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] +  " " + twenty[low];  // проверка на twenty единицы
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 0 && c != 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на десятки тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 0 && c == 1 ){
                    low = num%100;
                    text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + twenty[low];  // проверка на десятки тысяч
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысяча" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 1 тысячу
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a == 2){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысячи" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 2 тысячи
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
                if(middle !=0 && mid != 0 && a >= 2 && c!= 1){
                    text += " " + hundreds[middle] + " " + tens[mid] + " " + twenty[a] + " " + "тысячи" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на единиц тысяч > 2
                    if(minus == true){
                        System.out.print("минус " + text);
                    }else
                    System.out.print(text);
                }
            }
            if(superHigh == 0){
                if(high > 1 && high <= 4) {
                    if (middle == 0 && mid == 0 && a == 0 && b == 0 && c == 0 && low == 0) {   // проверка на миллионы
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (middle != 0 && mid == 0 && a == 0) {               //проверка на сотни тысяч
                        text += " " + hundreds[middle] + " тысяч";
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (mid == 1 && c != 1) {
                        a = (num % 100_000) / 1000;
                        text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на twenty тысяч
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (mid == 1 && c == 1) {
                        a = (num % 100_000) / 1000;
                        low = num % 100;
                        text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] + " " + twenty[low];  // проверка на twenty единицы
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (middle != 0 && mid != 0 && a == 0 && c != 1) {
                        text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на десятки тысяч
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (middle != 0 && mid != 0 && a == 0 && c == 1) {
                        low = num % 100;
                        text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + twenty[low];  // проверка на десятки тысяч
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (middle != 0 && mid != 0 && a == 1) {
                        text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысяча" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 1 тысячу
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (middle != 0 && mid != 0 && a == 2) {
                        text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысячи" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 2 тысячи
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (middle != 0 && mid != 0 && a >= 2 && c != 1) {
                        text += " " + hundreds[middle] + " " + tens[mid] + " " + twenty[a] + " " + "тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на единиц тысяч > 2
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                }
            }
            if(superHigh == 0) {
                if (high > 4 && high <= 19) {
                    if (middle == 0 && mid == 0 && a == 0 && b == 0 && c == 0 && low == 0) {
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else// проверка на миллионы
                        System.out.print(text);
                    }
                    if (middle != 0 && mid == 0 && a == 0) {               //проверка на сотни тысяч
                        text += " " + hundreds[middle] + " тысяч";
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (mid == 1 && c != 1) {
                        a = (num % 100_000) / 1000;
                        text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на twenty тысяч
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (mid == 1 && c == 1) {
                        a = (num % 100_000) / 1000;
                        low = num % 100;
                        text += " " + hundreds[middle] + " " + twenty[a] + " тысяч" + " " + hundreds[b] + " " + twenty[low];  // проверка на twenty единицы
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (middle != 0 && mid != 0 && a == 0 && c != 1) {
                        text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low];  // проверка на десятки тысяч
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (middle != 0 && mid != 0 && a == 0 && c == 1) {
                        low = num % 100;
                        text += " " + hundreds[middle] + " " + tens[mid] + " тысяч" + " " + hundreds[b] + " " + twenty[low];  // проверка на десятки тысяч
                        if(minus == true){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (middle != 0 && mid != 0 && a == 1) {
                        text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысяча" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 1 тысячу
                        if(minus){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (middle != 0 && mid != 0 && a == 2) {
                        text += " " + hundreds[middle] + " " + tens[mid] + " " + oneTwo[a] + " " + "тысячи" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на 2 тысячи
                        if(minus){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                    if (middle != 0 && mid != 0 && a >= 2 && c != 1) {
                        text += " " + hundreds[middle] + " " + tens[mid] + " " + twenty[a] + " " + "тысяч" + " " + hundreds[b] + " " + tens[c] + " " + twenty[low]; // проверка на единиц тысяч > 2
                        if(minus){
                            System.out.print("минус " + text);
                        }else
                        System.out.print(text);
                    }
                }
            }
        }
    }
}
