package cvut.fel.repository;

import cvut.fel.entity.File;

import org.springframework.data.repository.CrudRepository;

public interface FileRepository extends CrudRepository<File, Long> {

}
