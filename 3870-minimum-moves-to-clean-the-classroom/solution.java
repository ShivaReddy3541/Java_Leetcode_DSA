
class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();

        int sr = 0, sc = 0, count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    sr = i;
                    sc = j;
                } else if (ch == 'L') {
                    count++;
                }
            }
        }

        int[][] id = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(id[i], -1);
        }

        int k = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (classroom[i].charAt(j) == 'L') {
                    id[i][j] = k++;
                }
            }
        }

        int target = (1 << count) - 1;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr, sc, energy, 0, 0});

        boolean[][][][] seen =
            new boolean[m][n][energy + 1][1 << count];

        seen[sr][sc][energy][0] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            int r = cur[0];
            int c = cur[1];
            int e = cur[2];
            int mask = cur[3];
            int steps = cur[4];

            if (mask == target) {
                return steps;
            }

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                if (classroom[nr].charAt(nc) == 'X' || e == 0) {
                    continue;
                }

                int ne = e - 1;
                int nm = mask;

                if (id[nr][nc] != -1) {
                    nm |= 1 << id[nr][nc];
                }

                if (classroom[nr].charAt(nc) == 'R') {
                    ne = energy;
                }

                if (!seen[nr][nc][ne][nm]) {
                    seen[nr][nc][ne][nm] = true;
                    q.offer(new int[]{nr, nc, ne, nm, steps + 1});
                }
            }
        }

        return -1;
    }
}
