class Parents {
    Parents() {
        System.out.println("Parents class Constructor");
    }
    void parent2() {
        System.out.println("Parents class method");
    }
}

class Childs extends Parents {
    Childs() {
        super();
        System.out.println("Childs class Constructor");
    }
    void child2() {
        System.out.println("Childs class method");
    }
}

public class cars {
    public static void main(String[] args) {
        Childs obj = new Childs();
        obj.child2();
    }
}

