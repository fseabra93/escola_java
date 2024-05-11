/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package escola;

/**
 *
 * @author flaviorgs
 */
public interface Nota {
    
    default void setNota(double nota) {
        System.out.println("Atribuindo nota: " + nota);
    }

    double getNota();

    static void registrarNota(Aluno aluno, double nota) {
        System.out.println("Registrando nota " + nota + " para o aluno " + aluno.getNome());
    }
    
    
}
