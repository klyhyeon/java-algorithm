package programmers.main;

import programmers.hash.PhoneBook;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        long start= System.currentTimeMillis();
        System.out.println(phoneBook.solution(new String[]{"12","123","1235","567","88"}));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
