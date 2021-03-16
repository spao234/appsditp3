package br.edu.apptp3wandersonvitorino.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.apptp3wandersonvitorino.model.negocio.Usuario;
import br.edu.apptp3wandersonvitorino.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/")
	public String apresentar(Model model) {
		String nome ="Wanderson Vitorino";
		String email ="wanderson.vitorino@al.infnet.edu.br";
		String git = "";
		
		model.addAttribute("nome", "Wanderson Vitorino");
		model.addAttribute("email", "wanderson.vitorino@al.infnet.edu.br");
		model.addAttribute("git", "href https://github.com/spao234");
		
		return "index";
	}
	
	@GetMapping(value = "/usuario")
	public String cadastrar(Model model) {
		
		model.addAttribute("usuarios", usuarioService.obterLista());
		
		return "usuario/detalhe";
	}

	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		
		usuarioService.incluir(usuario);
		
		return "redirect:/usuario";
	}
	
	
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		usuarioService.excluir(id);
		
		return "redirect:/usuario";
	}
	
}
