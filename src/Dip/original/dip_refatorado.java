// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência

package Dip.original;

public class dip_refatorado {

    public static void main(String args[]) {

        Arquivo arquivo = new Arquivo(new Html());
        arquivo.setConteudo("texto");
        arquivo.imprimir();
        
    }
}
