package br.com.digitalhouse.Exercicio01;

public class Aluno {

    private int registroAcademico;
    private String nome;
    private String sobrenome;

    public Aluno(){

    }

    public Aluno(int registroAcademico, String nome, String sobrenome) {
        this.registroAcademico = registroAcademico;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void assistirAula(Aula aula){

        System.out.println("Aluno: " + getNome() + " " + getSobrenome() + ", assistiu a aula: " + aula.getNomeMateria());
    }

    public void fazerLicaoDeCasa(Aula aula){

        System.out.println("Aluno: " + getNome() + " " + getSobrenome() + ", fez a lição de casa da aula: " + aula.getNomeMateria());
    }
}
