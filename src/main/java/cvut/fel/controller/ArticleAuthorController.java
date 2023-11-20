package cvut.fel.controller;

import cvut.fel.dto.*;
import cvut.fel.service.ArticleAuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArticleAuthorController {

    private final ArticleAuthorService articleAuthorService;
    private final DTOMapper dtoMapper;

    public ArticleAuthorController(ArticleAuthorService articleAuthorService, DTOMapper dtoMapper) {
        this.articleAuthorService = articleAuthorService;
        this.dtoMapper = dtoMapper;
    }

    @GetMapping("/articleAuthor")
    public ResponseEntity<Iterable<ArticleAuthorDTO>> getAllArticleAuthors() {
        return ResponseEntity.ok(dtoMapper.articleAuthorsToDto(articleAuthorService.findAll()));
    }

    @GetMapping("/articleAuthor/{id}")
    public ResponseEntity<ArticleAuthorDTO> getArticleAuthorById(@PathVariable Long id) {
        return ResponseEntity.ok(dtoMapper.articleAuthorToDto(articleAuthorService.findById(id)));
    }

    @PostMapping("/articleAuthor")
    public ResponseEntity<ArticleAuthorDTO> addArticle(@PathVariable Long article, @PathVariable Long author) {
        return ResponseEntity.ok(dtoMapper.articleAuthorToDto(articleAuthorService.save(article, author)));
    }

    @DeleteMapping("/articleAuthor/{id}")
    public ResponseEntity<ArticleAuthorDTO> removeArticle(@PathVariable Long id) {
        return ResponseEntity.ok(dtoMapper.articleAuthorToDto(articleAuthorService.delete(id)));
    }

    @PutMapping("/articleAuthor")
    public ResponseEntity<ArticleAuthorDTO> updateArticle(@PathVariable Long id, @PathVariable String name,
            @PathVariable Long article, @PathVariable Long author) {
        return ResponseEntity.ok(dtoMapper.articleAuthorToDto(articleAuthorService.update(id, name, article, author)));
    }

    @GetMapping("/articleAuthor/getAllByAuthor/{id}")
    public ResponseEntity<Iterable<Long>> getAllAuthor(@PathVariable Long id) {
        return ResponseEntity.ok(dtoMapper.articleAuthorLongToDto(articleAuthorService.findAuthorsByArticle(id)));
    }
}
