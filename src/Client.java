public class Client {
    public static void main(String[] argus){
        Customer c1 = new Customer();
        Address address = new Address();
        c1.setName("张三");
        c1.setAge(22);
        c1.setAddress(address);
        Customer c2 = (Customer) c1.clone();

        System.out.println("客户的地址对象是否相同?" + (c1.getAddress() == c2.getAddress()));
        System.out.println("客户对象是否相同?" + (c1 == c2));
    }




}
