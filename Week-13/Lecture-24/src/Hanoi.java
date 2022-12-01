class Hanoi {
    public void towerOfHanoi(int n, char source_rod, char aux_rod, char dest_rod) {
        if (n == 0) {
            return;
        }
        
        towerOfHanoi(n - 1, source_rod, dest_rod, aux_rod);
        System.out.println("Move disk from rod " + source_rod + " to rod "+ dest_rod);
        towerOfHanoi(n - 1, aux_rod, source_rod, dest_rod);
    }
}