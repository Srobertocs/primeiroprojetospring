package web.primeiroprojetospring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.primeiroprojetospring.config.EsportesConfig;
import web.primeiroprojetospring.model.Tecnico;
//import web.primeiroprojetospring.model.TecnicoPingPong;
//import web.primeiroprojetospring.model.TecnicoNatacao;

public class EsportesAppSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EsportesConfig.class);

        Tecnico tecnico1 = context.getBean("tecnicoPingPong", Tecnico.class);

        Tecnico tecnico2 = context.getBean("tecnicoNatacao", Tecnico.class);

        System.out.println(tecnico1.getExercicioDiario());
        System.out.println(tecnico1.getSorteDiaria());

        System.out.println("===================================");

        System.out.println(tecnico2.getExercicioDiario());
        System.out.println(tecnico2.getSorteDiaria());
        context.close();
    }
}
