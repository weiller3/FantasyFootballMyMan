import static org.junit.Assert.*;
import org.junit.*;




public class GameTest {

	private Game samaLid;
	private Game sitthvortLid;
	private Game pissuLabbi; 
	
	@Before
	public void setUp(){
		samaLid = new Game("Chelsea FC","Chelsea FC");
		sitthvortLid = new Game ("Arsenal", "");
		pissuLabbi = new Game ("Arsenal","Liverpool");
	}
	@After
	public void tearDown() {
		samaLid = null;
		sitthvortLid = null;
		pissuLabbi = null;
	}
	@Test
	public void testValidGame() {
		
		assertFalse(samaLid.getHomeTeam() == samaLid.getAwayTeam());
	}
}
