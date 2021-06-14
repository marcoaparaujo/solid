// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package Isp.refatorado;

public class Html implements Dispositivo {
   
    public void imprimir(String conteudo) {
        System.out.println("HTML: " + conteudo);
    }

}
