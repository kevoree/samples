package my.company.kevoree;

import org.kevoree.annotation.ComponentType;
import org.kevoree.annotation.Param;
import org.kevoree.annotation.Start;

/**
 *
 * Created by leiko on 12/9/16.
 */
@ComponentType(version = 1)
public class LessDummyPrinter extends DummyPrinter {

    @Param(defaultValue = "Hello World!")
    private String text;

    @Start
    public void start() {
        for (int i=0; i < getTimes(); i++) {
            System.out.println(text);
        }
    }
}
