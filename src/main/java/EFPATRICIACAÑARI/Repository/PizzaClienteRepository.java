package EFPATRICIACA�ARI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFPATRICIACA�ARI.Model.PizzaDetalle;
@Repository
public interface PizzaClienteRepository extends JpaRepository<PizzaDetalle, Integer> {

}
