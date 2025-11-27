

class MyFlow {
    public static void main(String[] args) {
        int marks = 33;
        if(marks>=90)
        {
       System.out.println("you are topper as you have scored " + marks);
        }

        if (marks>35 && marks<90)
        {
            System.out.println("you have passed the exam with "+marks+" marks");
        }
        System.out.println("your marks is :"+marks);
         if(marks<35)
        {
        System.out.println("you have scored only "+marks+" , improvement is needed");
        }
    }
}
