// DIP - Dependency Inversion Principle 
// Princípio da Inversão de Dependência

package Dip.original;

public class Arquivo {
    private String conteudo;
    private Html dispositivo;

    public Arquivo(Html dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }  
    
    public void imprimir() {
        this.dispositivo.imprimir(conteudo);
    }
    
}
