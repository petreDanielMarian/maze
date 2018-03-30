/**
 * In aceasta clasa gasim coordonate: i si j; Ulterior, folosim aceasta clasa ca
 * un tip de date pentru a fi introduse intr-un Queue
 * 
 * @author Daniel
 *
 */
public class QueueRJ {
	private int i;
	private int j;

	public QueueRJ() {

	}

	/**
	 * Am creat un constructor pentru a ne usura munca atunci cand vrem sa
	 * adaugam un obiect de tip QueueRJ intr-un LinkedList
	 * 
	 * @param i
	 * @param j
	 */
	public QueueRJ(int i, int j) {

		this.i = i;
		this.j = j;

	}

	/**
	 * getter pentru coorodnata i
	 * 
	 * @return
	 */
	public int getI() {
		return i;
	}

	/**
	 * setter pentru coorodnata i
	 * 
	 * @return
	 */
	public void setI(int i) {
		this.i = i;
	}

	/**
	 * getter pentru coorodnata j
	 * 
	 * @return
	 */
	public int getJ() {
		return j;
	}

	/**
	 * setter pentru coorodnata j
	 * 
	 * @return
	 */
	public void setJ(int j) {
		this.j = j;
	}
}
