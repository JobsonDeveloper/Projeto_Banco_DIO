public abstract class Conta implements IConta {
    protected Integer numeroConta;
    protected Integer agencia;
    protected Double saldo = 0.0;
    protected Cliente cliente;
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    Banco usuarios = new Banco();

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }
    public Integer getAgencia() {
        return agencia;
    }
    public Double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
    }
    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }
    @Override
    public void transferir(Conta contaDestino, Double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

//    protected void imprimirNomeUsuarios() {
//        System.out.println("------- Usuários do banco -------");
//        System.out.println(this.usuarios.getContas());
//    }
}
