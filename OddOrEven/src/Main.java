public class Main {

    public static void main(String[] args) {
        System.out.println(evenOrOddNoModul(1));
        System.out.println(evenOrOddNoModul(2));
        System.out.println(evenOrOddNoModul(3));
        System.out.println(evenOrOddNoModul(4));

    }

    public static String evenOrOdd(int a){
        int b=a%2;
        if(b==0) return "Number is even";
        else return "Number id odd";
    }

    public static String evenOrOddNoModul(int a) {
        if ((a & 2) == 0) {
            return "ok";
        }
        else return "not ok";
    }


}
