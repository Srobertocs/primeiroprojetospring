package web.primeiroprojetospring.service;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SorteDiariaRandomicaService implements SorteDiariaService {

    private static final Logger logger = LoggerFactory.getLogger(SorteDiariaRandomicaService.class);
    
   	private String[] sortesDiarias = { 
   				"Cuidado com o lobo em pele de cordeiro",
   				"A diligência é a mãe da boa sorte",
   				"A jornada é a recompensa"
   			};
   	private Random random = new Random();
   
   	public SorteDiariaRandomicaService() {
   		logger.info(">>>>>>>>> SorteDiariaRandomicaService: dentro do construtor padrão");
   	}
   
   	@Override
   	public String getSorteDiaria() {
   		return sortesDiarias[random.nextInt(sortesDiarias.length)];
   	}

}
