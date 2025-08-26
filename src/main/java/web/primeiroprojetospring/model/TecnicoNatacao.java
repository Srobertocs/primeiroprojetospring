package web.primeiroprojetospring.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import web.primeiroprojetospring.service.SorteDiariaService;

@Component
public class TecnicoNatacao implements Tecnico {

	private static final Logger logger = LoggerFactory.getLogger(TecnicoNatacao.class);

	private SorteDiariaService sorteDiariaService;

	public TecnicoNatacao(@Qualifier("sorteDiariaRandomicaService") SorteDiariaService sorteDiariaService) {
		logger.info(">>>>>>>>> TecnicoNatacao: dentro do construtor de inicialização");
		this.sorteDiariaService = sorteDiariaService;
	}

	@Override
	public String getExercicioDiario() {
		return "Nade 200m como aquecimento";
	}

	@Override
	public String getSorteDiaria() {
		return sorteDiariaService.getSorteDiaria();
	}

}
