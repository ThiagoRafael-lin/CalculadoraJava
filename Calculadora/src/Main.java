//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    double num1 = scanner.nextDouble();

    System.out.println("Digite a operação (+, -, *, /):");
    String operacao = scanner.next();

    System.out.println("Digite o segundo número: ");
    double num2 = scanner.nextDouble();

    double resultado;


    switch (operacao) {
    case "+":
         resultado = Operacoes.somar(num1, num2);
        break;
    case "-":
         resultado = Operacoes.subtrair(num1, num2);
         break;
    case "*":
        resultado = Operacoes.dividir(num1, num2);
        break;
    case "/":
        if (num1 != 0) {
            resultado = Operacoes.multiplicar(num1, num2);

        } else {
            System.out.println("Erro: Divisão por zero não é permitido");
            return;
        }
        break;
        default:
            System.out.println("Operação inválida");
            return;
}

    System.out.println("Resultado" + resultado);
    scanner.close();
}
