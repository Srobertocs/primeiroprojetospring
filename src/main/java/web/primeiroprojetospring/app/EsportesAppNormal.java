package web.primeiroprojetospring.app;

import web.primeiroprojetospring.model.Tecnico;
import web.primeiroprojetospring.model.TecnicoNatacao;
//import web.primeiroprojetospring.model.TecnicoPingPong;
//import web.primeiroprojetospring.service.SorteDiariaFelizService;
import web.primeiroprojetospring.service.SorteDiariaRandomicaService;

public class EsportesAppNormal {
    public static void main(String[] args) {
        /*SorteDiariaFelizService sorteDiariaFeliz = new SorteDiariaFelizService();

        Tecnico tecnico = new TecnicoPingPong(sorteDiariaFeliz);

        System.out.println("Exercicio diario: " + tecnico.getExercicioDiario());
        System.out.println("Sorte diaria: " + tecnico.getSorteDiaria());*/

        SorteDiariaRandomicaService sorteDiariaRandomica = new SorteDiariaRandomicaService();

        Tecnico tecnico = new TecnicoNatacao(sorteDiariaRandomica);

        System.out.println(tecnico.getExercicioDiario());
        System.out.println(tecnico.getSorteDiaria());
    }
}
