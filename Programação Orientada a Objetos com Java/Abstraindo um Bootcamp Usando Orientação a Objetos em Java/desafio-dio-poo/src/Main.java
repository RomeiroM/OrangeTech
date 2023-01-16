import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);
        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Maria"+ devMaria.getConteudosInscritos());
        
        devMaria.progredir();
        devMaria.progredir();
        
        System.out.println("Conteúdos Conncluídos de Maria "+ devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Conncluídos de Maria "+ devMaria.getConteudosConcluidos());
        System.out.println(devMaria.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos de João"+ devJoao.getConteudosInscritos());
        
        devJoao.progredir();
        
        System.out.println("Conteúdos Concluídos de João"+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Conncluídos de João "+ devMaria.getConteudosConcluidos());
        System.out.println(devJoao.calcularTotalXp());
    }
}
