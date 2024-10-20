class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int len = gas.length;
        int diff[] = new int[len];
        int total_cost = 0;
        for(int i = 0; i < len; i++){
            diff[i] = gas[i] - cost[i];
            total_cost = total_cost + diff[i];
        }
        if(total_cost < 0){
            return -1;
        }
        for(int i = 0; i < len;){
            int start_ind = i;
            if(diff[i]<0){
                i++;
                continue;
            }
            int fuel = 0;
            for(int j = 0; j < len; j++){
                int temp = (i+j)% len;
                fuel = fuel + diff[temp];
                if(fuel < 0){
                    i = temp;
                    break;
                }
            }
            if(fuel >= 0){
                return start_ind;
            }

        }
        return -1;
    }
}

