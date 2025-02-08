class NumberContainers {
     HashMap<Integer,TreeSet<Integer>>numberToIdx;
     HashMap<Integer,Integer>IdxToNumber ;
    public NumberContainers() {
        numberToIdx = new HashMap<>();
        IdxToNumber = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(IdxToNumber.containsKey(index)){
           int pre =  IdxToNumber.get(index);
            numberToIdx.get(pre).remove(index);
            if(numberToIdx.get(pre).size()==0){
                numberToIdx.remove(pre);
            }
        }
        IdxToNumber.put(index,number);
        if(!numberToIdx.containsKey(number)){
            numberToIdx.put(number, new TreeSet<>());
        }
        numberToIdx.get(number).add(index);

    }
    
    public int find(int number) {
        if(!numberToIdx.containsKey(number)){
         return -1;
        }
        return numberToIdx.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */