// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package p4_I_isp_refatorado;

public class isp_refatorado {

    public static void main(String args[]) {
        
        Arquivo arquivo = new Arquivo("Html");
        arquivo.setConteudo("texto");
        arquivo.imprimir();
        
    }
}
