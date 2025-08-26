package web.primeiroprojetospring.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import web.primeiroprojetospring.service.SorteDiariaService;

@Component
//@Scope("prototype")
public class TecnicoPingPong implements Tecnico {

	private static final Logger logger = LoggerFactory.getLogger(TecnicoPingPong.class);

	private SorteDiariaService sorteDiariaService;

	public TecnicoPingPong(@Qualifier("sorteDiariaFelizService") SorteDiariaService sorteDiariaService) {
		logger.info(">>>>>>>>> TecnicoPingPong: dentro do construtor de inicialização");
		this.sorteDiariaService = sorteDiariaService;
	}

	@Override
	public String getExercicioDiario() {
		return "Pratique seu saque";
	}

	@Override
	public String getSorteDiaria() {
		return sorteDiariaService.getSorteDiaria();
	}
}
