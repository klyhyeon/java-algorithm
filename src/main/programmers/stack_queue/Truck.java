package programmers.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridgeCapacity = new LinkedList<>();
        int answer = bridge_length;
        int currentBridgeWeight = 0;
        for (int truckWeight : truck_weights) {
            while (true) {
                if (bridgeCapacity.isEmpty()) {
                    bridgeCapacity.add(truckWeight);
                    currentBridgeWeight += truckWeight;
                    answer++;
                    break;
                } else if (bridgeCapacity.size() == bridge_length) {
                    currentBridgeWeight -= bridgeCapacity.poll();
                } else {
                    if (currentBridgeWeight + truckWeight > weight) {
                        bridgeCapacity.add(0);
                        answer++;
                    } else {
                        bridgeCapacity.add(truckWeight);
                        currentBridgeWeight += truckWeight;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }

//    public int solution(int bridge_length, int weight, int[] truck_weights) {
//        Queue<Integer> trucks = new LinkedList<>();
//        for (int truck : truck_weights) {
//            trucks.add(truck);
//        }
//        int answer = 1;
//        int currentBridgeWeight = 0;
//        int truckSize = truck_weights.length;
//        while (truckSize > 0) {
//            currentBridgeWeight += trucks.peek();
//            if (currentBridgeWeight > weight) {
//                answer += bridge_length;
//                currentBridgeWeight = trucks.poll();
//                truckSize--;
//            } else {
//                if (trucks.size() == truck_weights.length) {
//                    answer += bridge_length;
//                    trucks.poll();
//                    truckSize--;
//                } else {
//                    trucks.poll();
//                    truckSize--;
//                    answer++;
//                }
//            }
//
//        }
//        return answer;
//    }
}
