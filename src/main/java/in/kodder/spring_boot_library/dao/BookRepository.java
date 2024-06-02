package in.kodder.spring_boot_library.dao;

import in.kodder.spring_boot_library.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.data.domain.Pageable;

public interface BookRepository extends JpaRepository<Book,Long> {
    Page<Book> findByTitleContaining(@RequestParam("title") String title, Pageable pageable);
}
