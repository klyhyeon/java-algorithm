package programmers.hash;

import java.util.*;
import java.util.stream.Collectors;

public class BestAlbum {

  public int[] solution(String[] genres, int[] plays) {
    int[] answer = new int[genres.length * 2];
    //1. genreTotal
    int genreTotal = 0;
    Map<String, Integer> totalCountForGenre = new HashMap<>();
    for (int i = 0; i < genres.length; i++) {
      String genreName = genres[i];
      Integer genrePlayCount = plays[i];
      totalCountForGenre.merge(genreName, genrePlayCount, Integer::sum);
    }
    //2. 장르 중 높은 재생을 기록한 노래 2곡씩 모은다
    //장르를 정렬한다.
    List<Map.Entry<String, Integer>> sortedTotalCountForGenre = totalCountForGenre.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).collect(Collectors.toList());
    Iterator<Map.Entry<String, Integer>> iterator = sortedTotalCountForGenre.stream().iterator();
    List<String> sortedGenre = new ArrayList<>();
    while (iterator.hasNext()) {
      sortedGenre.add(iterator.next().getKey());
    }
    //3. 높은 장르부터 sort해서 상위 2개 곡까지 뽑는다
    //TODO 객체로 만들기?
    for (String genre : sortedGenre) {
      List<Map<Integer, Integer>> playsForIndexes = new ArrayList<>();
      for (int i = 0; i < genres.length; i++) {
        if (genres[i].equals(genre)) {
          playsForIndexes.add(Map.of(i, plays[i]));
        }
      }
      // playsForIndexes.stream().sorted((play1, play2) -> play1.entrySet().stream()
    }
    return answer;
  }
}
