package week3;

public class Week3_3 {
    public static void main(String[] args) {
        int[][] iArr = {{7, 6, 5, 4, 3},    // 문제에서 주어진 배열 선언 및 초기화
                {5, 4, 3, 2, 1},
                {11, 10, 9, 8, 7}};

        int[][] iResArr = new int[3][5];    // 주어진 배열과 동일한 3 * 5 2차원 배열 선언

        // iArr 을 행 단위로 복사하여 iResArr 에 붙여 넣는 방식
        for (int i = 0; i < iArr.length; i++) { // 행 단위로 할 것이기 때문에 for 문을 0 ~ iArr.length - 1 만큼 반복
            if (i != iArr.length - 1) {     // 마지막 행이 아닐 때는
                for (int j = 0; j < iArr[0].length; j++) {
                    iResArr[i + 1][j] = iArr[i][j];     // iArr -> iResArr 로 한 행씩 아래로 붙여 넣음
                }
            } else {    // 마지막 행일 때는
                for (int q = 0; q < iArr[0].length; q++) {
                    iResArr[0][q] = iArr[iArr.length - 1][q];   // iResArr 의 첫번째 행에 붙여넣음
                }
            }
        }

        System.out.println("주어진 배열 : ");
        for (int x = 0; x < iArr.length; x++) {  // 반복문 이용하여 배열의 모든 원소 출력
            for (int y = 0; y < iArr[x].length; y++) {   // 2차원 배열이기 때문에 2중 for 문 필요
                System.out.print(iArr[x][y] + " ");
            }
            System.out.println();   // 가독성을 위한 개행
        }
        System.out.println();

        System.out.println("문제의 조건에 맞게 변한 배열 : ");
        for (int x = 0; x < iResArr.length; x++) {  // 반복문 이용하여 배열의 모든 원소 출력
            for (int y = 0; y < iResArr[x].length; y++) {   // 2차원 배열이기 때문에 2중 for 문 필요
                System.out.print(iResArr[x][y] + " ");
            }
            System.out.println();   // 가독성을 위한 개행
        }
    }
}
//        System.out.println(iArr[0].length); //5
//        System.out.println(iArr.length); //3
