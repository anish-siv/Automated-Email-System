# Automated Email Project

This simple Java application automates sending emails at a certain time for different purposes, such as notifications, reports, reminders, and alerts. It utilizes the JavaMail API to compose and send emails with the help of the Quartz Scheduler for job scheduling and Log4j for logging.

## Features

- **Automated Email Sending**: Schedule and send emails automatically at predefined intervals or times.
- **Customizable Configuration**: Easily customize sender, recipient, email content, and scheduling parameters.
- **Integration with Quartz Scheduler**: Seamlessly integrate with Quartz Scheduler for job scheduling and execution.
- **Logging**: Log important events and errors using Log4j for better monitoring and debugging.

## Installation

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/your_username/automated-email-project.git
   ```

2. Import the project into your preferred Java IDE.

3. Configure the project settings, including sender email, SMTP password, recipient email, and scheduling parameters, as needed.

## Usage

1. Configure the `EmailScheduler` class to start the email scheduling process with a desired time to schedule emails to be sent.

2. Run the `AutomatedEmails` class to send email with the desired content.
   
3. Monitor the console output for log messages regarding the email sending process.

## Configuration

- **Sender Email and SMTP Password**: Update the `username` and `password` variables in the `AutomatedEmails` class with your SMTP email credentials.
- **Recipient Email**: Specify the recipient's email address in the `to` variable in the `AutomatedEmails` class.
- **Scheduling Parameters**: Customize the scheduling parameters (e.g., frequency, timing) in the `EmailScheduler` class.

## Dependencies

- JavaMail API: for email composition and sending.
- Quartz Scheduler: for job scheduling.
- Log4j: for logging.
