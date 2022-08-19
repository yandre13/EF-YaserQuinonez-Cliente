package com.idat.EFYaserQuinonezCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFYaserQuinonezCliente.model.Cliente;
import com.idat.EFYaserQuinonezCliente.service.ClienteService;

@Controller
@RequestMapping("/api/v1/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listarClientes(){
		return service.listarClientes();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarCliente(@RequestBody Cliente cliente) {
		service.guardarCliente(cliente);
	}
	
	@DeleteMapping("/eliminar{id}")
	public @ResponseBody void eliminarCliente(@PathVariable Integer id) {
		service.eliminarCliente(id);
	}
}
