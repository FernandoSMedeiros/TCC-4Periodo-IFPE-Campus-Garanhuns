import fast_delivery.web.controller.ProdutoController;
import fast_delivery.web.model.entidades.Produto;

public class Teste {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		p.setCodProduto("Produto123Teste");
		p.setMargemLucroProduto(30);
		p.setNomeProduto("Cocada de Sal");
		p.setPrecoCustoProduto(0.5);
		p.setPrecoVendaProduto(35);
		p.setQuantProduto(50);
		
		ProdutoController pc = new ProdutoController();
		
		pc.inserirProdutoAction(p);

	}

}
