package org.dio;

import org.dio.desafio.dominio.Bootcamp;
import org.dio.desafio.dominio.Conteudo;
import org.dio.desafio.dominio.Cursos;
import org.dio.desafio.dominio.Devs;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos();
        Cursos curso2 = new Cursos();
        Scanner sc = new Scanner(System.in);

        curso1.Curso( "Bootcamp Java Dio", "Curso Java Básico",87, LocalDate.of(2024, 5, 24));
        curso2.Curso( "Bootcamp Java Dio", "Curso Java Básico",87, LocalDate.of(2024, 5, 24));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(("Java: "));
        bootcamp.setDescricao(("Basico "));
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);


        System.out.println( "======================");
        Devs devWadson = new Devs();
        devWadson.setNome("Wadson ");
        devWadson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos" + devWadson.getConteudoInscrito());
        devWadson.progredir();
        System.out.println( "++++");

        System.out.println("Conteudos concluidos " + devWadson.getConteudoConcluido());
        System.out.println("XP " + devWadson.calcularXp());


        System.out.println( "======================");

        Devs devCamila = new Devs();
        devCamila.setNome("Camila ");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteudo Inscritos" + devCamila.getConteudoInscrito());
        devCamila.progredir();
        System.out.println( "++++");

        System.out.println("Conteudos concluidos " + devCamila.getConteudoConcluido());
         System.out.println("XP " + devCamila.calcularXp());
        devCamila.progredir();
        System.out.println( "++++");
        System.out.println("XP " + devCamila.calcularXp());






    }







}