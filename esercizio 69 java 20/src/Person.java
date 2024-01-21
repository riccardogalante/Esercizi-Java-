class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    // Costruttore privato, accetta un Builder come input
    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    // Getter e Setter per i campi della classe Person
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Classe Builder per la creazione di oggetti Person
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;

        // Costruttore con i campi obbligatori
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Metodi opzionali per impostare gli altri campi
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // Metodo per costruire l'oggetto Person
        public Person build() {
            return new Person(this);
        }
    }

    // Metodo toString per visualizzare i dettagli dell'oggetto Person
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}