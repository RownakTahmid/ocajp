package learning.javabasics.staticimport;

import learning.javabasics.namingconflict.ConflictExample;

import static java.lang.Math.*;
import java.lang.Exception;
import static java.lang.System.out;

public class StaticImportExample {
    public static void main(String[] args) {
        double m = max(10,45);
        double p =  PI;
        out.println(m + "  " + p );
        out.println(random());
        Config.printConfig();
        ConflictExample.print();
        long l = 1_048_129_121L;
        Long l1 = 10L;
        Byte b = (byte)127L;
    }
}
