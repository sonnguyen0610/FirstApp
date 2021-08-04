public class Variable {
    static  int a=100;
    static int b=200;
    public static void main(String[] args) {
        //kiểu nguyên thuỷ
        final double PI = 3.14;
        short s = 10;
        int i = 100;
        long l = 100000000;
        long l2 = 100L;

        float f = 3.1f;
        double d = 5.7d;
        char c = 'a';
        char c2 = '5';
        char c3 = 65; //'A'

        boolean t = true;
        boolean fl = false;
        // kiểu tham chiếu
        String str="cewdv'56'";
        System.out.println(str);
        Integer ref_I = 100;
        ref_I.byteValue();//có các method để tham chiếu tới


        System.out.println("Truoc Swap: a=" +a+" b= "+b);
        swap(a,b);
        System.out.println("Sau Swap: a=" +a+" b= "+b);
        //
        Season ss=Season.SPRING;
        Season ss1=Season.SUMMER;
        SimpleSeason ss2=SimpleSeason.AUTUMN;
        System.out.println(ss);
        System.out.println(ss1.getValue());
        System.out.println(ss2);
    }

//    static void swap(int a, int b) {
//        int tmp = a;
//        a = b;
//        b = tmp;
//        System.out.println("Trong swap: a=" +a+" b= "+b);
//    }
    static void swap(Integer a, Integer b) {
        a=99;
        Integer tmp = a;
        a = b;
        b = tmp;
        System.out.println("Trong swap: a=" +a+" b= "+b);
    }
}
