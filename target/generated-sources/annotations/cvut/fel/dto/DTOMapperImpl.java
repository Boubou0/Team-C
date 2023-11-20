package cvut.fel.dto;

import cvut.fel.entity.Article;
import cvut.fel.entity.ArticleAuthor;
import cvut.fel.entity.Author;
import cvut.fel.entity.Corrector;
import cvut.fel.entity.File;
import cvut.fel.entity.FileproofArticle;
import java.util.ArrayList;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-30T23:45:17+0200",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.3 (Eclipse Adoptium)"
)
@Component
public class DTOMapperImpl implements DTOMapper {

    @Override
    public ArticleDTO articleToDto(Article article) {
        if ( article == null ) {
            return null;
        }

        ArticleDTO articleDTO = new ArticleDTO();

        articleDTO.setId( article.getId() );
        articleDTO.setName( article.getName() );
        articleDTO.setState( article.getState() );
        articleDTO.setVersion( article.getVersion() );

        return articleDTO;
    }

    @Override
    public Iterable<ArticleDTO> articlesToDto(Iterable<Article> articles) {
        if ( articles == null ) {
            return null;
        }

        ArrayList<ArticleDTO> iterable = new ArrayList<ArticleDTO>();
        for ( Article article : articles ) {
            iterable.add( articleToDto( article ) );
        }

        return iterable;
    }

    @Override
    public ArticleAuthorDTO articleAuthorToDto(ArticleAuthor articleAuthor) {
        if ( articleAuthor == null ) {
            return null;
        }

        ArticleAuthorDTO articleAuthorDTO = new ArticleAuthorDTO();

        articleAuthorDTO.setId( articleAuthor.getId() );
        articleAuthorDTO.setName( articleAuthor.getName() );
        articleAuthorDTO.setArticle( articleAuthor.getArticle() );
        articleAuthorDTO.setAuthor( articleAuthor.getAuthor() );

        return articleAuthorDTO;
    }

    @Override
    public Iterable<ArticleAuthorDTO> articleAuthorsToDto(Iterable<ArticleAuthor> articleAuthor) {
        if ( articleAuthor == null ) {
            return null;
        }

        ArrayList<ArticleAuthorDTO> iterable = new ArrayList<ArticleAuthorDTO>();
        for ( ArticleAuthor articleAuthor1 : articleAuthor ) {
            iterable.add( articleAuthorToDto( articleAuthor1 ) );
        }

        return iterable;
    }

    @Override
    public Iterable<Long> articleAuthorLongToDto(Iterable<Long> authors) {
        if ( authors == null ) {
            return null;
        }

        ArrayList<Long> iterable = new ArrayList<Long>();
        for ( Long long1 : authors ) {
            iterable.add( long1 );
        }

        return iterable;
    }

    @Override
    public FileproofArticleDTO fileproofArticleToDto(FileproofArticle fileproof) {
        if ( fileproof == null ) {
            return null;
        }

        FileproofArticleDTO fileproofArticleDTO = new FileproofArticleDTO();

        fileproofArticleDTO.setId( fileproof.getId() );
        fileproofArticleDTO.setName( fileproof.getName() );
        fileproofArticleDTO.setCorrectionFile( fileproof.getCorrectionFile() );
        fileproofArticleDTO.setCorrectionText( fileproof.getCorrectionText() );

        return fileproofArticleDTO;
    }

    @Override
    public Iterable<FileproofArticleDTO> fileproofArticlesToDto(Iterable<FileproofArticle> fileproofs) {
        if ( fileproofs == null ) {
            return null;
        }

        ArrayList<FileproofArticleDTO> iterable = new ArrayList<FileproofArticleDTO>();
        for ( FileproofArticle fileproofArticle : fileproofs ) {
            iterable.add( fileproofArticleToDto( fileproofArticle ) );
        }

        return iterable;
    }

    @Override
    public FileDTO fileToDto(File file) {
        if ( file == null ) {
            return null;
        }

        FileDTO fileDTO = new FileDTO();

        fileDTO.setId( file.getId() );
        fileDTO.setName( file.getName() );
        fileDTO.setDate( file.getDate() );
        fileDTO.setLabel( file.getLabel() );

        return fileDTO;
    }

    @Override
    public Iterable<FileDTO> filesToDto(Iterable<File> files) {
        if ( files == null ) {
            return null;
        }

        ArrayList<FileDTO> iterable = new ArrayList<FileDTO>();
        for ( File file : files ) {
            iterable.add( fileToDto( file ) );
        }

        return iterable;
    }

    @Override
    public AuthorDTO authorToDto(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorDTO authorDTO = new AuthorDTO();

        authorDTO.setId( author.getId() );
        authorDTO.setName( author.getName() );

        return authorDTO;
    }

    @Override
    public Iterable<AuthorDTO> authorsToDto(Iterable<Author> authors) {
        if ( authors == null ) {
            return null;
        }

        ArrayList<AuthorDTO> iterable = new ArrayList<AuthorDTO>();
        for ( Author author : authors ) {
            iterable.add( authorToDto( author ) );
        }

        return iterable;
    }

    @Override
    public CorrectorDTO correctorToDto(Corrector corrector) {
        if ( corrector == null ) {
            return null;
        }

        CorrectorDTO correctorDTO = new CorrectorDTO();

        correctorDTO.setId( corrector.getId() );
        correctorDTO.setName( corrector.getName() );
        correctorDTO.setEmail( corrector.getEmail() );
        correctorDTO.setTel( corrector.getTel() );

        return correctorDTO;
    }

    @Override
    public Iterable<CorrectorDTO> correctorsToDto(Iterable<Corrector> correctors) {
        if ( correctors == null ) {
            return null;
        }

        ArrayList<CorrectorDTO> iterable = new ArrayList<CorrectorDTO>();
        for ( Corrector corrector : correctors ) {
            iterable.add( correctorToDto( corrector ) );
        }

        return iterable;
    }
}
