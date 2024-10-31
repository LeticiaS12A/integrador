package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.RelatorioModel;
import repository.RelatorioRepository;

@RestController
@RequestMapping("api")
public class RelatorioController {

	@Autowired
	RelatorioRepository Repo;
	
	@GetMapping
	public ResponseEntity<?> buscar() {
		List <RelatorioModel> RelatorioModel = Repo.findAll();
		return ResponseEntity.ok(RelatorioModel);
	}
	
}
