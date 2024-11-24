Note: Using this project i have done the poc 
Step1: When we push the objects inot aws s3 bucket, it will sends the notification to Event Bridge
Stwp2: Event bridge trigger the rule, then it will sends the information to ECS task
Step3: Event Bridge rule create new task rather than it will update.
