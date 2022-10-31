package com.simbirsoft.page;

import com.codeborne.selenide.Configuration;
import com.simbirsoft.config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

import static java.lang.String.format;

public class BasePageDemoQA {
    public static CredentialsConfig credentials =
            ConfigFactory.create(CredentialsConfig.class);
    @BeforeAll
    public static void helperDriver() {
        Configuration.remote = format("https://%s:%s@selenoid.autotests.cloud/wd/hub/",
                credentials.login(),
                credentials.password());
        Configuration.startMaximized = true;
    }
}
