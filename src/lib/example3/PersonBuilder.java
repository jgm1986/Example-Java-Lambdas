package lib.example3;

public class PersonBuilder {

    private Person person;

    public PersonBuilder(Person person) {
        this.person = person;
    }

    public static PersonBuilder createPerson() {
        return new PersonBuilder(new Person());
    }

    public PersonBuilder withName(String name) {
        person.setName(name);
        return this;
    }

    public PersonBuilder withAge(int age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder withGender(Gender gender) {
        person.setGender(gender);
        return this;
    }

    public PersonBuilder withAreaCode(int areaCode) {
        person.setAreaCode(areaCode);
        return this;
    }

    public Person build() {
        return person;
    }
}
