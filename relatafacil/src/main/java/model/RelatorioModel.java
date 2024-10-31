package model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "relata")
public class RelatorioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String nomeCriador;
	private String nomeSetor;
	private String nomeRelatorio;
//		
//	public RelatorioModel (RelatorioDTO DTO) {
//		this.nomeCriador = DTO.nomeCriador();
//		this.nomeSetor = DTO.nomeSetor();
//		this.nomeRelatorio = DTO.nomeRelatorio();
//	}
//	
	
}
