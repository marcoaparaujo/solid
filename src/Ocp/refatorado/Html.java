// OCP - Open Closed Principle 
// Princípio Aberto/Fechado

package Ocp.refatorado;

public class Html implements Dispositivo {
   
    public void imprimir(String conteudo) {
        System.out.println("HTML: " + conteudo);
    }
}
