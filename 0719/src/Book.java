import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor // 기본값으로 초기화하는 생성자?
@AllArgsConstructor // 모든 필드를 초기화 하는 생성자
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Book {
	private String title;
	private int price;
	
	
}
