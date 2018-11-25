import com.typesafe.config.ConfigObject;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        com.typesafe.config.Config conf = Config.load();
        final String key = conf.getString("main-conf.key");
        final List<? extends ConfigObject> objectList = conf.getObjectList("main-conf.list");
        System.out.println("Key is " + key);
        objectList.stream().forEach(e -> {
            System.out.println((((ConfigObject) e).get("name").unwrapped()));
            System.out.println((((ConfigObject) e).get("age")   ));
        });
    }
}
