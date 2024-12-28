import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Jobson");

        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);


        contaCorrente.depositar(725.00);
        contaCorrente.transferir(contaPoupanca,200.00);
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}