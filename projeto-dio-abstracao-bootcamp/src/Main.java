import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Um");
        curso1.setDescricao("Descrição Curso Um");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Dois");
        curso2.setDescricao("Descrição Curso Dois");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Titulo Mentoria");
        mentoria.setDescricao("Descricao Mentoria");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java DEVELOPER");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRyan = new Dev();
        devRyan.setNome("Bryan");
        devRyan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devRyan.getConteudosInscritos());
        devRyan.progredir();
        devRyan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devRyan.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devRyan.getConteudosConcluidos());
        System.out.println("XP: " + devRyan.calcularTotalXp());

        System.out.println("----------");

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devDavi.getConteudosInscritos());
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + devDavi.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devDavi.getConteudosConcluidos());
        System.out.println("XP: " + devDavi.calcularTotalXp());
    }
}
