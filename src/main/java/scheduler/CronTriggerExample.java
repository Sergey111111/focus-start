package scheduler;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class CronTriggerExample {


    public static void main(String[] args) {
        try {

            JobDetail job = newJob(Job.class)
                    .withIdentity("job1", "group1")
                    .build();

            Trigger trigger = newTrigger()
                    .withIdentity("Trigger1", "group1")
                    .withSchedule(CronScheduleBuilder.cronSchedule("0/5 0/1 * 1/1 * ? *"))
                    .build();
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();
            scheduler.scheduleJob(job, trigger);

//this method stops scheduler
//             scheduler.shutdown();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        System.out.println("Trigged...");
    }

}
