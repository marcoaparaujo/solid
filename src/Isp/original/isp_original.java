// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package Isp.original;

public class isp_original {

    public static void main(String args[]) {
        
        Arquivo arquivo = new Arquivo("Email");
        arquivo.setConteudo("texto");
        arquivo.imprimir();
        
    }
}
