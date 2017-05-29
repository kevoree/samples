package my.company.kevoree;

import org.kevoree.annotation.ComponentType;
import org.kevoree.annotation.Start;
import org.kevoree.annotation.Stop;
import org.kevoree.log.Log;

/**
 *
 * Created by leiko on 5/29/17.
 */
@ComponentType(version = 1)
public class HelloWorld {

    @Start
    public void start() {
        Log.info("Hello world from starter-parent");
    }

    @Stop
    public void stop() {
        Log.info("Bye world from starter-parent");
    }
}
