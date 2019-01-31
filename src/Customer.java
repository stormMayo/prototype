public class Customer implements AbstractCustomer{
    private Address address;
    private String name;
    private int age;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public AbstractCustomer clone() {
        AbstractCustomer customer = null;
        try {
            customer = (AbstractCustomer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public void display() {
        System.out.println(name+"-----"+age+"-----"+address);

    }
}
