package org.urr.screenner_bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class ScreennerBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScreennerBotApplication.class, args);
    }

}
