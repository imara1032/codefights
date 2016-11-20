public class problem2{

     public static void main(String []args){
         String[] names={"John", "Martin", "Luke"};
         boolean[] statuses={false, true, false};
         int[] projects={1, 0, 2};
         int[] tasks={2, 0, 1};
         
        System.out.println(smartAssigning(names, statuses, projects,tasks));
     }
     static String smartAssigning(String[] names, boolean[] statuses, int[] projects, int[] tasks) {
         String ideal_person=names[0];
         int position=0;
         for(int i=0; i<statuses.length; i++){
             if(!statuses[i]){
                 if( tasks[position]>tasks[i]){ 
                     position=i;
                     
                 } 
                     if(tasks[position]==tasks[i]){
                         if(projects[position]>=projects[i]){
                             position=i;
                         }
                     }
                 
                 
                 
                 
             }
         }
        return names[position];
}
}
