package my.company.kevoree;

import org.kevoree.annotation.ComponentType;
import org.kevoree.annotation.Start;
import org.kevoree.annotation.Stop;

/**
 *
 * Created by leiko on 12/2/16.
 */
@ComponentType(version = 1)
public class HelloWorld {

    @Start
    public void start() {
        System.out.println("Hello World!");
    }

    @Stop
    public void stop() {
        System.out.println("Bye World!");
    }
}
