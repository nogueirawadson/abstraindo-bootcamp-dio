package org.dio.desafio.dominio;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Cursos extends Conteudo{



    private int cargaHoraria;

    private LocalDate data;



    public Cursos() {
    }

    public void Curso(String titulo, String descricao, int cargaHoraria, LocalDate data) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
        this.data = data;

    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    @Override
    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO_PADRAO + cargaHoraria;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "curso='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                ", data=" + data +
                ", xp: " + calcularXp() +
                '}';
    }


}
