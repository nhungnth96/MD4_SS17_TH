package ss16.th.service;



public class CustomerServiceFactory {
//    Private để đảm bảo rằng class lớp khác không thể truy cập vào
//    constructor và tạo ra instance mới
    private static IGenericService singleton;

    public static synchronized IGenericService getInstance() {
        if (singleton == null) {
            singleton = new CustomerService();
        }
        return singleton;
    }
}
