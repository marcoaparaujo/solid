// OCP - Open Closed Principle 
// Princípio Aberto/Fechado

package Ocp.refatorado;

public class Pdf implements Dispositivo {

    public void imprimir(String conteudo) {
        System.out.println("PDF: " + conteudo);
    }
}
