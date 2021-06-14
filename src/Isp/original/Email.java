// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package Isp.original;

public class Email implements Dispositivo {
   
    public void imprimir(String conteudo) {
        System.out.println("E-mail: " + conteudo);
    }
    
    public void configurar(String parametros) {
        // configuracao do email
    }
}
