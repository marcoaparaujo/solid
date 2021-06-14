// ISP - Interface Segregation Principle 
// Princípio da Segregação de Interface

package Isp.original;

public interface Dispositivo {
    
    public void imprimir(String conteudo);
    public void configurar(String parametros);
}
