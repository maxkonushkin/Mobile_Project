package config;
import org.aeonbits.owner.Config;

@Config.Sources({

        "classpath:${env}.properties",
        "classpath:local.properties"
})

public interface LocalConfig extends Config {

    @Key("PlatformVersion")
    String getPlatformVersion();

    @Key("DeviceName")
    String getDeviceName();

}