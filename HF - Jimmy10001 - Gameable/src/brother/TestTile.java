/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */
package brother;

public class TestTile {
	public static void main(String[] args)
	{
		System.out.println(testTile());
	}
	
	public static String testTile()
	{
		Tile tile = new Tile('z', 10);
		return tile.printTile(tile);
	}
}
