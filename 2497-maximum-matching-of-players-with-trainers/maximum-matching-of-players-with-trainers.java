class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int playerAbility = 0;
        int trainerAbility = 0;
        int count = 0;


        while(playerAbility < players.length && trainerAbility < trainers.length){
            if(players[playerAbility] <= trainers[trainerAbility]){
                count++;
                playerAbility++;
                trainerAbility++;
            }else{
                trainerAbility++;
            }
        }

        return count;
    }
}


