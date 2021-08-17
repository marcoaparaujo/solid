// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência

package Dip.refatorado;

public class dip_refatorado {

    public static void main(String args[]) {

        Arquivo arquivo = new Arquivo(new Pdf());
        arquivo.setConteudo("texto");
        arquivo.imprimir();
        
    }
}
