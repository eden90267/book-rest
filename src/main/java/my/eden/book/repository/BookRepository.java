package my.eden.book.repository;

import my.eden.book.vo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by eden_liu on 2016/5/27.
 */
@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT COUNT(b) FROM Book b WHERE b.bookName = :bookName")
    long findCountByBookName(@Param("bookName") String bookName);

}
