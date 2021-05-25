// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package p4_I_isp_original;

public class isp_original {

    public static void main(String args[]) {
        
        Arquivo arquivo = new Arquivo("Email");
        arquivo.setConteudo("texto");
        arquivo.imprimir();
        
    }
}
