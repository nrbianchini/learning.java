package bianchini.nathalia.learningjava.javacore.initializationBlocks.domain;

public class series {
    private String title;
    private int[] episodes;
    /*  1 - aloca espaço em memória para objeto.
        2 - cada atributo de classe é criado e
        inicializado com valores default ou o
        que for passado.
        3 - construtor é executado.
     */
    {
        System.out.println("dentro do bloco de inicialização");
        episodes = new int[89];
        for (int i = 0; i < episodes.length; i++){
            episodes[i] = i + 1;
        }
    }

    public series(String title) {
        this.title = title;
    }

    public series(){
        for (int episodes: this.episodes) {
            System.out.print(episodes + " ");
        }
        System.out.println();
    }

    public String getTitle() {
        return title;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
