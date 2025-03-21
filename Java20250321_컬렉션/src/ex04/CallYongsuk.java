package ex04;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CallYongsuk {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // 먼저 즉시 실행
        callYongsuk();

        // 이후 스케줄 실행
        scheduleNextRun(scheduler);
    }

    public static void scheduleNextRun(ScheduledExecutorService scheduler) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nextRun = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 15, 0, 0);

        // 이미 15시 이후라면 다음날로 스케줄링
        if (now.isAfter(nextRun)) {
            nextRun = nextRun.plusDays(1);
        }

        long delay = java.time.Duration.between(now, nextRun).toMillis();

        scheduler.schedule(() -> {
            callYongsuk();
            scheduleNextRun(scheduler); // 다음 호출 스케줄링
        }, delay, TimeUnit.MILLISECONDS);
    }

    public static void callYongsuk() {
        System.out.println("용석이를 호출합니다!");
    }
}