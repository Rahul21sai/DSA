package OOps_38_2;

public class Main {
    public static void main(String[] args) {// use wtih out creating object of the class
        // we can run main without creating any object through main by declerqaing as static
        // they belong to class not object
        Human kunal = new Human(22,"kunal",10000,false);
        Human Rahul = new Human(25,"Rahul",16000,true);

        System.out.println(kunal.population);// we can use when no object is created// dont useethis

        System.out.println(Rahul.population);// when you using static variable use
        System.out.println(Human.population);//use this than name,.poppualation
//        greeting();
         Main funn = new Main();
         funn.greeting();// i neeed a object to run so we should create a object to run the non static
         Human.message();

    }

    static void fun(){
       // greeting();//you cannot usse this because it requires an instance
        //but the function youare using it in does nto depend on instances


        // you cannot access non static stuff without referencing their instances in a static content

        // hence here i am referencing it
        Main obj = new Main(); //we need create object like this for non static content to access
        obj.greeting();
    }
    // we can use non static inside a static method

    //we know something which is not static belongs to an object
    void greeting(){
        System.out.println("hello world");
        fun();// we cna do static inside a non static one
    }
    void fun2(){
        greeting();
    }


}
