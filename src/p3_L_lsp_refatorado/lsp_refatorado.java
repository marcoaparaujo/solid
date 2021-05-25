// LSP - Liskov Substitution Principle 
// Princípio da Substituição de Liskov

package p3_L_lsp_refatorado;

public class lsp_refatorado {

    public static FuncionarioGeral getFuncionario() {
        return new Funcionario();
        // return new Gerente();
    }

    public static void main(String args[]) {
        Funcionario func = (Funcionario)getFuncionario();
        // Gerente func = (Gerente)getFuncionario();
        func.setSalarioBase(1000);
        func.setAcrescimos(200);
        func.setDescontos(100);
        System.out.println(func.calcularSalario());
    }
}
