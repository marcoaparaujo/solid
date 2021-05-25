// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package p4_I_isp_original;

public class Html implements Dispositivo {
   
    public void imprimir(String conteudo) {
        System.out.println("HTML: " + conteudo);
    }
    
    public void configurar(String parametros) {
        // nada
    }
}
