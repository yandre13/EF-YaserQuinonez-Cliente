package com.idat.EFYaserQuinonezCliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFYaserQuinonezCliente.model.Cliente;
import com.idat.EFYaserQuinonezCliente.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<Cliente> listarClientes() {
		return repository.findAll();
	}

	@Override
	public String obtenerrCliente(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardarCliente(Cliente cliente) {
		repository.save(cliente);
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
