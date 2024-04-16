package AutomatedEmails;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class EmailJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // Call the sendEmail method when the job is executed
        AutomatedEmails.sendEmail();
    }
}

