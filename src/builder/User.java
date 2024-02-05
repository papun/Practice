package src.builder;

public class User {

    private final Integer empId;
    private final String empName;
    private final Double empSal;

    public User(UserBuilder builder) {
        this.empId = builder.empId;
        this.empName = builder.empName;
        this.empSal = builder.empSal;
    }

    @Override
    public String toString() {
        return "User{" + "empId=" + empId + ", empName='" + empName + '\'' + ", empSal=" + empSal + '}';
    }

    static class UserBuilder {
        private Integer empId;
        private String empName;
        private Double empSal;

        public UserBuilder setEmpId(Integer empId) {
            this.empId = empId;
            return this;
        }

        public UserBuilder setEmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public UserBuilder setEmpSal(Double empSal) {
            this.empSal = empSal;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
