package novi.backend.backendspringbootcontrollertechiteasy.repository;

import novi.backend.backendspringbootcontrollertechiteasy.models.Television;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelevisionRepository extends JpaRepository<Television, Long> {

    List<Television> findAllTelevisionsByBrandEqualsIgnoreCase(String brand);

}
