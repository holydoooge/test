public class test1 {
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    public static void main(String args[]) {
        test1 ex = new test1();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }
}