package learning.packagesAndImports;

import learning.namingconflict.ConflictExample;
import learning.packagesAndImports.importExample.*;
//import learning.packagesAndImports.importExample.MyClass;

public class Main {
    public static void main(String[] args) {
        Example example = new Example(10);
        MyClass myClass = new MyClass();
        System.out.println(example + " " + myClass);
    }
}
