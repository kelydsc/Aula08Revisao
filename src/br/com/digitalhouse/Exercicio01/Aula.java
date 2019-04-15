package br.com.digitalhouse.Exercicio01;

public class Aula{

    //atributo
    private String nomeMateria;
    private String horarioInicio;
    private String horarioTermino;

    public Aula() {
    }

    public Aula(String nomeMateria, String horarioInicio, String horarioTermino) {
        this.nomeMateria = nomeMateria;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(String horarioTermino) {
        this.horarioTermino = horarioTermino;
    }
}
