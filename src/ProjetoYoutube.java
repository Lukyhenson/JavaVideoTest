public class ProjetoYoutube {
    public static void main(String[] args){
        Video v[] = new Video[5];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 1 de PHP");
        v[2] = new Video("Aula 1 de Python");
        v[3] = new Video("Aula 1 de Javascript");
        v[4] = new Video("Aula 1 de Java");

        User u[] = new User[2];
        u[0] = new User("Tauan Tathiell", 19 , "M", "Da Wang");
        u[1] = new User("Ruan", 19, "M", "Kraken fnx");


        Vizualizacao vis[] = new Vizualizacao[5];
        vis[0] = new Vizualizacao(u[0], v[2]);
        System.out.println(vis[0].toString());
        vis[1] = new Vizualizacao(u[0], v[3]);
        System.out.println(vis[1].toString());



//        System.out.println("Videos \n ------------------");
//        System.out.println(v[0].toString());
//        System.out.println(v[1].toString());
//        System.out.println("Users \n ------------------");
//        System.out.println(u[0].toString());
//        System.out.println(u[1].toString());
    }
}
