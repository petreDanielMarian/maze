
/**
 * Aceasta clasa prezinta o adaptare a algoritmului lui Lee
 */
import java.util.LinkedList;

public class FindingRJ {

	public int[][] roadFromRtoJ(char[][] map, int characteri, int characterj) {

		int[][] cost = new int[map.length][map[0].length];
		cost[characteri][characterj] = 1;
		LinkedList<QueueRJ> characterq = new LinkedList<QueueRJ>();

		QueueRJ character = new QueueRJ();

		character.setI(characteri);
		character.setJ(characterj);

		characterq.add(character);

		while (!characterq.isEmpty()) {
			QueueRJ rj = characterq.remove();

			int x, y;
			x = rj.getI();
			y = rj.getJ();

			if (x - 1 >= 0 && y - 1 >= 0 && cost[x - 1][y - 1] == 0 && map[x - 1][y - 1] != 'X') {
				characterq.add(new QueueRJ(x - 1, y - 1));
				cost[x - 1][y - 1] = cost[x][y] + 1;

			}
			if (x - 1 >= 0 && cost[x - 1][y] == 0 && map[x - 1][y] != 'X') {

				characterq.add(new QueueRJ(x - 1, y));

				cost[x - 1][y] = cost[x][y] + 1;

			}
			if (x - 1 >= 0 && y + 1 < map[0].length && cost[x - 1][y + 1] == 0 && map[x - 1][y + 1] != 'X') {

				characterq.add(new QueueRJ(x - 1, y + 1));
				cost[x - 1][y + 1] = cost[x][y] + 1;

			}
			if (y - 1 >= 0 && cost[x][y - 1] == 0 && map[x][y - 1] != 'X') {

				characterq.add(new QueueRJ(x, y - 1));
				cost[x][y - 1] = cost[x][y] + 1;

			}
			if (y + 1 < map[0].length && cost[x][y + 1] == 0 && map[x][y + 1] != 'X') {
				characterq.add(new QueueRJ(x, y + 1));
				cost[x][y + 1] = cost[x][y] + 1;

			}
			if (x + 1 < map.length && y - 1 >= 0 && cost[x + 1][y - 1] == 0 && map[x + 1][y - 1] != 'X') {

				characterq.add(new QueueRJ(x + 1, y - 1));

				cost[x + 1][y - 1] = cost[x][y] + 1;

			}
			if (x + 1 < map.length && cost[x + 1][y] == 0 && map[x + 1][y] != 'X') {

				characterq.add(new QueueRJ(x + 1, y));
				cost[x + 1][y] = cost[x][y] + 1;
			}
			if (x + 1 < map.length && y + 1 < map[0].length && cost[x + 1][y + 1] == 0 && map[x + 1][y + 1] != 'X') {
				characterq.add(new QueueRJ(x + 1, y + 1));
				cost[x + 1][y + 1] = cost[x][y] + 1;

			}

		}

		return cost;

	}

}