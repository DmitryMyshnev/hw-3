class ATM{
    public int countBanknotes(int sum){
        int result = 0;
        int[] bancnotes = {500,200,100,50,20,10,5,2,1};
        int count = 0;
        while (true){
            if(sum - bancnotes[count] >= 0){
                sum -= bancnotes[count];
                result++;
                if(sum == 0)
                    break;
            }
            else  count++;
        }
        return result;
    }
}
