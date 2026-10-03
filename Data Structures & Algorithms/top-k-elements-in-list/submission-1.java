class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //Min Heap creation....
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));
       
       // Adding key into PQ.... after reaching k lowest freq polled....
        for(int num: map.keySet()){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }

        //Poll the answers....
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }
}
