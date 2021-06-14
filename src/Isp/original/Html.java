// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package Isp.original;

public class Html implements Dispositivo {
   
    public void imprimir(String conteudo) {
        System.out.println("HTML: " + conteudo);
    }
    
    public void configurar(String parametros) {
        // nada
    }
}
