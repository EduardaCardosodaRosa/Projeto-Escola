/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Aluno;
import br.com.satc.objeto.Disciplina;
import br.com.satc.objeto.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author eduarda.178517
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
     Disciplina disciplina;
     
     String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
     String departamento = JOptionPane.showInputDialog("Informe o departamento: ");
     char status = JOptionPane.showInputDialog("Informe o Status: ").charAt(0);
     
     disciplina = new Disciplina (nome, departamento,status);
     JOptionPane.showMessageDialog(null,disciplina.toString());
     
     
     Professor professor;
     
     String nomeProfessor = JOptionPane.showInputDialog("Informe o seu nome: ");
     int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe sua carga horária: "));
     float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da hora: "));
     String rg = JOptionPane.showInputDialog("Informe o seu rg: ");
     String cpf = JOptionPane.showInputDialog("Informe o seu cpf: ");
     SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
     Date dataNascimento = sdf.parse(JOptionPane.showInputDialog("Iforme a data de nascimento: "));
     
     
     
     professor = new Professor (cargaHoraria, valorHora, nome, rg ,cpf, dataNascimento);
     JOptionPane.showMessageDialog(null,professor.toString());
     
     
     
     Aluno aluno;
     
     String nomeAluno = JOptionPane.showInputDialog("Informe o seu nome: ");
     Date dataMatricula = sdf.parse(JOptionPane.showInputDialog("Iforme o numero da sua maticula: "));
     String rgAluno = JOptionPane.showInputDialog("Informe o seu rg: ");
     String cpfAluno = JOptionPane.showInputDialog("Informe o seu cpf: ");
     Date dataNascimentoAluno = sdf.parse(JOptionPane.showInputDialog("Iforme a data de nascimento: "));
     
     aluno = new Aluno(matricula, dataMatricula, nome, rg, cpf, dataNascimento);
     JOptionPane.showInputDialog(null, aluno.toString())
;     
    }
    
}
