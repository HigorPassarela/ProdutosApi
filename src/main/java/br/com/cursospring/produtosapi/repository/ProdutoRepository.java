package br.com.cursospring.produtosapi.repository;

import br.com.cursospring.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
