import java.time.LocalDate;

public class PostMan {
	private PostLogger logger;
	
	public PostMan() {
		logger = new PostLogger();
	}
	public void send(String from, String to) {
		// 우편 보내는 기능 구현 완료
		
		// 기록 남기기 (현재 날짜, from, to)
		logger.log(from, to);
	}
	
	private class PostLogger {
		public void log(String from, String to) {
			System.out.println(LocalDate.now() + ": from-" + from + ", to-" + to);
		}
	}
	
	public static void main(String[] args) {
		PostMan postMan = new PostMan();
		
		postMan.send("둘리", "길동");
	}
}
