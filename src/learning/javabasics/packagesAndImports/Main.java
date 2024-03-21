package learning.javabasics.packagesAndImports;

import learning.javabasics.namingconflict.ConflictExample;
import learning.javabasics.packagesAndImports.importExample.*;
//import learning.javabasics.packagesAndImports.importExample.MyClass;

public class Main {
    public static void main(String[] args) {
        Example example = new Example(10);
        MyClass myClass = new MyClass();
        System.out.println(example + " " + myClass);
    }
}
