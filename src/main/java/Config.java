import com.typesafe.config.ConfigFactory;

import java.io.File;

public class Config {

    public static com.typesafe.config.Config load(){
        final File configfile = new File("/home/prakhar/Workspace/java/typesafe-test/config/application.conf");
        com.typesafe.config.Config config = ConfigFactory.parseFile(configfile);
        return config;
    }
}
