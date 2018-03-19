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
import java.util.ArrayList;
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
     int escMenu = 0;
     ArrayList<Disciplina> materias = new ArrayList<>();
     ArrayList<Professor> professores = new ArrayList<>();
     ArrayList<Aluno> alunos = new ArrayList<>();
     
     
     do{
         
       escMenu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções \n"
               + "1. Cadastro Disciplina \n"
               + "2. Cadastro do Professor \n"
               + "3. Cadastro do Aluno \n"
               + "4. Sair "));
     
       switch (escMenu){
           case 1: {
               do{
     
                  String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
                  String departamento = JOptionPane.showInputDialog("Informe o departamento: ");
             
                  char status = JOptionPane.showInputDialog("Informe o Status: ").charAt(0);
                  materias.add(new Disciplina(nome, departamento, status));
                  
               }while ((JOptionPane.showConfirmDialog(null,"Deseja Continuar?"))==0);
                 break;
           }
       
        case 2: {
        
          do{ 
          
            int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("informe a sua carga horario: "));
            float valorHora = Float.parseFloat(JOptionPane.showInputDialog("informe o valor da sua hora: "));
            String nomeProfessor = JOptionPane.showInputDialog("Informe o seu nome: ");
            String rgProfessor = JOptionPane.showInputDialog("Informe o seu rg: ");
            String cpfProfessor = JOptionPane.showInputDialog("Informe o seu cpf: ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNascimentoProfessor =  sdf.parse(JOptionPane.showInputDialog("informe a data de nascimento:"));
            
            professores.add(new Professor(cargaHoraria, valorHora, nomeProfessor,rgProfessor,cpfProfessor,dataNascimentoProfessor));
            
            if (JOptionPane.showConfirmDialog(null, "O professor ja se matriculou em alguma disciplina? ")==0){
                String materiasExistentes= "";
                for(Disciplina materia: materias ) {
                     materiasExistentes += materias.indexOf(materia)+ " " +materia.getNome()+ "\n";
     
                }
                do{
                    int esc = Integer.parseInt(JOptionPane.showInputDialog("-- Informe a matéria-- \n"+ materiasExistentes));
                    professores.get(alunos.size()-1).getDisciplina().add(materias.get(esc));
                
                }while ((JOptionPane.showConfirmDialog(null,"Tem outra matéria para cadastrar? "))==0);
            }
            
     }while((JOptionPane.showConfirmDialog(null, "Deseja continuar? "))==0);
            break;
     
     }
          case 3: {
          do{
            int matricula = Integer.parseInt(JOptionPane.showInputDialog("informe a sua matricula: "));
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String nomeAluno = JOptionPane.showInputDialog("Informe o seu nome: ");
            String rgAluno = JOptionPane.showInputDialog("Informe o seu rg: ");
            String cpfAluno= JOptionPane.showInputDialog("Informe o seu cpf: ");
            Date dataMatricula =  sdf.parse(JOptionPane.showInputDialog("informe a data de Matricula:"));
            Date dataNascimentoAluno =  sdf.parse(JOptionPane.showInputDialog("informe a data de nascimento:"));
            
            alunos.add(new Aluno(matricula,dataMatricula,nomeAluno, rgAluno, cpfAluno, dataNascimentoAluno ));
            
            if (JOptionPane.showConfirmDialog(null, "O aluno ja se matriculou em alguma disciplina? ")==0){
                String materiasExistentes= "";
                for(Disciplina materia: materias ) {
                     materiasExistentes += materias.indexOf(materia)+ " " +materia.getNome()+ "\n";         
                }
            
     
                do{
                    int esc = Integer.parseInt(JOptionPane.showInputDialog("-- Informe a matéria-- \n"+ materiasExistentes));
                    alunos .get(alunos.size()-1).getDisciplina().add(materias.get(esc));
                 
                }while ((JOptionPane.showConfirmDialog(null,"Tem outra matéria para cadastrar? "))==0);
                    break;
                
                  
            }
          }
          }
     } while(escMenu !=4);
     }
     }
     
     }

    
     

    

     
     
     
     
     
     
     
     
     
     
     
     
    

