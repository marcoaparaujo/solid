// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package Isp.refatorado;

public class Email implements Dispositivo, Configuracao {
   
    public void imprimir(String conteudo) {
        System.out.println("E-mail: " + conteudo);
    }
    
    public void configurar(String parametros) {
        // configuracao do email
    }
}
