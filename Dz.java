import java.util.Scanner;

public class Dz {
    // Задание 1 - Создаем пустой проект.
    public static void main( String[] args )
    {
        //Задание 2 - создаем переменные, инициализирвуем их
        float drob = 1.5F;
        double drobb = 1.55D;
        byte bait = 10;
        long longov = 99995;
        char cr;
        boolean logik = false;


        int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);
        int c = (int)(Math.random()*10);
        int d = (int)(Math.random()*10);
        if (d != 0) System.out.println(calc(a,b,c,d));

        int chislo1 = (int) (Math.random()*20);
        int chislo2 = (int) (Math.random()*20);
        System.out.println(proverka(chislo1,chislo2));
        //Задание 5
        int numbers = ((int)(Math.random() * 21)-10);
        System.out.println(plusorminus(numbers));
        //Задание 6
        int vozvrat = ((int)(Math.random()*11)-5);
        System.out.println(xex(vozvrat));
        //Задание 7
        String name = "Артём";
        System.out.println(hello(name));
        //Задание 8
        Scanner scan = new Scanner(System.in);
        int nomer = scan.nextInt();
        System.out.println(nomerr(nomer));




}

    //Задание 3 - Написать метод, вычисляющий выражение a*(b+(c/d)). a,b,c,d - входные параметры.
    public static int calc(int a, int b ,int c,int d) {
        return(a*(b+(c/d)));
    }
    //Задание 4 - Написать метод принимающий на вход 2 числа, проверить входит ли их сумма в диапазон чисел от 10 до 20
    public static boolean proverka(int chislo1,int chislo2) {
        int sum = chislo1+chislo2;
        System.out.println(sum);
        return(sum>=10 & sum <=20);
    }
    //Задание 5 - Написать метод, метод принимает целое число, проверяет положительное оно или нет
    public static String plusorminus(int numbers){
        System.out.println(numbers);
        if (numbers>=0) return("Положительное");
        else {
            return("Отрицательное");
        }
    }
    //Задание 6 если число отрицательное - true.
    public static boolean xex(int vozvrat) {
        System.out.println(vozvrat);
        if (vozvrat<0) {
            return(true);
        }
        else {
            return(false);
        }
    }
    //Задание 7 Написать метод, в который в качестве параметра передается строка,обозначающая имя, вывести на консоль Привет, указанное имя.
    public static String hello(String name) {
        return("Привет " +name);
    }
    //Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    public static String nomerr(int nomer) {
        if ((nomer%4==0 && nomer%100!=0)|| nomer % 400 == 0) {
            return("Год весокостный!");
        }
        else {
            return("Год не весокостный");
        }
    }

}