import java.nio.charset.CoderResult;

import javax.sound.midi.Soundbank;

public class Rodaraplicacao {
    public static void main(String[] args){
       
        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("BMW");
        carro1.setCapacidadeTanque(50);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalTanque(5.9));

        Carro carro2 = new Carro("Amarelo", "Gol", 60);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalTanque(4.79));


    }
}
