package br.com.digitalhouse.Exercicio01;

import java.util.ArrayList;

public class Curso {

    private String nomeCurso;
    private String nomeTurma;
    private ArrayList<Aula> listatAula = new ArrayList<>();
    private ArrayList<Aluno> listaAluno = new ArrayList<>();
    private Professor professor;

    public Curso(String nomeCurso, String nomeTurma, Professor professor) {
        this.nomeCurso = nomeCurso;
        this.nomeTurma = nomeTurma;
        this.professor = professor;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public ArrayList<Aula> getListatAula() {
        return listatAula;
    }

    public void setListatAula(ArrayList<Aula> listatAula) {
        this.listatAula = listatAula;
    }

    public ArrayList<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(ArrayList<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void cadastraAluno(Aluno aluno) {

        listaAluno.add(aluno);
    }

    public void cadastraAula(Aula aula) {

        listatAula.add(aula);
    }

    public void imprimeCadastroCurso() {

        for (int linha = 0; linha < listaAluno.size(); linha++) {

            System.out.println("Nome do aluno: " + listaAluno.get(linha).getNome() + " " +
                    listaAluno.get(linha).getSobrenome());

            System.out.println("Nome do curso: " + getNomeCurso());

            System.out.println("Turma: " + getNomeTurma());

            System.out.println("Nome do professor: " + getProfessor().getNome());

            for (int posicao = 0; posicao < listatAula.size(); posicao++) {

                System.out.println("Materia: " + getListatAula().get(posicao).getNomeMateria());

                System.out.println("Horario de inicio: " + listatAula.get(posicao).getHorarioInicio());

                System.out.println("Horario de termino: " + listatAula.get(posicao).getHorarioTermino());
            }
        }
    }
}

