package org.urr.screenner_bot.config.admbot;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("application.properties")
public class AdmBotConfig {
    @Value("${adm.bot.name}")
    String botName;
    @Value("${adm.bot.key}")
    String token;
}
