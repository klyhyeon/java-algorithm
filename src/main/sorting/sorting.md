### 정렬


1. 선택 정렬
- 현재 인덱스의 다음부터 끝까지 숫자들과 현재 인덱스의 값을 비교하며, 가장 작은 수(혹은 큰 수) 위치를 교체하는 정렬
- 전체 연산 횟수는 (n - 1) + (n - 2) + ... +1를 등차수열 합 공식으로 나타냐면 (n - 1)(n - 2) / 2 입니다. 등차수열 합은 1부터 10까지 합을 구하는 공식을 생각하면 쉬운데요. (10 * 11 / 2 = 55) 따라서 시간복잡도는 `O(n^2)` 입니다.

```java

 for(int i = 0; i < totalNumber; i++) {
            numbers[i] = in.nextInt();
 }
        for (int i = 0; i < totalNumber - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < totalNumber; j++) {
                if (numbers[j] < numbers[idx]) {
                    idx = j;
                }
            }

            int tempValue = numbers[i];
            numbers[i] = numbers[idx];
            numbers[idx] = tempValue;
        }
```

2. 삽입 정렬
- 현재 인덱스(key)의 이전 값(j)와 비교해 더 작은 수(혹은 큰 수)를 만날 때까지 반복하여 위치를 교체하는 정렬
- 선택 정렬과 마찬가지로 시간복잡도는 `O(n^2)` 입니다. 하지만 정렬이 거의 되어 있다면 최대 `O(n)` 시간 복잡도까지 단축시킬 수 있습니다.
- 바로 이전 값이 더 작다면 한번 비교 후 다음 인덱스로 넘어가기 때문입니다.

```java
        for (int i = 1; i < totalNumber; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
```

3. 퀵 정렬
- 리스트에 있는 한 요소를 선택하고 이를 기준(pivot)으로 삼아 기준보다 작은 요소들은 모두 기준의 왼쪽, 큰 요소들은 모두 기준의 오른쪽에 위치시킵니다.
- 피벗을 제외한 왼쪽 리스트와 오른쪽 리스트를 같은 방법으로 다시 정렬합니다.
- https://www.youtube.com/watch?v=7BDzle2n47c

4. 병합 정렬
- https://www.youtube.com/watch?v=QAyl79dCO_k