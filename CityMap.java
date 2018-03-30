import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * In aceasta clasa se afla citirea din fisier a hartii si transformarea ei
 * intr-o matrice de tip char
 * 
 * @author Daniel
 *
 */
public class CityMap {

	private char[][] map;
	private int row;
	private int col;

	/**
	 * Citim matricea din fisier si returnam o matrice de tip char
	 * 
	 * @return
	 */
	public char[][] MapRead() {
		Scanner scan = null;
		File myfile = new File("maze.in");

		try {
			scan = new Scanner(myfile);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		row = scan.nextInt();
		col = scan.nextInt();

		map = new char[row][col];

		scan.nextLine();

		String temp_string = new String();

		for (int i = 0; i < row; i++) {

			temp_string = scan.nextLine();
			char[] ctemp = temp_string.toCharArray();

			for (int j = 0; j < col; j++) {

				this.map[i][j] = ctemp[j];
			}
		}

		scan.close();

		return map;
	}

	/**
	 * Cu ajutorul metodei, aflam pozitia caracterului Romeo
	 * 
	 * @param map
	 * @return
	 */
	public Character findR(char[][] map) {

		Character R = new Character();

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 'R') {
					R.setI(i);
					R.setJ(j);
				}
			}
		}
		return R;

	}

	/**
	 * Cu ajutorul metodei, aflam pozitia caracterului Juliet
	 * 
	 * @param map
	 * @return
	 */
	public Character findJ(char[][] map) {

		Character J = new Character();

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 'J') {
					J.setI(i);
					J.setJ(j);
				}
			}
		}
		return J;

	}

}
