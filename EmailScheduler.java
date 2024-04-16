package AutomatedEmails;

import java.util.TimeZone;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class EmailScheduler {

    public static void scheduleEmailJob() {
        try {
            // Create a Quartz scheduler
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            // Define a job and tie it to the EmailJob class
            JobDetail job = JobBuilder.newJob(EmailJob.class)
                    .withIdentity("emailJob", "group1")
                    .build();

            // Create a trigger that fires every day at 6:00 PM in your time zone
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("emailTrigger", "group1")
                    .withSchedule(CronScheduleBuilder.dailyAtHourAndMinute(0, 30)
                            .inTimeZone(TimeZone.getDefault())) // Set your local time zone
                    .build();

            // Schedule the job with the trigger
            scheduler.scheduleJob(job, trigger);

            // Start the scheduler
            scheduler.start();

        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        scheduleEmailJob();
    }
}
