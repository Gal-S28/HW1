public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }
        int n = m.length;
        int[] distances = new int[m.length];
        for (int k = 0; k < n; k++) {
            distances[k] = -1;
        }
        distances[i] = 0;
        for (int step = 1; step < n; step++) {
            boolean foundNewVertex = false;

            for (int u = 0; u < n; u++) {
                if (distances[u] == step - 1) {
                    for (int v = 0; v < n; v++) {
                        if (m[u][v] == 1 && distances[v] == -1) {
                            distances[v] = step;

                            if (v == j) {
                                return step;
                            }
                            foundNewVertex = true;
                        }
                    }
                }
            }
            if (!foundNewVertex) {
                break;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}