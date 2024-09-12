package animal;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Cachorro c = new Cachorro();
        Cachorro c1 = new Cachorro();
        c.criar(1L, "c", "cachorro ", "quente",10.30);
        c1.criar(2L, "c1", "cachorro ", " grande ", 40.3);
        cachorro.criar(c);
        cachorro.criar(c1);

        for(Cachorro item :  cachorro.lista()){
            System.out.println("Id: " + item.getId()+ " -Especie : "+ item.getEspecie()+
            "-Nome 1: "+ item.getNome()+" - Raca "+ item.getRaca()+ " - Peso "+ item.getPeso());
        }

        cachorro.excluir(1L);
        
        System.out.println("--------------------------------------------------------");

        for(Cachorro item : cachorro.lista()){
            System.out.println("Id: " + item.getId()+" - Especie : "+ item.getEspecie()+
            "- Nome : "+ item.getNome()+" - Raca "+ item.getRaca()+ " - Peso "+ item.getPeso());
        }
      

       /* 
        gato.setNome("null");
        gato.setDataNascimento("29/10/2002");
        gato.criar(gato);
        System.out.println("Especie1: " + gato.getEspecie()+ "nome : " + gato.getNome() + "data de nascimento: " + gato.getDataNascimento());
        gato.criar(1L,"null", " -Gato laranja", " -09/10/2030", 19.0);
        System.out.println("Especie2: " + gato.getEspecie()+ "nome : " + gato.getNome() + "data de nascimento: " + gato.getDataNascimento());*/ 
       
       
       
        Gato g = new Gato();
        Gato g1 = new Gato(2L ,"g1", "Rosa", "29/10/2002", 12.4);
        Gato g2 = new Gato(3L,"g2", "Azul", "07/01/2002", 10.5 );
        Gato g3 = new Gato(4L, "g3", "Preto", "10/09/2020", 10.4);

        g.criar(g1);
        g.criar(g2);
        g.criar(g3);

        for(Gato item : g.lista()){
            System.out.println("Id: " + item.getId()+" -Especie1: "+ item.getEspecie()+
            "- Nome1: "+ item.getNome()+" -Data de Nascimento"+ item.getDataNascimento()+ " -Peso"+ item.getPeso());
        }

        g.excluir(2L);

        System.out.println("--------------------------------------------------------");

        for(Gato item : g.lista()){
            System.out.println("Id: " + item.getId()+" -Especie1: "+ item.getEspecie()+
            "- Nome1: "+ item.getNome()+" -Data de Nascimento"+ item.getDataNascimento()+ " -Peso"+ item.getPeso());
        }
    }  
}