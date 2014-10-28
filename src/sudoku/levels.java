package sudoku;

public class levels {

	public static int[][] levelarray(int in) {

		int[][] level_1 = { { 99, 99, 99, 99, 99, 99, 99, 99, 99 },
				{ 99, 99, 99, 99, 99, 99, 99, 99, 99 },
				{ 99, 99, 99, 99, 99, 99, 99, 99, 99 },
				{ 99, 99, 99, 99, 99, 99, 99, 99, 99 },
				{ 99, 99, 99, 99, 99, 99, 99, 99, 99 },
				{ 99, 99, 99, 99, 99, 99, 99, 99, 99 },
				{ 99, 99, 99, 99, 99, 99, 99, 99, 99 },
				{ 99, 99, 99, 99, 99, 99, 99, 99, 99 },
				{ 99, 99, 99, 99, 99, 99, 99, 99, 99 } };

		int[][] level_2 = { { 3, 8, 99, 99, 99, 99, 99, 6, 99 },
				{ 4, 1, 99, 99, 99, 9, 99, 99, 99 },
				{ 9, 99, 99, 6, 8, 4, 99, 99, 99 },
				{ 99, 99, 99, 1, 99, 99, 8, 7, 99 },
				{ 99, 2, 8, 99, 99, 3, 99, 99, 99 },
				{ 7, 2, 99, 4, 5, 99, 1, 9, 99},
				{ 99, 99, 99, 9, 4, 8, 99, 99, 7 },
				{ 99, 99, 99, 2, 99, 99, 99, 1, 8 },
				{ 99, 5, 99, 99, 99, 99, 99, 3, 4 } };

		int[][] level_3 = { { 99, 7, 99, 8, 99, 2, 99, 99, 5 },
				{ 5, 99, 99, 99, 99, 1, 99, 99, 99 },
				{ 6, 4, 99, 99, 9, 99, 99, 2, 99 },
				{ 99, 99, 99, 99, 99, 99, 99, 4, 99 },
				{ 99, 99, 1, 99, 8, 99, 6, 99, 99 },
				{ 99, 5, 99, 99, 99, 99, 99, 99, 99 },
				{ 99, 3, 99, 99, 1, 99, 99, 8, 7 },
				{ 99, 99, 99, 9, 99, 99, 99, 99, 3 },
				{ 9, 99, 99, 6, 99, 8, 99, 1, 99 } };
		
		int[][] level_4 = {{99,99,99,99,4,99,2,3,9},
				{99,99,99,99,99,8,99,5,99},
				{99,99,99,99,99,9,99,99,4},
				{99,99,6,8,99,99,5,99,3},
				{99,8,4,99,1,99,9,7,99},
				{9,99,3,99,99,6,4,99,99},
				{5,99,99,9,99,99,99,99,99},
				{99,2,99,3,99,99,99,99,99},
				{3,1,7,99,8,99,99,99,99}};



//		if (in == 1) {
//			return level_1;
//		} else if (in == 2) {
//			return level_2;
//		} else if (in == 3) {
//			return level_3;
//		} else if (in == 4) {
//			return level_4;
//		}
//
//		return level_1;
                
                switch (in){
                        case 1:
                            return level_1;
                        case 2:
                            return level_2;
                        case 3:
                            return level_3;
                        case 4:
                            return level_4;
                        default:
                            return level_2;
                }

	}

	public static int[][] levelanswers(int in) {

		int[][] level_1 = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, },
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, } };

		int[][] level_2 = { { 3, 8, 2, 5, 1, 7, 4, 6, 9, },
				{ 4, 1, 6, 3, 2, 9, 7, 8, 5, }, { 9, 7, 5, 6, 8, 4, 3, 2, 1, },
				{ 5, 6, 4, 1, 9, 2, 8, 7, 3, }, { 1, 9, 3, 8, 7, 6, 5, 4, 2, },
				{ 7, 2, 8, 4, 5, 3, 1, 9, 6, }, { 2, 3, 1, 9, 4, 8, 6, 5, 7, },
				{ 6, 4, 7, 2, 3, 5, 9, 1, 8, }, { 8, 5, 9, 7, 6, 1, 2, 3, 4, } };

		int[][] level_3 = { { 1, 7, 9, 8, 6, 2, 4, 3, 5, },
				{ 5, 8, 2, 3, 4, 1, 7, 9, 6, }, { 6, 4, 3, 5, 9, 7, 1, 2, 8, },
				{ 2, 6, 8, 7, 5, 9, 3, 4, 1, }, { 7, 9, 1, 4, 8, 3, 6, 5, 2, },
				{ 3, 5, 4, 1, 2, 6, 8, 7, 9, }, { 4, 3, 6, 2, 1, 5, 9, 8, 7, },
				{ 8, 1, 5, 9, 7, 4, 2, 6, 3, }, { 9, 2, 7, 6, 3, 8, 5, 1, 4, } };
		
		int[][] level_4 = { {8,6,1,7,4,5,2,3,9},
				{4,9,2,6,3,8,1,5,7},
				{7,3,5,1,2,9,8,6,4},
				{1,7,6,8,9,4,5,2,3},
				{2,8,4,5,1,3,9,7,6},
				{9,5,3,2,7,6,4,8,1},
				{5,4,8,9,6,7,3,1,2},
				{6,2,9,3,5,1,7,4,8},
				{3,1,7,4,8,2,6,9,5} };

		if (in == 1) {
			return level_1;
		} else if (in == 2) {
			return level_2;
		} else if (in == 3) {
			return level_3;
		} else if (in == 4) {
			return level_4;
		}

		return level_1;

	}
}
