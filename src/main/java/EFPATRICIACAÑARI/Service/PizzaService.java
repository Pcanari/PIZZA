package EFPATRICIACA�ARI.Service;

import java.util.List;

import EFPATRICIACA�ARI.Model.Pizza;



public interface PizzaService {
	
	List<Pizza> listar();
	Pizza ObtenerId(Integer id);	
	void guardar(Pizza pizza);
	void eliminar(Integer id);
	void actualizar(Pizza pizza);	

	void asignarClienteaPizza();
}
