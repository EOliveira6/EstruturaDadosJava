/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Eleni Oliveira
 */
public class Fila {

    private final List<Aluno> alunos = new LinkedList<>();

    public void insere(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Aluno remove() {
        return this.alunos.remove(0);
    }

    public boolean vazia() {
        return this.alunos.isEmpty();
    }

}
