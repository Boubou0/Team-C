package cvut.fel.controller;

import cvut.fel.dto.ArticleDTO;
import cvut.fel.dto.DTOMapper;
import cvut.fel.service.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArticleController {

    private final ArticleService articleService;
    private final DTOMapper dtoMapper;

    public ArticleController(ArticleService articleService, DTOMapper dtoMapper) {
        this.articleService = articleService;
        this.dtoMapper = dtoMapper;
    }

    @GetMapping("/article")
    public ResponseEntity<Iterable<ArticleDTO>> getAllArticles() {
        return ResponseEntity.ok(dtoMapper.articlesToDto(articleService.findAll()));
    }

    @GetMapping("/article/{id}")
    public ResponseEntity<ArticleDTO> getArticleById(@PathVariable Long id) {
        return ResponseEntity.ok(dtoMapper.articleToDto(articleService.findById(id)));
    }

    @PostMapping("/article")
    public ResponseEntity<ArticleDTO> addArticle(@PathVariable String name, @PathVariable int version, @PathVariable int state){
        return ResponseEntity.ok(dtoMapper.articleToDto(articleService.save(name, version, state)));
    }

    @DeleteMapping("/article/{id}")
    public ResponseEntity<ArticleDTO> removeArticle(@PathVariable Long id){
        return ResponseEntity.ok(dtoMapper.articleToDto(articleService.delete(id)));
    }

    @PutMapping("/article")
    public ResponseEntity<ArticleDTO> updateArticle(@PathVariable Long id, @PathVariable String name, @PathVariable int version, @PathVariable int state){
        return ResponseEntity.ok(dtoMapper.articleToDto(articleService.update(id, name, version, state)));
    }
}
