package cvut.fel.controller;

import cvut.fel.dto.AuthorDTO;
import cvut.fel.dto.DTOMapper;
import cvut.fel.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorController {

    private final AuthorService authorService;
    private final DTOMapper dtoMapper;

    public AuthorController(AuthorService authorService, DTOMapper dtoMapper) {
        this.authorService = authorService;
        this.dtoMapper = dtoMapper;
    }

    @GetMapping("/author")
    public ResponseEntity<Iterable<AuthorDTO>> getAllArticles() {
        return ResponseEntity.ok(dtoMapper.authorsToDto(authorService.findAll()));
    }

    @GetMapping("/author/{id}")
    public ResponseEntity<AuthorDTO> getArticleById(@PathVariable Long id) {
        return ResponseEntity.ok(dtoMapper.authorToDto(authorService.findById(id)));
    }

    @PostMapping("/author")
    public ResponseEntity<AuthorDTO> addArticle(@PathVariable String name){
        return ResponseEntity.ok(dtoMapper.authorToDto(authorService.save(name)));
    }

    @DeleteMapping("/author/{id}")
    public ResponseEntity<AuthorDTO> removeArticle(@PathVariable Long id){
        return ResponseEntity.ok(dtoMapper.authorToDto(authorService.delete(id)));
    }

    @PutMapping("/author")
    public ResponseEntity<AuthorDTO> updateArticle(@PathVariable Long id, @PathVariable String name){
        return ResponseEntity.ok(dtoMapper.authorToDto(authorService.update(id, name)));
    }

}
