package cvut.fel.dto;

import cvut.fel.entity.*;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DTOMapper {

    // article
    ArticleDTO articleToDto(Article article);

    Iterable<ArticleDTO> articlesToDto(Iterable<Article> articles);

    // articleAuthor
    ArticleAuthorDTO articleAuthorToDto(ArticleAuthor articleAuthor);

    Iterable<ArticleAuthorDTO> articleAuthorsToDto(Iterable<ArticleAuthor> articleAuthor);

    Iterable<Long> articleAuthorLongToDto(Iterable<Long> authors);

    // FileproofArticle
    FileproofArticleDTO fileproofArticleToDto(FileproofArticle fileproof);
    Iterable<FileproofArticleDTO> fileproofArticlesToDto(Iterable<FileproofArticle> fileproofs);

    // File
    FileDTO fileToDto(File file);
    Iterable<FileDTO> filesToDto(Iterable<File> files);

    // author
    AuthorDTO authorToDto(Author author);
    Iterable<AuthorDTO> authorsToDto(Iterable<Author> authors);
    // Corrector
    CorrectorDTO correctorToDto(Corrector corrector);

    Iterable<CorrectorDTO> correctorsToDto(Iterable<Corrector> correctors);

}
