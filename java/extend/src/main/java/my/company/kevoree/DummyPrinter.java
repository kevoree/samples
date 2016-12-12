package my.company.kevoree;

import org.kevoree.annotation.ComponentType;
import org.kevoree.annotation.Param;
import org.kevoree.annotation.Start;

/**
 *
 * Created by leiko on 12/9/16.
 */
@ComponentType(version = 1)
public class DummyPrinter {

    @Param(defaultValue = "1")
    private int times;

    @Start
    public void start() {
        for (int i=0; i < times; i++) {
            System.out.println("Hello World!");
        }
    }

    protected int getTimes() {
        return this.times;
    }
}
