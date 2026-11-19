class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int size = deck.length;

        // sort
        Arrays.sort(deck); // 2 3 5 7 11 13 17

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<size;i++){
            queue.offer(i);
        }

        int [] result = new int[size];

        for(int card : deck){
            // reveal the top card and remove from the deck
            int index = queue.poll();

            result[index] = card;

            // step 2:
            if(!queue.isEmpty()){
                queue.offer(queue.poll());
            }

        }

        return result;
    }
}