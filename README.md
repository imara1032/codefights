# codefights 
You have some tasks in your Asana account. For each ith of them you know its deadlinesi, which is the last day by which it should be completed. As you can see in your calendar, today is the day number day. Asana labels each task in accordance with its due date:

If the task is due today or it's already overdue, it is labeled as Today;
If the task should be completed within a week (but not today), i.e. its deadline is somewhere between day + 1 and day + 7 both inclusive, it is labeled as Upcoming;
All other tasks are labeled as Later;
Your goal is to find the number of tasks with each label and return it as an array of format [Today, Upcoming, Later], where Today, Upcoming and Later is the number of tasks with the corresponding label.