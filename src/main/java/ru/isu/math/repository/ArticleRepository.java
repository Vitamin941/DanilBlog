package ru.isu.math.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.isu.math.model.Article;

interface ArticleRepository extends CrudRepository<Article, Integer> {
}
