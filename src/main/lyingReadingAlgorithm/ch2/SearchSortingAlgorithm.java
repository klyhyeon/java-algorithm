package lyingReadingAlgorithm.ch2;

public class SearchSortingAlgorithm {

    private int[] a = {2,4,8};
    private int[] b = {0,1,2,3,4,5,7,8,10};

    public static void main(String[] args) {
        SearchSortingAlgorithm searchSortingAlgorithm = new SearchSortingAlgorithm();
        searchSortingAlgorithm.algo2();
    }

    private void algo2() {
        //정렬한 뒤 한 바퀴만 돌면서 확인한다.
        int jCur = 0;
        for (int aEle : a) {
            for (int j = jCur; jCur < b.length; jCur++) {
                if (aEle == b[jCur]) {
                    break;
                }
            }
        }
    }
}
