// OCP - Open Closed Principle 
// Princípio Aberto/Fechado

package p2_O_ocp_refatorado;

public class Pdf implements Dispositivo {

    public void imprimir(String conteudo) {
        System.out.println("PDF: " + conteudo);
    }
}
