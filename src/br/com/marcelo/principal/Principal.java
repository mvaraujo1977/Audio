package br.com.marcelo.principal;

import br.com.marcelo.modelos.MinhasPreferidas;
import br.com.marcelo.modelos.Musicas;
import br.com.marcelo.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {

        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduzir();

        }

        for (int i = 0; i < 50; i++) {

            minhaMusica.curte();

        }

        PodCast meuPodCast = new PodCast();
        meuPodCast.setTitulo("Flow");
        meuPodCast.setApresentador("Igor");

        for (int i = 0; i < 5000; i++){
            meuPodCast.reproduzir();

        }

        for (int i = 0; i < 450; i++) {

            meuPodCast.curte();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodCast);
        preferidas.inclui(minhaMusica);

    }
}