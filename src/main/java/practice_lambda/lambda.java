package practice_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lambda {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        ayniSatirdaYaz(nums);
        System.out.println();
        ciftYazdri(nums);
        System.out.println();
        karesi(nums);
        System.out.println();
        toplamKare(nums);
        System.out.println(nums);
        maxValuBul(nums);

    }

    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void ayniSatirdaYaz(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));
    }

    //2)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    //3)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void ciftYazdri(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //4)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


    //5)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void karesi(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    //6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    public static void toplamKare(List<Integer> nums) {
        Integer sum = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum);//456
    }


    //8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    public static void karelerCarpimi(List<Integer> nums) {
        Integer carpim = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, (t, u) -> t * u);

        System.out.print(carpim);
    }
    //9)Create a method to find the "maximum value" from the list elements

    public static void maxValuBul(List<Integer> nums) {
        Integer max = nums.stream().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //10)Create a method to find the minimum value from the list elements
    //1.Yol:
    public static void minValuBul(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
        System.out.print(min);
    }
}