interface Animal2 {
    void Aliphant();
}

class ali implements Animal2 {
    public void Aliphant() {
        System.out.println("aliphant");
    }
}

class interface2 {
    public static void aliphant() {
        System.out.println("elephant--- main class");
    }

    public static void main(String[] args) {
        ali aak = new ali();
        aak.Aliphant();
        aliphant();

    }
}
