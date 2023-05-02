/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modelos;

/**
 *
 * @author gabriel
 */
public class Relatorio {
    
    private String nomeProfessor;
    private String nomeTurma;
    private String dataAula;
    private String numAula;
    private String intro;
    private String develop;
    private String tarefaCasa;
    private String gravacao;
    
    public Relatorio(){
        
    }
    
    public Relatorio(
            String nomeProfessor, 
            String nomeTurma,
            String dataAula, 
            String numAula, 
            String intro, 
            String develop, 
            String tarefaCasa){
        this.nomeProfessor = nomeProfessor;
        this.nomeTurma = nomeTurma;
        this.dataAula = dataAula;
        this.numAula = numAula;
        this.intro = intro;
        this.develop = develop;
        this.tarefaCasa = tarefaCasa;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public String getDataAula() {
        return dataAula;
    }

    public String getNumAula() {
        return numAula;
    }

    public String getIntro() {
        return intro;
    }

    public String getDevelop() {
        return develop;
    }

    public String getTarefaCasa() {
        return tarefaCasa;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public void setDataAula(String dataAula) {
        this.dataAula = dataAula;
    }

    public void setNumAula(String numAula) {
        this.numAula = numAula;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setDevelop(String develop) {
        this.develop = develop;
    }

    public void setTarefaCasa(String tarefaCasa) {
        this.tarefaCasa = tarefaCasa;
    }

    public String getGravacao() {
        return gravacao;
    }

    public void setGravacao(String gravacao) {
        this.gravacao = gravacao;
    }
    
    
    
    public String gerarRelatorio(){
        return """
               *Relatório de Aula*
               *Turma e Aula: %s| Aula %s*
               *Data: %s*
               *Prof: %s*
               
               *Introdução :* %s
               
               *Desenvolvimento:* %s
               
               *Tarefa De Casa:* %s
               
               *Gravação da Aula:* %s
               
               
               *Qualquer dúvida, pode me chamar por aqui*
               *Site:* ctrlplay.com
               """.formatted(
                       nomeTurma,
                       numAula,
                       dataAula,
                       nomeProfessor,
                       intro,
                       develop,
                       tarefaCasa,
                       gravacao);
    }
    
    
}
