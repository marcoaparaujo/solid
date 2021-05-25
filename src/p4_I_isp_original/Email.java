// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package p4_I_isp_original;

public class Email implements Dispositivo {
   
    public void imprimir(String conteudo) {
        System.out.println("E-mail: " + conteudo);
    }
    
    public void configurar(String parametros) {
        // configuracao do email
    }
}
