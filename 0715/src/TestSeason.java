
public class TestSeason {
	public static void main(String[] args) {
		Season myFavSeason = Season.FALL;
		
		Season yourFavSeason = Season.SUMMER;
		
		Season hisFavSeason = Season.SUMMER;
		
		System.out.println(myFavSeason == yourFavSeason);
		System.out.println(hisFavSeason == yourFavSeason);
		
		System.out.println(Season.SPRING);
	}
}
