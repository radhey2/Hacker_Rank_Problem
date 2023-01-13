import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TotalDistance {
    public static void main(String[] args) {
        List<Integer> crew_id = new ArrayList<>();
        crew_id.add(1);
        crew_id.add(3);
        crew_id.add(5);
        List<Integer> job_id = new ArrayList<>();
        job_id.add(3);
        job_id.add(5);
        job_id.add(7);
        long cost = TotalDistance.getMinCost(crew_id, job_id);
        System.out.println(cost);

    }

    public static long getMinCost(List<Integer> crew_id, List<Integer> job_id) {
        long cost = 0;
        Collections.sort(crew_id);
        Collections.sort(job_id);
        int len1 = crew_id.size();

        int len2 = job_id.size();

        if (len1 == len2) {
            for (int i = 0; i < len1; i++) {
                if (job_id.get(i) >= crew_id.get(i)) {
                    cost = cost + (job_id.get(i) - crew_id.get(i));

                }

                else if (job_id.get(i) < crew_id.get(i)) {
                    cost = cost + (crew_id.get(i) - job_id.get(i));
                }
            }
        }
        return cost;
    }
}
