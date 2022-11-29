package java_dz_2;

public class dz_2_2 {
    public static void main(String[] args) {
        String stringFirst = "найти наименьшее окно в строчке";
        String stringSecond = "екчортс в онко еешьнемиан итйан";
        StringBuilder sb = new StringBuilder(stringFirst);
        String stringT = sb.reverse().toString();
        System.out.println(stringSecond.compareTo(stringT) == 0);
    

    
    }
}

