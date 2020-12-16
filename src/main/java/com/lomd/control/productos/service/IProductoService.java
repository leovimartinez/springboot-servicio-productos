package com.lomd.control.productos.service;

import java.util.List;

import com.lomd.control.productos.model.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	
	public Producto findById(Long id);

}
