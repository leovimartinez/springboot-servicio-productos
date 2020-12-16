/**
 * 
 */
package com.lomd.control.productos.repository;

import org.springframework.data.repository.CrudRepository;

import com.lomd.control.productos.model.Producto;

/**
 * @author usuario
 *
 */
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
