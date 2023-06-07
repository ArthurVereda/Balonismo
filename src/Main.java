public class Main {
    public static void main(String[] args) {
        // Construir balao
        Balao b1 = new Balao();
        // Acionar voo do balão
        // Chamada do método voar()
        String resposta = b1.voar(new Combustivel());
        // Apresentação do etorno
        System.out.println(resposta);
        Balao b2 = new Balao();
        Combustivel alcool = new Combustivel();
        System.out.println(b2.voar(alcool));
    }
}
