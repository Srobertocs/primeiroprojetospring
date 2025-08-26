package web.primeiroprojetospring.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = {"web.primeiroprojetospring.model", "web.primeiroprojetospring.service"}) 

public class EsportesConfig {

    private static final Logger logger = LoggerFactory.getLogger(EsportesConfig.class);

    public EsportesConfig() {
        logger.info(">>>>>>>>> EsportesConfig: dentro do construtor padrão");
    }

}
