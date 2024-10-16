public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("pumba");
        System.out.println("o nome: ");
        System.out.println(cachorro.getNome());
        System.out.println("açao: ");
        cachorro.fazerSom();
        cachorro.dormir();

        System.out.println("açoes do carro: ");
        Carro carro = new Carro();
        carro.acelerar();
        carro.frear();

        System.out.println("açao da moto");
        Moto moto = new Moto();
        moto.acelerar();
        moto.frear();
        moto.voar();
    }
}