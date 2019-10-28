package test.leecode;

/**
 * Created by xiaomi on 2019/10/19.
 */
public class test {

    static class Parent{
        String name = "P";

        public void print(){
            System.out.println(name);
        }
    }

    static class Sub extends Parent{
        String name = "Sub";

        @Override
        public void print(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
//        Parent p = new Sub();
//        System.out.println(p.name);
//        p.print();

        String s = "abc";
        String ret = getObj(String.class, s);
        System.out.print(ret);
    }

    public static final <T> T getObj(Class<T> c, Object o){
        return (T)o;
    }
}
