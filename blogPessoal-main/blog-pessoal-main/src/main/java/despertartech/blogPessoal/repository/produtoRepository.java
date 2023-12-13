package despertartech.blogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import despertartech.blogPessoal.model.produto;

@Repository
public interface produtoRepository extends JpaRepository<produto, Long> {	
	public List<produto> findAllByTituloContainingIgnoreCase (String titulo); 

}

