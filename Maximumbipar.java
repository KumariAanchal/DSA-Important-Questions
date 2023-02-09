public class Maximumbipar {
    public boolean fun(int u, int [][] G, boolean [] Jobs, int [] visit){
        int N = G.length;
        int M = G[0].length;
        for(int v = 0; v< M; v++){
            if(G[u][v] == 1 && !Jobs[v]){
                Jobs[v] = true;
                if(visit[v]< 0 || fun(visit[v], G, Jobs, visit)) {
                    visit[v] = u;
                    return true;
                }
            }
        }
        return false;
    }

    public int maximumMatch(int[][] G){

        int appointedJob = 0;
        int N = G.length;
        int M = G[0].length;
        int [] visit = new int[M];
        for(int i=0; i<M; i++) visit[i] = -1;
        for(int i=0; i< N; i++){
            boolean [] Jobs = new boolean[M];
            if(fun(i, G, Jobs, visit)) appointedJob++;
        }
        return appointedJob;
    }
}
