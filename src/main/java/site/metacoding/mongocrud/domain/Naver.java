package site.metacoding.mongocrud.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "navers") // 몽고DB greendb-navers라는 컬렉션에 매핑된다.
public class Naver {
    // 몽고DB의 _id는 String이다.
    // 사실 몽고 ObjectId의 정확한 타입은 자바스크립트 오브젝트 타입이다.
    @Id
    private String _id;
    private String company;
    private String title;
}