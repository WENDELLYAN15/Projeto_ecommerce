package despertartech.blogAquiTem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import despertartech.blogAquiTem.model.produto;

@Repository
public interface produtoRepository extends JpaRepository<produto, Long> {	
	public List<produto> findAllByTituloContainingIgnoreCase (String titulo); 

}

