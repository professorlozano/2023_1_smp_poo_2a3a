public class UsaContas {
    public static void main(String[] args) {
        /*
        Poupanca obj_cpp = new Poupanca("Itau", 8888,9999,10);
        System.out.println("Banco: " + obj_cpp.getBanco());
        System.out.println("Agencia: " + obj_cpp.getAgencia());
        System.out.println("Conta: " + obj_cpp.getConta());
        System.out.println("Aniversario: " + obj_cpp.getAniversario());
        System.out.println("Saldo: " + obj_cpp.getSaldo());

        System.out.println("\n********************************************************");
        obj_cpp.Depositar(1000);
        System.out.println("Saldo: " + obj_cpp.getSaldo());
        System.out.println("\n********************************************************");
        obj_cpp.Sacar(1001);
        System.out.println("Saldo: " + obj_cpp.getSaldo());

         */

        Corrente obj_cc = new Corrente("Itau", 8888,9999,5000);
        System.out.println("Banco: " + obj_cc.getBanco());
        System.out.println("Agencia: " + obj_cc.getAgencia());
        System.out.println("Conta: " + obj_cc.getConta());
        System.out.println("Limite: " + obj_cc.getLimite());
        System.out.println("Saldo: " + obj_cc.getSaldo());

        System.out.println("\n********************************************************");
        obj_cc.Depositar(1000);
        System.out.println("Saldo: " + obj_cc.getSaldo());
        System.out.println("\n********************************************************");
        obj_cc.Sacar(6001);
        System.out.println("Saldo: " + obj_cc.getSaldo());

    }
}
