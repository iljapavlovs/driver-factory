package io.iljapavlovs.driverfactory.config;


import io.iljapavlovs.driverfactory.config.ApplicationProperties.ApplicationProperty;

public class Constants {
    public static final int WAIT_SHORT_SECONDS = ApplicationProperties.getInteger(ApplicationProperties.ApplicationProperty.WAIT_SHORT_SECONDS);
    public static final int WAIT_NORMAL_SECONDS = ApplicationProperties.getInteger(ApplicationProperties.ApplicationProperty.WAIT_NORMAL_SECONDS);
    public static final int WAIT_LONG_SECONDS = ApplicationProperties.getInteger(ApplicationProperties.ApplicationProperty.WAIT_LONG_SECONDS);
    public static final boolean HEADLESS = ApplicationProperties.getBoolean(ApplicationProperty.HEADLESS);

}