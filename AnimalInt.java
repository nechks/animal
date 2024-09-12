package animal;
import java.util.List;

public interface AnimalInt <T>{
    public void criar(T animal);
    public void modificar(T animal);
    public void excluir(Long id);
    public List<T> lista();
    public T buscar(Long id);

}
