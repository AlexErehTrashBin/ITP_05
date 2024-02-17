package ru.vsu.cs.vvp2022.g112.ereshkin_a_v.task05;

public class Main {
	private static void drawBorder(int repeat) {
		for(int i = 0; i < repeat; ++i) {
			System.out.print("-");
		}

		System.out.print("\n");
	}
	private static void drawLineForLeftBullshit(int width, int row){
		int exclMarksCount = width - (row - 1);
		int spacesCount = width - exclMarksCount;
		for (int i = 0; i < spacesCount; i++) {
			System.out.print(' ');
		}
		for (int i = 0; i < exclMarksCount; i++) {
			System.out.print('!');
		}
		System.out.println();
	}
	private static void drawLineForRightBullshit(int width, int index){
		int exclMarksCount = width - (index - 1);
		int spacesCount = width - exclMarksCount;
		for (int i = 0; i < exclMarksCount; i++) {
			System.out.print('!');
		}
		for (int i = 0; i < spacesCount; i++) {
			System.out.print(' ');
		}
		System.out.println();
	}
	private static void drawFigure(int width) {
		if(width < 3) return;

		int currentStateRow = 1;
		boolean isCurrentStateLeft = true;

		for(int i = 1; i <= width; i++) {
			drawBorder(width);
			if (isCurrentStateLeft) {
				drawLineForLeftBullshit(width, currentStateRow);
			} else {
				drawLineForRightBullshit(width, currentStateRow);
			}
			currentStateRow++;
			isCurrentStateLeft = !isCurrentStateLeft;
		}
		drawBorder(width);
	}

	public static void main(String[] args) {
		drawFigure(11);
	}
}