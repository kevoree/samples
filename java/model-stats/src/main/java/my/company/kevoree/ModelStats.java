package my.company.kevoree;

import org.kevoree.ContainerRoot;
import org.kevoree.annotation.ComponentType;
import org.kevoree.annotation.KevoreeInject;
import org.kevoree.annotation.Start;
import org.kevoree.annotation.Stop;
import org.kevoree.api.ModelService;
import org.kevoree.api.handler.ModelListenerAdapter;
import org.kevoree.log.Log;

/**
 *
 * Created by leiko on 12/2/16.
 */
@ComponentType(version = 1, description = "Prints out current model statistics on every update")
public class ModelStats extends ModelListenerAdapter {

    @KevoreeInject
    private ModelService modelService;

    @Start
    public void start() {
        modelService.registerModelListener(this);
    }

    @Stop
    public void stop() {
        modelService.unregisterModelListener(this);
    }

    public void modelUpdated() {
        ContainerRoot model = modelService.getCurrentModel().getModel();
        Log.info("Model has been updated:");
        Log.info("  Instances:");
        Log.info("    - nodes:       {}", model.getNodes().size());
        Log.info("    - components:  {}", model.select("/nodes[*]/components[*]").size());
        Log.info("    - groups:      {}", model.getGroups().size());
        Log.info("    - channels:    {}", model.getHubs().size());
        Log.info("    - bindings:    {}", model.getmBindings().size());

        Log.info("  Types:");
        Log.info("    - namespaces:  {}", model.getPackages().size());
        Log.info("    - typeDefs:    {}", model.select("/packages[*]/typeDefinitions[*]").size());
        Log.info("    - deployUnits: {}", model.select("/packages[*]/deployUnits[*]").size());
    }
}
