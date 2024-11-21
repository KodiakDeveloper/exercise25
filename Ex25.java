package selectionStructures;

import javax.swing.JOptionPane;

public class Ex25 {

	public static void main(String[] args) {

		Double a, b, c, x1, x2;

		Double delta = 0.0;

		a = Double.parseDouble(JOptionPane.showInputDialog(null, "Input A : "));

		b = Double.parseDouble(JOptionPane.showInputDialog(null, "Input B : "));

		c = Double.parseDouble(JOptionPane.showInputDialog(null, "Input C : "));

		if (a <= 0 && b <= 0 && c <= 0) {

			JOptionPane.showMessageDialog(null, "Input only positive and greater than zero!");

			return;

		}

		delta = (Math.pow(b, 2)) - 4 * a * c;

		JOptionPane.showMessageDialog(null, "Delta Δ = " + delta);

		if (delta == 0) {

			x1 = (-b + Math.sqrt(delta) / (2 * a));

			JOptionPane.showMessageDialog(null, "Root = " + x1);

		}

		else if (delta > 0) {

			x1 = (-b + Math.sqrt(delta) / (2 * a));

			x2 = (-b - Math.sqrt(delta) / (2 * a));

			JOptionPane.showMessageDialog(null, "Root x1 = " + x1 + "\nRoot x2 = " + x2);

		}

		else if (delta < 0) {

			JOptionPane.showMessageDialog(null, "It's not possible calculate root with negative delta!");
		}

	}

}
