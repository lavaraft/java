class main {
    public static void main(String[] args) {
    
        int a = 5; 
        char b = 'i';
        long c = 400;
        double d = 3.2;

        String name ="Susan"; 
        System.out.println(name.toUpperCase());

        addExclamationPoint("hot dogs");

        animal e = new animal(); 
        String dog = e.iAmDog();
        System.out.println(dog);

    }

    public static void addExclamationPoint(String s) {
         System.out.println(s + "!");
    }
}