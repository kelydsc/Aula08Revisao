package br.com.digitalhouse.Exercicio01;

public class Professor implements Docente {

    private String nome;
    private int registroDocente;

    public Professor(){

    }

    public Professor(String nome, Integer registroDocente) {
        this.nome = nome;
        this.registroDocente = registroDocente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRegistroDocente() {
        return registroDocente;
    }

    public void setRegistroDocente(Integer registroDocente) {
        this.registroDocente = registroDocente;
    }

    @Override
    public void darAula() {

        System.out.println("Deu aula");

    }

    @Override
    public void fazerChamadaDosAlunos() {

        System.out.println("Fez a chamada dos alunos");

    }
}
