import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyDynamicHolder<T> {
	private T value;
}
