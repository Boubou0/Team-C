package cvut.fel.controller;

import cvut.fel.dto.ArticleDTO;
import cvut.fel.dto.CorrectorDTO;
import cvut.fel.dto.DTOMapper;
import cvut.fel.service.ArticleService;
import cvut.fel.service.CorrectorService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CorrectorController {

    private final CorrectorService correctorService;
    private final DTOMapper dtoMapper;

    public CorrectorController(CorrectorService correctorService, DTOMapper dtoMapper) {
        this.correctorService = correctorService;
        this.dtoMapper = dtoMapper;
    }

    @GetMapping("/corrector")
    public ResponseEntity<Iterable<CorrectorDTO>> getAllArticles() {
        return ResponseEntity.ok(dtoMapper.correctorsToDto(correctorService.findAll()));
    }

    @GetMapping("/corrector/{id}")
    public ResponseEntity<CorrectorDTO> getArticleById(@PathVariable Long id) {
        return ResponseEntity.ok(dtoMapper.correctorToDto(correctorService.findById(id)));
    }

    @PostMapping("/corrector")
    public ResponseEntity<CorrectorDTO> addArticle(@PathVariable String email, @PathVariable String tel) {
        return ResponseEntity.ok(dtoMapper.correctorToDto(correctorService.save(email, tel)));
    }

    @DeleteMapping("/corrector/{id}")
    public ResponseEntity<CorrectorDTO> removeArticle(@PathVariable Long id) {
        return ResponseEntity.ok(dtoMapper.correctorToDto(correctorService.delete(id)));
    }

    @PutMapping("/corrector")
    public ResponseEntity<CorrectorDTO> updateArticle(@PathVariable Long id, @PathVariable String email,
            @PathVariable String tel) {
        return ResponseEntity.ok(dtoMapper.correctorToDto(correctorService.update(id, email, tel)));
    }
}
