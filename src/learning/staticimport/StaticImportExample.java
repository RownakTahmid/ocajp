package learning.staticimport;

import learning.namingconflict.ConflictExample;

import static java.lang.Math.*;
import static java.lang.System.out;

public class StaticImportExample {
    public static void main(String[] args) {
        double m = max(10,45);
        double p =  PI;
        out.println(m + "  " + p );
        out.println(random());
        Config.printConfig();
        ConflictExample.print();
    }
}
