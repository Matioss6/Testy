public class Main {

    public static void main(String[] args) {


        // StringBuilder
        System.out.println("String Buildier from now on");

        StringBuilder name = new StringBuilder();
        StringBuilder name2 = new StringBuilder();
        System.out.println(name.equals(name2));

        String a ="aa";
        name.append(a);
        name2.append(a);
        System.out.println(name.equals(name2));

        name.append("lll");
        System.out.println(name.toString());
        name.append(a);
        System.out.println(name.toString());

        name.insert(4,a);
        System.out.println(name.toString());

        System.out.println(name.lastIndexOf("l"));

        // StringBuffer
        System.out.println("String Buffer from now on");

        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();
        buffer1.append("-123ijli45");
        buffer2.append("-123ijli45");
        System.out.println(buffer1.hashCode());
        System.out.println(buffer2.hashCode());
        System.out.println(buffer1.equals(buffer2));
        System.out.println(buffer1.compareTo(buffer2));

        System.out.println("Strings from now on");

        String one = "aaa";
        System.out.println(one.hashCode());
        String two = "AAA";
        System.out.println(two.hashCode());
        System.out.println(one.compareTo(two));
        System.out.println(one.equals(two));
        System.out.println(one.equalsIgnoreCase(two));
        System.out.println(one.concat(two));
        System.out.println(one);
        System.out.println(one.hashCode());
    }
}
