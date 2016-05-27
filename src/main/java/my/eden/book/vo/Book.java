package my.eden.book.vo;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by eden_liu on 2016/5/27.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "bookname")
    private String bookName;

    @Column(name = "bookprice")
    private BigDecimal bookPrice;

    @Column(name = "bookimage")
    private String bookImage;

    @Column(name = "createtime")
    private Date createTime;

}
