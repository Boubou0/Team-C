package cvut.fel.controller;

import cvut.fel.dto.ArticleDTO;
import cvut.fel.dto.DTOMapper;
import cvut.fel.dto.FileDTO;
import cvut.fel.service.ArticleService;
import cvut.fel.service.FileService;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FileController {

    private final FileService fileService;
    private final DTOMapper dtoMapper;

    public FileController(FileService fileService, DTOMapper dtoMapper) {
        this.fileService = fileService;
        this.dtoMapper = dtoMapper;
    }

    @GetMapping("/file")
    public ResponseEntity<Iterable<FileDTO>> getAllArticles() {
        return ResponseEntity.ok(dtoMapper.filesToDto(fileService.findAll()));
    }

    @GetMapping("/file/{id}")
    public ResponseEntity<FileDTO> getArticleById(@PathVariable Long id) {
        return ResponseEntity.ok(dtoMapper.fileToDto(fileService.findById(id)));
    }

    @PostMapping("/file")
    public ResponseEntity<FileDTO> addArticle(@PathVariable String label,
            @PathVariable Date date) {
        return ResponseEntity.ok(dtoMapper.fileToDto(fileService.save(label, date)));
    }

    @DeleteMapping("/file/{id}")
    public ResponseEntity<FileDTO> removeArticle(@PathVariable Long id) {
        return ResponseEntity.ok(dtoMapper.fileToDto(fileService.delete(id)));
    }

    @PutMapping("/file")
    public ResponseEntity<FileDTO> updateArticle(@PathVariable Long id, @PathVariable String label,
            @PathVariable Date date) {
        return ResponseEntity.ok(dtoMapper.fileToDto(fileService.update(id, label, date)));
    }
}
