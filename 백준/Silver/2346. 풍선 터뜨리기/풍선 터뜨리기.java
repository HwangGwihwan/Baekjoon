import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static class Balloon {
        int index; // 풍선 번호
        int move;  // 이동할 거리

        public Balloon(int index, int move) {
            this.index = index;
            this.move = move;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Balloon> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            deque.addLast(new Balloon(i + 1, num));
        }

        StringBuilder sb = new StringBuilder();

        // 첫 풍선 터뜨림
        Balloon current = deque.pollFirst();
        sb.append(current.index).append(" ");
        int move = current.move;

        while (!deque.isEmpty()) {
            if (move > 0) {
                // 오른쪽 이동: move - 1 만큼 회전
                for (int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
                current = deque.pollFirst();
            } else {
                // 왼쪽 이동: -move 만큼 회전
                for (int i = 0; i < -move; i++) {
                    deque.addFirst(deque.pollLast());
                }
                current = deque.pollFirst();
            }

            sb.append(current.index).append(" ");
            move = current.move;
        }

        System.out.println(sb.toString().trim());
    }
}