/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escola;

/**
 *
 * @author flaviorgs
 */
public class Escola {


    public static void lancarFalta(Presenca al) {
        al.setPresente(false);
        System.out.println("Falta registrada para " + al.getNome());
        if (al.isPresente() == false){
            System.out.println("O aluno " + al.getNome() + " faltou.");
        }
    }
    
    public static void lancarPresenca(Presenca al) {
        al.setPresente(true);
        System.out.println("Presença registrada para " + al.getNome());
        if (al.isPresente() == true){
            System.out.println("O aluno " + al.getNome() + " está presente.");
        }
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno[] = new Aluno[2];
        Professor professor = new Professor("Maria", "333.333.333-33");
        
        aluno[0] = new Aluno("João", "111.111.111-11");
        aluno[1] = new Aluno("Felipe", "222.222.222-22");

    
        Presenca al1 = aluno[0];
        Nota.registrarNota(aluno[0], 7.0);
        
        Presenca al2 = aluno[1];
        Nota.registrarNota(aluno[1], 9.5);

        lancarFalta(al1);
        lancarPresenca(al2);


        
    }
        
    
    
}
