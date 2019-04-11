package pl.jkk.demo.repository;

import pl.jkk.demo.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


}