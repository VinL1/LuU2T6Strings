public class Main {
    public static void main(String[] args) {
        String str1 = "A";
        str1 += 1;
        str1 += 2;
        str1 += 3;
        str1 += "B";
        System.out.println("str1 = " + str1);

        String str2 = "0";
        str2 += 1;
        str2 += 2;
        str2 += 3;
        System.out.println("str2 = " + str2);

        String str3 = "0" + 1;
        str3 += 2 + 3;
        System.out.println("str3 = " + str3);

        String str4 = 1 + 2 + "3";
        str4 += 4 + 5;
        str4 += 6;
        System.out.println("str4 = " + str4);
    }
}