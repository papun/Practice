package src.revision;

public class Client {
    public static void main(String[] args) {
        User user = new User.UserBuilder().setId(1).setName("pp").setEmail("jhjhj").build();
        System.out.println(user.getEmail());
    }
}


class User {
    private final Integer id;
    private final String name;
    private final String email;

    public User(UserBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    static class UserBuilder {
        private Integer id;
        private String name;
        private String email;

        public UserBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
