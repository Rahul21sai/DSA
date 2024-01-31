package OOps_38_2;

import javax.xml.namespace.QName;

public class InnerClasses {//outside classes cannot be static
    static class Test{//inner classes can be static
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("rahul");
        Test b = new Test("rohith");

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);
    }
}// static are ussed in compile time

