import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(12);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição bootcamp java developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Rodrigo: ");
        for(Conteudo rodrigoConteudoInscrito : devRodrigo.getConteudosInscritos()){
            System.out.println("---- " + rodrigoConteudoInscrito);
        }
        devRodrigo.progredir();
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("Conteudos concluídos Rodrigo: ");
        for(Conteudo rodrigoConteudoConcluido : devRodrigo.getConteudosConcluidos()){
            System.out.println("---- " + rodrigoConteudoConcluido);
        }
        System.out.println("Conteudos inscritos Rodrigo: ");
        for(Conteudo rodrigoConteudoInscrito : devRodrigo.getConteudosInscritos()){
            System.out.println("---- " + rodrigoConteudoInscrito);
        }
        System.out.println("XP: " + devRodrigo.calcularTotalXp());
        System.out.println("---------------");


        Dev devFlavia = new Dev();
        devFlavia.setNome("Flávia");
        devFlavia.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Flávia: ");
        for(Conteudo flaviaConteudoInscrito : devFlavia.getConteudosInscritos()){
            System.out.println("---- " + flaviaConteudoInscrito);
        }
        devFlavia.progredir();
        System.out.println("Conteudos concluídos Flávia: ");
        for(Conteudo flaviaConteudoConcluido : devFlavia.getConteudosConcluidos()){
            System.out.println("---- " + flaviaConteudoConcluido);
        }
        System.out.println("Conteudos inscritos Flávia: ");
        for(Conteudo flaviaConteudoInscrito : devFlavia.getConteudosInscritos()){
            System.out.println("---- " + flaviaConteudoInscrito);
        }
        System.out.println("XP: " + devFlavia.calcularTotalXp());
    }
}
