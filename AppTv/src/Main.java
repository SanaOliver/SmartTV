public class Main {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Novo Canal " + smartTv.canal);

        System.out.println();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo status - TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - TV ligada? " + smartTv.ligada);


    }
}