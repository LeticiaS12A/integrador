package repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import model.RelatorioModel;

public interface RelatorioRepository extends JpaRepository <RelatorioModel, UUID> {

	
}
