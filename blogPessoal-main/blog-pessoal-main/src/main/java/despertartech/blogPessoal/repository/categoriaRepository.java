package despertartech.blogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import despertartech.blogPessoal.model.categoria;

public interface categoriaRepository extends JpaRepository<categoria, Long> {
	public List<categoria> findAllByDescricaoContainingIgnoreCase( String descricao);
}
