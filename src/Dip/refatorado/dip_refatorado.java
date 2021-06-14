// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência

package Dip.refatorado;

public class dip_refatorado {

    public static void main(String args[]) {

        Formato formato = new Html();
        Arquivo arquivo = new Arquivo(formato);
        arquivo.setConteudo("texto");
        arquivo.imprimir();
        
    }
}
