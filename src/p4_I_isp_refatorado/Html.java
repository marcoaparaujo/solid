// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package p4_I_isp_refatorado;

public class Html implements Dispositivo {
   
    public void imprimir(String conteudo) {
        System.out.println("HTML: " + conteudo);
    }

}
