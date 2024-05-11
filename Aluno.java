/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * @author flaviorgs
 */
public class Aluno extends Pessoa implements Nota, Presenca{
    
    private double nota;
    private boolean presente;

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double getNota() {
        return nota;
    }

    @Override
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean isPresente() {
        return presente;
    }

    @Override
    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    
     

}
