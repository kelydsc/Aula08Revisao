package br.com.digitalhouse.Exercicio01;

public class Main {

    public static void main(String[] args) {

        Professor professorTairo = new Professor("Tairo",1);

        Aluno alunoKely = new Aluno(100,"Kely","dos Santos");

        Aluno alunoCarlos = new Aluno(200,"Carlos","da Silva");

        Aula aulaJava = new Aula("Java","19:00:00","21:30:00");

        Aula aulaGit = new Aula("Git","21:30:01","22:30:00");

        Curso cursoAndroid = new Curso("Android","Mob 01",professorTairo);

        cursoAndroid.cadastraAluno(alunoKely);
        cursoAndroid.cadastraAluno(alunoCarlos);

        cursoAndroid.cadastraAula(aulaJava);
        cursoAndroid.cadastraAula(aulaGit);

        cursoAndroid.imprimeCadastroCurso();

        alunoKely.assistirAula(aulaJava);
        alunoKely.fazerLicaoDeCasa(aulaJava);

        alunoCarlos.assistirAula(aulaGit);
        alunoCarlos.fazerLicaoDeCasa(aulaGit);
    }
}
