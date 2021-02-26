/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste1;

/**
 *
 * @author Eleni Oliveira
 */
public class Teste1 {

    public static void main(String[] args) {
        Fila fila = new Fila();
        Aluno aluno = new Aluno();
        fila.insere(aluno);

        Aluno alunoRemovido;
        alunoRemovido = fila.remove();
        if (aluno != alunoRemovido) {
            System.out.println("Erro: o aluno removido não é igual ao que foi inserido");
        }
        if (!fila.vazia()) {
            System.out.println("Erro: A fila não está vazia");
        }
    }
}

        // TODO code application logic here
    
    

