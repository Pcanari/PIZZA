package EFPATRICIACAÑARI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFPATRICIACAÑARI.Model.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
