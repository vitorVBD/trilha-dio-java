import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        System.out.println("XP antes: " + devVitor.calcularTotalXp());

        Dev devTeste = new Dev();
        devTeste.setNome("Teste");

        devVitor.inscreverBootcamp(bootcamp);
        devVitor.progredir();

        System.out.println("Conteúdos inscritos de Vitor: " + devVitor.getConteudosInscritos());
        System.out.println("Conteúdos concluidos de Vitor: " + devVitor.getConteudosConcluidos());
        System.out.println("XP: " + devVitor.calcularTotalXp());
        devVitor.progredir();
        System.out.println("--------------------------------");
        System.out.println("Conteúdos inscritos depois da segunda progressão de Vitor: " + devVitor.getConteudosInscritos());
        System.out.println("Conteúdos concluidos depois da segunda progressão de Vitor: " + devVitor.getConteudosConcluidos());
        System.out.println("XP: " + devVitor.calcularTotalXp());


        System.out.println("-------------------------------------");
        System.out.println("Conteúdos inscritos de Teste: " + devTeste.getConteudosInscritos());
        System.out.println("Conteúdos inscritos de Teste: " + devTeste.getConteudosConcluidos());
    }
}
