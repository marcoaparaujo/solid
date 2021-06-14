// OCP - Open Closed Principle 
// Princípio Aberto/Fechado

package Ocp.refatorado;

public class Email implements Dispositivo {
   
    public void imprimir(String conteudo) {
        System.out.println("E-mail: " + conteudo);
    }
}