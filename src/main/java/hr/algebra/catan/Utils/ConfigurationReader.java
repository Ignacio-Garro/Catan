package hr.algebra.catan.Utils;

import hr.algebra.catan.exception.InvalidConfigurationKeyNameException;
import hr.algebra.catan.jndi.InitialDirContextCloseable;
import hr.algebra.catan.Model.ConfigurationKey;

import javax.naming.Context;
import javax.naming.NamingException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Properties;

public class ConfigurationReader {
    private static ConfigurationReader reader = null;

    private static final Hashtable<String, String> environment;

    static {
        environment = new Hashtable<>();
        environment.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.fscontext.RefFSContextFactory");
        environment.put(Context.PROVIDER_URL,"file:D:/tic-tac-toe/conf");
    }

    public static Integer readIntegerConfigurationValue(ConfigurationKey key) {
        String value = readStringConfigurationValue(key);
        return Integer.parseInt(value);
    }

    public static String readStringConfigurationValue(ConfigurationKey key) {
        try (InitialDirContextCloseable context = new InitialDirContextCloseable(environment)){
            return readValueForKey(context, key);
        }
        catch(NamingException ex) {
            ex.printStackTrace();
        }

        return "";
    }

    private static String readValueForKey(Context context, ConfigurationKey key)  {
        String fileName = "conf.properties";

        try {
            Object object = context.lookup(fileName);
            Properties props = new Properties();
            props.load(new FileReader(object.toString()));
            String value = props.getProperty(key.getKeyName());
            if(value == null) {
                throw new InvalidConfigurationKeyNameException(
                        "The configuration key '" + key.getKeyName()
                                + "' does not exist"
                );
            }

            return props.getProperty(key.getKeyName());
        }
        catch(NamingException | IOException ex) {
            throw new RuntimeException("The configuration cannot be read!", ex);
        }
    }
}
