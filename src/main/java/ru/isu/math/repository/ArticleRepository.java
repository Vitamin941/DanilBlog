package ru.isu.math.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.isu.math.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {
}
