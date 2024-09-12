package animal;

import java.util.ArrayList;
import java.util.List;

public class Cachorro extends AnimalAbs implements AnimalInt<Cachorro> {

    private List<Cachorro> lista = new ArrayList<Cachorro>();
    
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Cachorro(){}

    public Cachorro(Long id, String nome, String especie, String raca, double peso){
        this.setId(id);
        this.setNome(nome);
        this.setRaca(raca);
        this.setEspecie(especie);
        this.setPeso(peso);
    }


    public void criar (long id, String nome, String especie, String raca, double peso) {
        this.setId(id);
        this.setNome(nome);
        this.setRaca(raca);
        this.setEspecie(especie);
        this.setPeso(peso);
    }

    @Override
    public void modificar(Cachorro animal) {
        for(int i = 0; i <this.lista.size(); i++){
            if(this.lista.get(i).equals(animal.getId())){
                this.lista.get(i).setRaca(animal.getRaca());
                this.lista.get(i).setEspecie(animal.getEspecie());
                this.lista.get(i).setNome(animal.getNome());
                this.lista.get(i).setPeso(animal.getPeso());
                break;
            }
        }
    }

    @Override
    public void excluir(Long id) {
        for(int i = 0; i < this.lista.size(); i++){
            if(id.equals(this.lista.get(i).getId())){
                this.lista.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Cachorro> lista() {
        return this.lista;
    }


    @Override
    public void criar(Cachorro animal) {
       System.out.println("Raca " + animal.getRaca());
       System.out.println("Especie: " + animal.getEspecie());
       this.lista.add(animal);
    }

    @Override
    public Cachorro buscar(Long id) {
        for(int i = 0; i < this.lista.size(); i++){
            if(id.equals(this.lista.get(i).getId())){
                return this.lista.get(i);
                
            }
        }
        return null;
    }

 }
