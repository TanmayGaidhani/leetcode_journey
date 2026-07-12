class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int cop[]= Arrays.copyOf(arr,arr.length);
        Arrays.sort(cop);

        // int num = 1;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(cop[i]==arr[j]){
        //             arr[j]=num;
        //         }
        //     }
        //     num++;
        // }
        // return arr;

        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;

        for(int num:cop){
            if(!map.containsKey(num)){
                map.put(num,rank++);
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}