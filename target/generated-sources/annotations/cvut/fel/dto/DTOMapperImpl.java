package cvut.fel.dto;

import cvut.fel.entity.Book;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-28T15:02:07+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_333 (BellSoft)"
)
@Component
public class DTOMapperImpl implements DTOMapper {

    @Override
    public BookDTO bookToDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDTO bookDTO = new BookDTO();

        bookDTO.setId( book.getId() );
        bookDTO.setName( book.getName() );
        bookDTO.setPublished( book.getPublished() );
        bookDTO.setISBN( book.getISBN() );

        return bookDTO;
    }
}
