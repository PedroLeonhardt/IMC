public class Main {
    public static void main(String[] args) {
        double peso = Entrada.leiaDouble("Peso");
        double  altura = Entrada.leiaDouble("Altura");
        double imc = peso / Math.pow(altura,2);
        System.out.println(imc);
        
        if (imc < 25){
            System.out.println("Seu peso esta normal!");
        }
        else
        {
            System.out.println("Seu peso esta acima do normal");
        }
    }
}
