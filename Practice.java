

class Practice {
    String name = "Saad";
    int age = 20;

    public Practice(String name, int age){
        this.name = name;
        this.age = age;
    }

}

class InnerPractice {
    public static void main(String[] args) {

        Practice p = new Practice("Saad", 20);
        Practice v = new Practice("Osama", 21);
        Practice b = new Practice("Taha", 20);

        System.out.println("Name is "+p.name +" Age is "+p.age);
        System.out.println("Name is "+v.name +" Age is "+v.age);
        System.out.println("Name is "+b.name +" Age is "+b.age);




        // Practice n = new Practice();
        // Practice v = new Practice(); 
        // System.out.println(n.name);
        // System.out.println(n.age);

        // System.out.println(v.age);
        // System.out.println(v.name);



    }

}
