import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class Coffee {
	private int shot;
	private int milk;
	private int sugar;
}
