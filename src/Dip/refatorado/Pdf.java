// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência

package Dip.refatorado;

public class Pdf implements Formato {

    public void imprimir(String conteudo) {
        System.out.println("PDF: " + conteudo);
    }
}
