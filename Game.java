import java.io.PrintWriter;

/**
 * In aceasta clasa, folosim functionalitatea celorlalte metode pentru a putea
 * calcula ruta cea mai scurta si punctul de intalnire favorabil
 * 
 * @author Daniel
 *
 */
public class Game {
	/**
	 * Apelam celelate clase si metode pentru a putea afla minimum de drum si
	 * apoi scriem in fisier
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;

		int[][] costJ;
		int[][] costR;

		CityMap citymap = new CityMap();
		FindingRJ find = new FindingRJ();
		char[][] map = citymap.MapRead();

		int romeoi = citymap.findR(map).getI();
		int romeoj = citymap.findR(map).getJ();
		int julieti = citymap.findJ(map).getI();
		int julietj = citymap.findJ(map).getJ();

		costR = find.roadFromRtoJ(map, romeoi, romeoj);
		costJ = find.roadFromRtoJ(map, julieti, julietj);

		for (int i = 0; i < costR.length; i++) {
			for (int j = 0; j < costR[i].length; j++) {
				if (costR[i][j] == costJ[i][j] && costR[i][j] < min && costR[i][j] != 0) {
					min = costR[i][j];
				}
			}
		}

		try {
			PrintWriter writer = null;
			writer = new PrintWriter("maze.out", "UTF-8");
			for (int i = 0; i < costR.length; i++) {
				for (int j = 0; j < costR[i].length; j++) {

					if (costR[i][j] == costJ[i][j] && costJ[i][j] == min) {

						writer.println(min + " " + (i + 1) + " " + (j + 1));

					}
				}

			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println();

	}

}
