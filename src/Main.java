import java.util.List;

import dao.ProdutoDao;
import modelos.Produto;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("Salgadinho",9.85);
        
		ProdutoDao dao = new ProdutoDao();
		System.out.println(dao.salvar(p1));
		
		/*Produto retorno = dao.salvar(p1);
		System.out.println(retorno.getId() + " " + retorno.getDescricao());*/
		/*List<Produto> lista = dao.consultar();
		for (Produto p : lista ) {
			System.out.println(p.getId() + " " + p.getDescricao() + " " + p.getPreco());	
		}*/
		
		/*Produto p = dao.consultar(4);
		System.out.println(p.getId() + " " + p.getDescricao() + " " + p.getPreco());
		
		p.setDescricao("Alcatra");
		p.setPreco(39.99);
		dao.alterar(p);
		
		Produto alterado = dao.consultar(4);
		System.out.println(alterado.getId() + " " + alterado.getDescricao() + " " + alterado.getPreco());*/
		
	/*	dao.deletar(3);
		Produto p = dao.consultar(3);
		if(p != null) {
			System.out.println(p.getId() + " " + p.getDescricao() + " " + p.getPreco());
		}else {
			System.out.println("Produto não encontrado");
		}*/
		
		
		
		
	}

}
