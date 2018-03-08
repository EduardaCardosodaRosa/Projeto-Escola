/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author eduarda.178517
 */
public class Professor extends Pessoa {
    private ArrayList<Disciplina> disciplina = new ArrayList<>();
    private int cargaHoraria;
    private float valorHora;
    private float salario;

    public Professor(int cargaHoraria, float valorHora, String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = this.calculaSalario(cargaHoraria, valorHora);
        
    }
    
    
    
    
    public float calculaSalario(float valorHora, float cargaHoraria){
        return valorHora * cargaHoraria;
    
    }
    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "disciplina=" + disciplina + ", cargaHoraria=" + cargaHoraria + ", valorHora=" + valorHora + ", salario=" + salario + '}';
    }
    
    
   
    
}
