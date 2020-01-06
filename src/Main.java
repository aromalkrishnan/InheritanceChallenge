public class Main {

    public static void main(String [] args )
    {//Challenge
        //start with a base class of a vehicle , then create a car class that inherits from yhe base class
        //finally create another class , a specific type of CAR THAT inherits from yhe car class

        //you shuld be able to hand steering changing gears,and moving , (Speed in other words).
        //you will want to decide where to put the appropriate state and behavuours (field and methods)
        //as mentioned above ,chaning gears, increasing/decreasing, speed shuld be incldued
        //for you specific type of vehicle you will want to add something specific for that type of car
    Outlander outlander=new Outlander(36);
    outlander.steer(45);
    outlander.accelerate(30);
    outlander.accelerate(20);
    outlander.accelerate(-30);

    }
}
