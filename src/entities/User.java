package entities;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private Account account;

    private User(Long id, String firstName, String lastName, Account account) {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public static final class UserBuilder {
        private Long id;
        private String firstName;
        private String lastName;
        private Account account;

        public UserBuilder() {
        }

        public UserBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            User user = new User(id, firstName, lastName, account);
            return user;
        }
    }

}
