package cvut.fel.controller;

import cvut.fel.dto.DTOMapper;
import cvut.fel.dto.FileproofArticleDTO;
import cvut.fel.service.FileproofArticleService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FileproofArticleController {

    private final FileproofArticleService fileproofArticleControllerService;
    private final DTOMapper dtoMapper;

    public FileproofArticleController(FileproofArticleService fileproofArticleControllerService, DTOMapper dtoMapper) {
        this.fileproofArticleControllerService = fileproofArticleControllerService;
        this.dtoMapper = dtoMapper;
    }

    @GetMapping("/fileproofarticle")
    public ResponseEntity<Iterable<FileproofArticleDTO>> getAllArticles() {
        return ResponseEntity.ok(dtoMapper.fileproofArticlesToDto(fileproofArticleControllerService.findAll()));
    }

    @GetMapping("/fileproofarticle/{id}")
    public ResponseEntity<FileproofArticleDTO> getArticleById(@PathVariable Long id) {
        return ResponseEntity.ok(dtoMapper.fileproofArticleToDto(fileproofArticleControllerService.findById(id)));
    }

    @PostMapping("/fileproofarticle")
    public ResponseEntity<FileproofArticleDTO> addArticle(@PathVariable String correctionText,
            @PathVariable int correctionFile) {
        return ResponseEntity.ok(dtoMapper
                .fileproofArticleToDto(fileproofArticleControllerService.save(correctionText, correctionFile)));
    }

    @DeleteMapping("/fileproofarticle/{id}")
    public ResponseEntity<FileproofArticleDTO> removeArticle(@PathVariable Long id) {
        return ResponseEntity.ok(dtoMapper.fileproofArticleToDto(fileproofArticleControllerService.delete(id)));
    }

    @PutMapping("/fileproofarticle")
    public ResponseEntity<FileproofArticleDTO> updateArticle(@PathVariable Long id, @PathVariable String correctionText,
            @PathVariable int correctionFile) {
        return ResponseEntity.ok(
                dtoMapper.fileproofArticleToDto(
                        fileproofArticleControllerService.update(id, correctionText, correctionFile)));
    }
}
