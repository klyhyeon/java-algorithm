package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Booked {

  public List<String> solution(String[][] booked, String[][] unbooked) {
    List<String> answer = new ArrayList<>();
    Queue<Person> bookedPeople = new LinkedList<>();
    Queue<Person> unbookedPeople = new LinkedList<>();

    for (int i = 0; i < booked.length; i++) {
      Person bookedPerson = new Person(booked[i][0], booked[i][1]);
      bookedPeople.add(bookedPerson);
    }

    for (int i = 0; i < unbooked.length; i++) {
      Person unbookedPerson = new Person(unbooked[i][0], unbooked[i][1]);
      unbookedPeople.add(unbookedPerson);
    }

    int currentTime = 0;

    while (!(bookedPeople.isEmpty() && unbookedPeople.isEmpty())) {
      Person chosenPerson;
      if (!bookedPeople.isEmpty() && (currentTime == bookedPeople.peek().getTime()
          || bookedPeople.peek().getTime() <= unbookedPeople.peek().getTime())) {
        chosenPerson = bookedPeople.poll();
      } else {
        chosenPerson = unbookedPeople.poll();
      }
      answer.add(chosenPerson.getName());
      currentTime =+ chosenPerson.getTime() + 10;
    }

    return answer;
  }

  class Person {

    public Person(String time, String name) {
      String[] splitByColon = time.split(":");
      int parsedTime = Integer.parseInt(splitByColon[0]) * 60 + Integer.parseInt(splitByColon[1]);
      this.time = parsedTime;
      this.name = name;
    }

    int time;

    String name;

    public int getTime() {
      return this.time;
    }

    public String getName() {
      return this.name;
    }
  }
}
