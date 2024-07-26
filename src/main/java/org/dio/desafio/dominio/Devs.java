package org.dio.desafio.dominio;

import java.util.*;

public class Devs {

    private String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp( Bootcamp bootcamp){
        this.conteudoInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudoConcluido.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());

        }else {
            System.err.println("Você nâo está matriculado em nenhum BootCamp");
        }
    }

    public double calcularXp(){
      return  this.conteudoConcluido.stream().mapToDouble(c -> c.calcularXp()).sum();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Devs)) return false;
        Devs devs = (Devs) o;
        return Objects.equals(nome, devs.nome) && Objects.equals(conteudoInscrito, devs.conteudoInscrito) && Objects.equals(conteudoConcluido, devs.conteudoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudoConcluido);
    }
}
