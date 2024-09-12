package animal;

import java.util.ArrayList;
import java.util.List;

public class Gato extends AnimalAbs implements AnimalInt<Gato>{
    
    private List<Gato> lista = new ArrayList<Gato>();

    private String dataNascimento;


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Gato(){
        
    }

    public Gato(Long id, String nome, String especie, String dataNascimento, double peso){
        this.setId(id);
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setEspecie(especie);
        this.setPeso(peso);
    }


    public void criar(Long id, String nome, String especie, String dataNascimento, double peso){
        this.setId(id);
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setEspecie(especie);
        this.setPeso(peso);
    }

    @Override
    public void modificar(Gato animal) {
        for(int i = 0; i <this.lista.size(); i++){
            if(this.lista.get(i).equals(animal.getId())){
                this.lista.get(i).setDataNascimento(animal.getDataNascimento());
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
    public List<Gato> lista() {
        return this.lista;
    }

    @Override
    public void criar(Gato animal) {
       System.out.println("Data de nascimento: " + animal.getDataNascimento());
       System.out.println("Especie: " + animal.getEspecie());
       this.lista.add(animal);
    }

    @Override
    public Gato buscar(Long id) {
        for(int i = 0; i < this.lista.size(); i++){
            if(id.equals(this.lista.get(i).getId())){
                return this.lista.get(i);
                
            }
        }
        return null;
    }

}
