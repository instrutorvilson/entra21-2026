package interfaces;

import java.util.List;

public interface ICRUDGenerico<T,t> {
	T salvar(T obj);
	void deletar(t id);
	void alterar(T obj);
	T consultar(t id);
	List<T> consultar();
}
