package Lecture2;

public class Converter {
    public static void main(String[] args) {

        System.out.println(bin2deci(1011));
        System.out.println(any2deci(1011, 2));
    }

    public static int bin2deci(int bin) {

        int deci = 0;
        int place = 1;
        while (bin > 0) {
            int r = bin % 10;
            deci = deci + r * place;
            bin = bin / 10;
            place = place * 2;
        }
        return deci;
    }

    public static int any2deci(int any, int base) {

        int deci = 0;
        int place = 1;
        while (any > 0) {
            int r = any % 10;
            deci = deci + r * place;
            any = any / 10;
            place = place * base;
        }
        return deci;
    }

    public static int deci2bin(int deci) {

        int bin = 0;
        int place = 1;
        while (deci > 0) {
            int r = bin % 2;
            deci = deci + r * place;
            bin = bin / 2;
            place = place * 10;
        }
        return bin;
    }

    public static int deci2any(int deci, int base) {

        int any = 0;
        int place = 1;
        while (deci > 0) {
            int r = deci % base;
            any = any + r * place;
            deci = deci / base;
            place = place * base;
        }
        return any;
    }
    public static int any2any(int any, int base1, int base2){

        int deci = any2deci(any, base1);
        return deci2any(deci,base2);
    }
}