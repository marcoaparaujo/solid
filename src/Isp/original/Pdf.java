// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package Isp.original;

public class Pdf implements Dispositivo {

    public void imprimir(String conteudo) {
        System.out.println("PDF: " + conteudo);
    }

    public void configurar(String parametros) {
        // nada
    }
}
