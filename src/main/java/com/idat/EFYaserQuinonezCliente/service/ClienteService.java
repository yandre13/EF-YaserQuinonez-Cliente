package com.idat.EFYaserQuinonezCliente.service;

import java.util.List;

import com.idat.EFYaserQuinonezCliente.model.Cliente;

public interface ClienteService {

	public List<Cliente> listarClientes();
	public String obtenerrCliente(Integer id);
	public void guardarCliente(Cliente cliente);
	public void actualizarCliente(Cliente cliente);
	public void eliminarCliente(Integer id);
	
}
