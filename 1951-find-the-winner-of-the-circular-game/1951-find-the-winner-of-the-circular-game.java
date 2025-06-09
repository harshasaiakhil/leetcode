class Solution {
    public int findTheWinner(int n, int k) {
        //queue using linked list
        Queue<Integer> q = new LinkedList<>(); 
        for(int i = 1 ; i <= n ; i++) q.add(i);

        while(q.size() > 1){
           for(int i = 1 ; i < k ; i++) q.add(q.poll());
           q.poll();
        }
        return q.poll();
    }
/*
        ArrayList<Integer> circle = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            circle.add(i);
        }
        int cur_ind = 0;

        while(circle.size() > 1){
            int next_to_remove = (cur_ind + k - 1) % circle.size();
            circle.remove(next_to_remove);
            cur_ind = next_to_remove;
        }
        return circle.get(0);
    }*/
}